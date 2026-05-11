// Ejercicio 20 - Venta de boletos feria
Algoritmo VentaBoletos
	Definir opcion, totalBoletos, totalDinero Como Entero
	totalBoletos <- 0
	totalDinero <- 0
	Definir continuar Como Caracter
	
	Repetir
		Escribir "1 - Niño ($10) | 2 - Adulto ($15)"
		Escribir "Ingrese tipo de boleto:"
		Leer opcion
		
		Si opcion = 1 Entonces
			totalBoletos <- totalBoletos + 1
			totalDinero <- totalDinero + 10
		SiNo
			Si opcion = 2 Entonces
				totalBoletos <- totalBoletos + 1
				totalDinero <- totalDinero + 15
			SiNo
				Escribir "Opción inválida"
			Fin Si
		Fin Si
		
		Escribir "Boletos vendidos: ", totalBoletos
		Escribir "Total acumulado: $", totalDinero
		
		Escribir "¿Vender otro? (S/N):"
		Leer continuar
	Hasta Que continuar = 'N' o continuar = 'n'
	
Fin Algoritmo