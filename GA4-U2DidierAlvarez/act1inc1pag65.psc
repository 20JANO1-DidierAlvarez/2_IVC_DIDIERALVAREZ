// Ejercicio 17 - Contar billetes de $100
Algoritmo ContarBilletes
	Definir billete, cantidad, total Como Entero
	cantidad <- 0
	total <- 0
	Definir seguir Como Caracter
	
	Escribir "Ingrese las denominaciones de los billetes ($20, $50, $100)"
	Escribir "Escribir 'N' para terminar"
	
	Repetir
		Escribir "Ingrese valor del billete:"
		Leer billete
		
		Si billete = 100 Entonces
			cantidad <- cantidad + 1
			total <- total + 100
		Fin Si
		
		Escribir "¿Ingresar otro? (S/N):"
		Leer seguir
	Hasta Que seguir = 'N' o seguir = 'n'
	
	Escribir "Cantidad de billetes de $100: ", cantidad
	Escribir "Total dinero en billetes de $100: $", total
	
Fin Algoritmo