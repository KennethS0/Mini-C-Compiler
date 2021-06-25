section .bss
	ch1 resb 4
	ch resb 4
	mono2 resb 4
	mono resb 4

section .text
	mov ax, 10
	mov [mono], ax

	mov ax, 3
	mov [ch], ax

	mov ax, [mono]
	mov bx, 8
	div bx
	mov [mono2], dx
