	While_Label0:
		mov ax, 1
		mov bx, 1
		cmp ax, bx
		jne Exit_Label0
jmp While_Label0
		jmp While_Label0
	Exit_Label0:
	mov ax, 1
	mov [jaja], ax

