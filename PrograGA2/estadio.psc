Proceso Estadio
	Definir sector, cantidad Como Entero
	Definir precio, total Como Real
	
	Escribir "1. Palco (300)"
	Escribir "2. Tribuna (120)"
	Escribir "3. Preferencia (60)"
	Escribir "4. Generales (40)"
	Leer sector
	
	Escribir "Ingrese cantidad de entradas:"
	Leer cantidad
	
	Segun sector Hacer
		1: precio <- 300
		2: precio <- 120
		3: precio <- 60
		4: precio <- 40
		De Otro Modo:
			Escribir "Sector inválido"
			precio <- 0
	FinSegun
	
	total <- precio * cantidad
	Escribir "Total a pagar: Q", total
FinProceso