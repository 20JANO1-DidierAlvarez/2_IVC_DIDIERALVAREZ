Inicio
    Entero: fila, colum, suma
    For fila = 1 to 4
        suma = 0 
        For colum = 1 to 3
            suma = suma + matriz(fila, colum)
        Next colum
        Imprimir "Suma de fila ", fila, " es: ", suma
    Next fila
Fin