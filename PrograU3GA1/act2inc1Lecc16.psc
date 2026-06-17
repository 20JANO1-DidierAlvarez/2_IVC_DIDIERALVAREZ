Algoritmo MayoresDeEdad
    Definir edades, i, contadoromoMayor Como Entero
    Dimension edades[7]
    contadoromoMayor <- 0
    
    // Leer y almacenar los datos
    Para i <- 1 Hasta 7 Con Paso 1 Hacer
        Escribir "Ingrese la edad de la persona ", i, ":"
        Leer edades[i]
    FinPara
    
    // Validar cuántos son mayores de edad
    Para i <- 1 Hasta 7 Con Paso 1 Hacer
        Si edades[i] >= 18 Entonces
            contadoromoMayor <- contadoromoMayor + 1
        FinSi
    FinPara
    
    Escribir "La cantidad de personas mayores de edad es: ", contadoromoMayor
FinAlgoritmo