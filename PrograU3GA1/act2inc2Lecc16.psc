Algoritmo BuscarMayor
    Definir numeros, i, mayor, posicion Como Entero
    Dimension numeros[8]
    
    // Leer y almacenar los datos
    Para i <- 1 Hasta 8 Con Paso 1 Hacer
        Escribir "Ingrese el numero ", i, ":"
        Leer numeros[i]
    FinPara
    
    // Suponemos que el primero es el mayor para empezar a comparar
    mayor <- numeros[1]
    posicion <- 1
    
    // Comparar con el resto de los elementos
    Para i <- 2 Hasta 8 Con Paso 1 Hacer
        Si numeros[i] > mayor Entonces
            mayor <- numeros[i]
            posicion <- i
        FinSi
    FinPara
    
    Escribir "El numero mayor del arreglo es: ", mayor
    Escribir "Se encuentra en la posicion: ", posicion
FinAlgoritmo