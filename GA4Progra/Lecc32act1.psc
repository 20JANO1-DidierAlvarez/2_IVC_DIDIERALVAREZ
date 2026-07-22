Algoritmo ConversionesMetros
    Definir m, opc Como Real
    Escribir "Ingrese la cantidad en metros:"
    Leer m
    Escribir "Seleccione la opción de conversión:"
    Escribir "1. Milímetros"
    Escribir "2. Centímetros"
    Escribir "3. Decímetros"
    Escribir "4. Hectómetros"
    Escribir "5. Kilómetros"
    Leer opc
    
    Segun opc Hacer
        1: Escribir m, " metros equivale a ", m * 1000, " milímetros."
        2: Escribir m, " metros equivale a ", m * 100, " centímetros."
        3: Escribir m, " metros equivale a ", m * 10, " decímetros."
        4: Escribir m, " metros equivale a ", m / 100, " hectómetros."
        5: Escribir m, " metros equivale a ", m / 1000, " kilómetros."
        De Otro Modo:
            Escribir "Opción no válida."
    FinSegun
FinAlgoritmo