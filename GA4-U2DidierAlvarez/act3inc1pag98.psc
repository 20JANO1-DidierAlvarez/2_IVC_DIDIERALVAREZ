// Ejercicio 3 - Sumar primos del 1 al 50
Algoritmo SumarPrimos1a50
	Definir numero, divisor, acumulador, esPrimo Como Entero
	acumulador <- 0 // Variable acumuladora, empieza en 0
	
	Para numero <- 2 Hasta 50 Hacer  // El 1 NO es primo
		esPrimo <- 1  // Suponemos que SÍ es primo
		Para divisor <- 2 Hasta numero - 1 Hacer
			Si numero MOD divisor = 0 Entonces
				esPrimo <- 0 // Tiene otro divisor, NO es primo
				Romper        // Salir del ciclo interno
			Fin Si
		Fin Para
		
		Si esPrimo = 1 Entonces
			acumulador <- acumulador + numero // Acumulamos el valor
		Fin Si
	Fin Para
	
	Escribir "La suma de todos los números primos entre 1 y 50 es: ", acumulador
	
Fin Algoritmo