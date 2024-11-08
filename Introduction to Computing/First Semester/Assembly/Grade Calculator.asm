; Grade Computation Program Using Floating Point Numbers


.386

.model flat, stdcall

.stack 4096

ExitProcess proto dWExitCode : dword


.data

score        real4 76.0

items        real4 100.0

constant     real4 100.0

base         real4 40.0

graderesult  real4 ?

passing      DWORD 1

failing      DWORD 0

cutoff       real4 75.00

result       DWORD ?


.code

main proc


     mov EBX,passing  ; Assume Passing Grade

     mov result, EBX   ;

     

     finit            ; Initialize FPU

     fld constant     ; Load constant of  100 onto FPU stack(accumulator)

     fsub base        ; subtract the constant by the base

     fmul score       ; multiply the score

     fdiv items       ; divide by items

     fadd base        ; add the base


     fstp graderesult ; Store the result in memory

     

     fld graderesult    ; load  the grade result to the FPU stack (accumulator)

     fcom cutoff           ; compare the FPU stack (accumulator) to the cut off

     fstsw ax                  ; load the FPU flags to the AX register

     sahf                           ; save the upper half of AX (Ah) to the ALU Flags register    

     jae finish              ;  jump if the grade is greater than the cut off based on the  FPU flags transferred to the ALU

     


     mov EBX,failing  ;  correct grade passing assumption

     mov result,ebx


   finish:


; Exit the program


invoke ExitProcess, 0; Call Windows API to exit


main endp

end main