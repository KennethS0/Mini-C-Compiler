funcion1D:
	While_Label0:
		mov ax, 2
		mov bx, 1
		cmp ax, bx
		jne Exit_Label0
jmp While_Label0 ;CONTINUE
	While_Label1:
		mov ax, 3
		mov bx, 1
		cmp ax, bx
		jne Exit_Label1
jmp Exit_Label1 ;BREAK
		jmp While_Label1
	Exit_Label1:
		jmp While_Label0
	Exit_Label0:
