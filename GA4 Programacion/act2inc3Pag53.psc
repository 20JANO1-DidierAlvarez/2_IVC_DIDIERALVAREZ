// Ejercicio 14 - Múltiplos de 4 entre dos valores
Algoritmo MultiplosDeCuatro
	Definir num1, num2, menor, mayor, i Como Entero
	
	// Pedir datos al usuario
	Escribir "Ingrese el primer número:"
	Leer num1
	Escribir "Ingrese el segundo número:"
	Leer num2
	
	// Definir cuál es el menor y cuál el mayor
	Si num1 < num2 Entonces
		menor <- num1
		mayor <- num2
	SiNo
		menor <- num2
		mayor <- num1
	Fin Si
	
	// Recorrer y mostrar múltiplos de 4
	Para i <- menor Hasta mayor Hacer
		Si i MOD 4 = 0 Entonces
			Escribir i
		Fin Si
	Fin Para
	
Fin Algoritmo
