Algoritmo CalculadoraCambio
    Definir precio, pago, cambio Como Real
    Definir b200, b100, b50, b20, monedas Como Entero
    
    Escribir "Precio del producto:"
    Leer precio
    Escribir "Pago del cliente:"
    Leer pago
    
    cambio <- pago - precio
    Escribir "El cambio es: ", cambio
    
    b200 <- trunc(cambio / 200)
    cambio <- cambio MOD 200
    
    b100 <- trunc(cambio / 100)
    cambio <- cambio MOD 100
    
    b50 <- trunc(cambio / 50)
    cambio <- cambio MOD 50
    
    b20 <- trunc(cambio / 20)
    cambio <- cambio MOD 20
    
    monedas <- trunc(cambio) // El resto
    
    Escribir "Billetes de 200: ", b200
    Escribir "Billetes de 100: ", b100
    Escribir "Billetes de 50: ", b50
    Escribir "Billetes de 20: ", b20
    Escribir "Monedas: ", monedas
FinAlgoritmo