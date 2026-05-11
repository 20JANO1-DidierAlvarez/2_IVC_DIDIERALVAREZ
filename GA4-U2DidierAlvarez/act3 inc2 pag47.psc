Algoritmo act3inc2pag47
    Escribir "Ingrese un número entero para verificar si es primo:"
    Leer num
    divisor = 2
    es_primo = Verdadero
    Si num < 2 Entonces
        es_primo = Falso
    Fin Si
    Mientras divisor < num Hacer
        Si num % divisor == 0 Entonces
            es_primo = Falso
        Fin Si
        divisor = divisor + 1
    Fin Mientras
    Si es_primo == Verdadero Entonces
        Escribir "El número es primo."
    Sino
        Escribir "El número no es primo."
    Fin Si

	
FinAlgoritmo
