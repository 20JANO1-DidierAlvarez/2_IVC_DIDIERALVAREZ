Inicio
    Entero: fila, colum, mayor, fila_mayor, colum_mayor
    mayor = matriz(1,1)
    fila_mayor = 1
    colum_mayor = 1

    For fila = 1 to 4
        For colum = 1 to 4
            If matriz(fila, colum) > mayor Then
                mayor = matriz(fila, colum)
                fila_mayor = fila
                colum_mayor = colum
            End If
        Next colum
    Next fila
    Imprimir "El mayor es ", mayor
    Imprimir "Fila: ", fila_mayor, " Columna: ", colum_mayor
Fin