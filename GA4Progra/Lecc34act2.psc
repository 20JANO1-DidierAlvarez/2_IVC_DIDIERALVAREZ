Algoritmo CalcularIMC
    Definir peso, altura, imc Como Real
    
    Escribir "Ingresa tu peso en kg:"
    Leer peso
    Escribir "Ingresa tu altura en metros:"
    Leer altura
    
    imc <- peso / (altura * altura)
    
    Escribir "Tu IMC es: ", imc
FinAlgoritmo