Algoritmo act1inc1pag48
    cajones_libres = 200
    
        Escribir "Cajones disponibles actualmente: ", cajones_libres
        Escribir "¿Ingresó un vehículo? (Escriba 1 para SI, 0 para NO):"
        Leer ingreso
        Si ingreso == 1 Entonces
            cajones_libres = cajones_libres - 1
        Fin Si
		Mientras cajones_libres > 0
			Escribir "Ya no hay cajones libres. Estacionamiento lleno."
		FinMientras
		
		
FinAlgoritmo
