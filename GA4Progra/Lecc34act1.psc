Algoritmo DecimalYBinario
    Definir numDec, numTemp Como Entero
    Definir binario Como Caracter
    
    // Decimal a Binario
    Escribir "Ingrese un número decimal para convertir a binario:"
    Leer numDec
    numTemp <- numDec
    binario <- ""
    
    Mientras numTemp > 0 Hacer
        Si numTemp MOD 2 == 0 Entonces
            binario <- "0" + binario
        Sino
            binario <- "1" + binario
        FinSi
        numTemp <- trunc(numTemp / 2)
    FinMientras
    Escribir "En binario es: ", binario
    
    // Binario a Decimal (Versión básica manual)
    Definir binStr Como Caracter
    Definir i, dec, potencia Como Entero
    Escribir "Ingrese un número binario (1s y 0s):"
    Leer binStr
    
    dec <- 0
    potencia <- 1
    Para i <- Longitud(binStr) Hasta 1 Con Paso -1 Hacer
        Si Subcadena(binStr, i, i) == "1" Entonces
            dec <- dec + potencia
        FinSi
        potencia <- potencia * 2
    FinPara
    Escribir "En decimal es: ", dec
FinAlgoritmo