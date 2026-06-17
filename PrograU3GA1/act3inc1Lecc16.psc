Algoritmo VerificarRepetido
    Definir lista, i, j Como Entero
    Definir tieneRepetido Como Logico
    Dimension lista[15]
    
    // Leer y almacenar los datos
    Para i <- 1 Hasta 15 Con Paso 1 Hacer
        Escribir "Ingrese el numero ", i, ":"
        Leer lista[i]
    FinPara
    
    tieneRepetido <- Falso
    
    // Comparar cada número con los que le siguen
    Para i <- 1 Hasta 14 Con Paso 1 Hacer
        Para j <- i + 1 Hasta 15 Con Paso 1 Hacer
            Si lista[i] = lista[j] Entonces
                tieneRepetido <- Verdadero
            FinSi
        FinPara
    FinPara
    
    // Mostrar resultado
    Si tieneRepetido = Verdadero Entonces
        Escribir "Si existe al menos un numero repetido."
    Sino
        Escribir "No hay numeros repetidos."
    FinSi
FinAlgoritmo