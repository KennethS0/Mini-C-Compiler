section .bss
	ch1 resb 4
	ch2 resb 4
	mono2 resb 4
	mono resb 4
	aja resb 1
	mov ax, 10
	mov [ch2], ax

	While_Label0:
		mov ax, 3
		mov bx, [ch2]
		cmp ax, bx
		jne Exit_Label0
	While_Label1:
		mov ax, 3
		mov bx, 5
		cmp ax, bx
		jge Exit_Label1
	mov ax, 2
	mov [mono], ax

		jmp While_Label1
	Exit_Label1:
		jmp While_Label0
	Exit_Label0:
;IF
	mov ax, 4
	mov bx, 3
	cmp ax, bx
	jle else_2
	mov ax, 3
	mov [mono2], ax

	jmp exit_if_2
else_2:
;IF
	mov ax, 2
	mov bx, 1
	cmp ax, bx
	jle else_3
	mov ax, 4
	mov [mono2], ax

	jmp exit_if_3
else_3:
	mov ax, 5
	mov [mono2], ax

	jmp exit_if_3
exit_if_3:
