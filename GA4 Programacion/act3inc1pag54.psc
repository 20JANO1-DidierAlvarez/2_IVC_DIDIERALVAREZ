// Ejercicio 15 - Sumar hasta ingresar 9
Algoritmo SumarHastaNueve
	Definir numero, suma Como Entero
	suma <- 0
	
	Escribir "Ingrese números, termine con el 9"
	
	Repetir
		Escribir "Ingrese un número:"
		Leer numero
		
		// Solo sumamos si NO es 9
		Si numero <> 9 Entonces
			suma <- suma + numero
		Fin Si
	Hasta Que numero = 9
	
	Escribir "La suma total es: ", suma
	
Fin Algoritmo