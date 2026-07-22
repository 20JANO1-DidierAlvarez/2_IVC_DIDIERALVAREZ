Algoritmo FraseInvertida
    Definir frase, invertida Como Caracter
    Definir i Como Entero
    
    Escribir "Ingrese una frase:"
    Leer frase
    invertida <- ""
    
    Para i <- Longitud(frase) Hasta 1 Con Paso -1 Hacer
        invertida <- invertida + Subcadena(frase, i, i)
    FinPara
    
    Escribir "La frase invertida es: ", invertida
FinAlgoritmo