Inicio
    Entero: fila, colum
    Entero: tabla(4,4)
    For fila = 1 to 4
        For colum = 1 to 4
            If fila = colum Then
                tabla(fila, colum) = 1
            Else
                tabla(fila, colum) = 0
            End If
        Next colum
    Next fila
Fin