; Temperature Checker Program

.386
.model flat, stdcall
.stack 4096
ExitProcess proto dWExitCode : dword

.data
; Initial temperature value in Fahrenheit
fahrenheitTemp real4 100.0
; Cutoff value in Celsius
cutoff          real4 37.5
; Storage for the Celsius temperature after conversion
celsiusTemp     real4 ?
; Result (1 for exceeding, 0 otherwise)
result          DWORD ?

; Constants for conversion
convertFactor   real4 0.555556  ; 5/9
subtractionFactor real4 32.0   ; 32.0

.code
main proc
    finit                    ; Initialize the FPU

    ; Convert Fahrenheit to Celsius
    fld fahrenheitTemp       ; Load Fahrenheit temperature onto the FPU stack
    fld dword ptr [subtractionFactor] ; Load constant 32.0 onto the FPU stack
    fsub                    ; ST(0) = Fahrenheit - 32.0
    fld dword ptr [convertFactor] ; Load constant 5/9 onto the FPU stack
    fmul                    ; ST(0) = (Fahrenheit - 32.0) * 5/9
    fstp celsiusTemp        ; Store the result in celsiusTemp

    ; Compare converted Celsius temperature with the cutoff value
    fld celsiusTemp         ; Load Celsius temperature onto the FPU stack
    fld cutoff              ; Load cutoff value onto the FPU stack
    fcompp                 ; Compare ST(0) (celsiusTemp) with ST(1) (cutoff)
    fstsw ax               ; Store FPU status word in AX
    sahf                   ; Store AH into flags

    jae above_cutoff       ; Jump if CelsiusTemp >= cutoff

    ; Temperature does not exceed cutoff
    mov result, 1          ; Set result to 1 (temperature exceeds cutoff)
    jmp end_program        ; Jump to end of program

above_cutoff:
    ; Temperature exceeds cutoff
    mov result, 0          ; Set result to 0 (temperature does not exceed cutoff)

end_program:
    ; Exit the program
    invoke ExitProcess, 0  ; Call Windows API to exit

main endp
end main
