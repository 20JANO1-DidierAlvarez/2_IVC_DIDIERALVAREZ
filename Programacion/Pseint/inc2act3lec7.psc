Algoritmo Triangulo
	Definir a, b, c Como Entero
	Leer a, b, c
	
	Si a = b Y b = c Entonces
		Escribir "Equilatero"
	SiNo
		Si a = b O a = c O b = c Entonces
			Escribir "Isosceles"
		SiNo
			Escribir "Escaleno"
		FinSi
	FinSi
FinAlgoritmo