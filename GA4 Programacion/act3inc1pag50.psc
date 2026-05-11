Algoritmo act3inc1pag50
     suma = 0
    n = 2
        // Verificación de si 'n' es primo
	Si es_primo = Verdadero
	FinSi
	
        j = 2
        Mientras j < n Hacer
            Si n % j == 0 Entonces
                es_primo = Falso
            Fin Si
            j = j + 1
        Fin Mientras
        Si es_primo == Verdadero Entonces
            suma = suma + n
        Fin Si
        n = n + 1
		Mientras n <= 22
			Escribir "La suma de los números primos entre 1 y 22 es: ", suma
		FinMientras
		
	
FinAlgoritmo
