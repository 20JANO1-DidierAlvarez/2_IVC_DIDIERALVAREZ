Proceso Conversor
	Definir valor Como Real
	Definir op Como Entero
	
	Escribir "Ingrese valor:"
	Leer valor
	
	Escribir "1. Metros a pies"
	Escribir "2. Metros a cm"
	Escribir "3. Metros a pulgadas"
	Leer op
	
	Segun op Hacer
		1: Escribir valor * 3.28
		2: Escribir valor * 100
		3: Escribir valor * 39.37
		De Otro Modo:
			Escribir "Opción inválida"
	FinSegun
FinProceso