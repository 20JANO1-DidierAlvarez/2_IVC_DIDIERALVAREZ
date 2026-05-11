// Ejercicio 18 - Múltiplos de 7, suma y pares
Algoritmo MultiplosSiete
	Definir i, multiplo, suma, pares Como Entero
	suma <- 0
	pares <- 0
	
	Para i <- 1 Hasta 20 Hacer
		multiplo <- 7 * i
		suma <- suma + multiplo
		
		Si multiplo MOD 2 = 0 Entonces
			pares <- pares + 1
		Fin Si
	Fin Para
	
	Escribir "Suma total: ", suma
	Escribir "Cantidad de números pares: ", pares
	
Fin Algoritmo