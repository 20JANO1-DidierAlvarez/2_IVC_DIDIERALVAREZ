// Ejercicio 19 - Del 300 al 1: primos y suma pares
Algoritmo ContarPrimosYSumarPares
	Definir numero, contadorPrimos, sumaPares, i, esPrimo Como Entero
	contadorPrimos <- 0
	sumaPares <- 0
	
	Para numero <- 300 Hasta 1 Con Paso -1 Hacer
		// Ver si es par
		Si numero MOD 2 = 0 Entonces
			sumaPares <- sumaPares + numero
		Fin Si
		
		// Ver si es primo
		esPrimo <- 1 // Suponemos que sí
		Si numero > 1 Entonces
			Para i <- 2 Hasta numero - 1 Hacer
				Si numero MOD i = 0 Entonces
					esPrimo <- 0 // Ya no es primo
					Romper
				Fin Si
			Fin Para
			
			Si esPrimo = 1 Entonces
				contadorPrimos <- contadorPrimos + 1
			Fin Si
		Fin Si
	Fin Para
	
	Escribir "Cantidad de números primos: ", contadorPrimos
	Escribir "Suma de números pares: ", sumaPares
	
Fin Algoritmo