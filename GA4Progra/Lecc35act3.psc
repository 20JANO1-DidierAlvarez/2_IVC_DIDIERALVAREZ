Algoritmo ConvertidorMoneda
    Definir cantidad Como Real
    Definir opc Como Caracter
    
    Repetir
        Escribir "Ingresa la cantidad en tu moneda local:"
        Leer cantidad
        
        // Multiplicadores de ejemplo
        Escribir "En Dólares: ", cantidad * 0.13
        Escribir "En Euros: ", cantidad * 0.12
        Escribir "En Pesos Mexicanos: ", cantidad * 2.20
        Escribir "En Lempiras: ", cantidad * 3.21
        Escribir "En Yenes: ", cantidad * 19.50
        
        Escribir "¿Deseas convertir otra cantidad? (s/n)"
        Leer opc
    Hasta Que opc = "n" O opc = "N"
FinAlgoritmo