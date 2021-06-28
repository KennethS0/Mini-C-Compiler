section .bss
	ch1 resb 4
	ch2 resb 4
	mono2 resb 4
	mono resb 4
	aja resb 1
;IF
	mov ax, 4
	mov bx, 3
	cmp ax, bx
	jle else_0
	mov ax, 3
	mov [mono2], ax

	jmp exit_if_0
else_0:
;IF
	mov ax, 1
	mov bx, 1
	cmp ax, bx
	jne else_1
	mov ax, 46
	mov [ch2], ax
	jmp exit_if_1
else_1:
;IF
	mov ax, 2
	mov bx, [mono]
	cmp ax, bx
	jne else_2
	mov ax, 1300
	mov [ch1], ax

	jmp exit_if_2
else_2:
	mov ax, 'a'
	mov [aja], ax

	jmp exit_if_2
exit_if_2:
exit_if_1:
exit_if_0:
