Proceso TipoCaracter
	Definir c Como Caracter
	
	Escribir "Ingrese un carácter:"
	Leer c
	
	Segun c Hacer
		"a","e","i","o","u","A","E","I","O","U":
			Escribir "Es vocal"
		"0","1","2","3","4","5","6","7","8","9":
			Escribir "Es dígito"
		De Otro Modo:
			Escribir "Es otro carácter"
	FinSegun
FinProceso