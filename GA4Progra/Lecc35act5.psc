Algoritmo PiedraPapelTijeras
    Definir user, comp Como Entero
    Definir opc Como Caracter
    
    Repetir
        Escribir "Elige: 1) Piedra  2) Papel  3) Tijeras"
        Leer user
        
        comp <- Aleatorio(1, 3) // La computadora elige al azar
        
        Escribir "La computadora eligió: ", comp
        
        Si user == comp Entonces
            Escribir "¡Empate!"
        Sino
            Si (user==1 Y comp==3) O (user==2 Y comp==1) O (user==3 Y comp==2) Entonces
                Escribir "¡Ganaste!"
            Sino
                Escribir "¡Perdiste!"
            FinSi
        FinSi
        
        Escribir "¿Quieres jugar de nuevo? (s/n)"
        Leer opc
    Hasta Que opc = "n" O opc = "N"
FinAlgoritmo