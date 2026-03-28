Algoritmo Estacion
	Definir dia, mes Como Entero
	Leer dia, mes
	
	Si mes = 12 O mes = 1 O mes = 2 Entonces
		Escribir "Invierno"
	SiNo
		Si mes >= 3 Y mes <= 5 Entonces
			Escribir "Primavera"
		SiNo
			Si mes >= 6 Y mes <= 8 Entonces
				Escribir "Verano"
			SiNo
				Escribir "Otoño"
			FinSi
		FinSi
	FinSi
FinAlgoritmo