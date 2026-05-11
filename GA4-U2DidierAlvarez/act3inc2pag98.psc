// Ejercicio 4 - Cuenta regresiva y suma
Algoritmo CuentaRegresivaYSuma
	Definir numero, suma Como Entero
	suma <- 0
	
	Escribir "Ingrese un número entero mayor que 1:"
	Leer numero
	
	Escribir "=== Cuenta Regresiva ==="
	Para i <- numero Hasta 1 Con Paso -1 Hacer
		Escribir i
		suma <- suma + i // Vamos sumando cada número
	Fin Para
	
	Escribir "La suma total de todos estos números es: ", suma
	
Fin Algoritmo