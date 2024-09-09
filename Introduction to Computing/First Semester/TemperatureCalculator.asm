; Temperature Checker Program

.386
.model flat, stdcall
.stack 4096
ExitProcess proto dWExitCode : dword

.data
temperature    real4 34.0        ; Initial temperature value
cutoff          real4 37.5        ; Temperature cutoff value
result          DWORD ?          ; Result (1 for exceeding, 0 otherwise)

.code
main proc
    finit                    ; Initialize FPU

    fld temperature          ; Load the temperature onto the FPU stack
    fld cutoff               ; Load the cutoff value onto the FPU stack
    fcompp                  ; Compare the two values (temperature and cutoff)
    fstsw ax                ; Store FPU status word in AX
    sahf                    ; Store AH into flags for comparison
    
    jae above_cutoff         ; Jump if above or equal to cutoff (temperature exceeds 37.5)
    
    mov result, 1            ; Set result to 1 (temperature exceeds cutoff)
    jmp end_program          ; Jump to end of program

above_cutoff:
    mov result, 0            ; Set result to 1 (temperature does not exceed cutoff)

end_program:
    ; Exit the program
    invoke ExitProcess, 0   ; Call Windows API to exit

main endp
end main
