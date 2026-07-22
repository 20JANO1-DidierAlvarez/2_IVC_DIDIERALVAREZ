Algoritmo TipoTriangulo
    Definir l1, l2, l3 Como Real
    Escribir "Ingrese la medida del lado 1:"
    Leer l1
    Escribir "Ingrese la medida del lado 2:"
    Leer l2
    Escribir "Ingrese la medida del lado 3:"
    Leer l3
    
    Si l1 == l2 Y l2 == l3 Entonces
        Escribir "El triángulo es Equilátero."
    Sino
        Si l1 == l2 O l1 == l3 O l2 == l3 Entonces
            Escribir "El triángulo es Isósceles."
        Sino
            Escribir "El triángulo es Escaleno."
        FinSi
    FinSi
FinAlgoritmo