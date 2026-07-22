Algoritmo AgendaTelefonica
    Dimension nombres[10], telefonos[10]
    Definir i, pos Como Entero
    
    Para i<-1 Hasta 10 Hacer
        Escribir "Persona ", i, ":"
        Escribir "Nombre:"
        Leer nombres[i]
        Escribir "Teléfono:"
        Leer telefonos[i]
    FinPara
    
    Escribir "Ingrese posición a consultar (1 al 10):"
    Leer pos
    
    Si pos >= 1 Y pos <= 10 Entonces
        Escribir "Nombre: ", nombres[pos], " - Teléfono: ", telefonos[pos]
    Sino
        Escribir "Posición inválida."
    FinSi
FinAlgoritmo