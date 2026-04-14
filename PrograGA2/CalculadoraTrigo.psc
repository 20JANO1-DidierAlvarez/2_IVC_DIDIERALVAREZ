Proceso Trigonometria
	Definir angulo, rad Como Real
	Definir op Como Entero
	
	Escribir "Ingrese un ángulo en grados:"
	Leer angulo
	
	rad <- angulo * PI / 180
	
	Escribir "1. Seno"
	Escribir "2. Coseno"
	Escribir "3. Tangente"
	Leer op
	
	Segun op Hacer
		1:
			Escribir "Seno: ", Sen(rad)
		2:
			Escribir "Coseno: ", Cos(rad)
		3:
			Escribir "Tangente: ", Tan(rad)
		De Otro Modo:
			Escribir "Opción inválida"
	FinSegun
FinProceso