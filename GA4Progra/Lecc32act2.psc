Algoritmo HoroscopoSimple
    Definir mes, dia Como Entero
    Escribir "Ingrese su mes de nacimiento (1-12):"
    Leer mes
    Escribir "Ingrese su día de nacimiento:"
    Leer dia
    
    Si (mes == 3 Y dia >= 21) O (mes == 4 Y dia <= 19) Entonces
        Escribir "Tu signo es Aries. Tendrás mucha energía creativa hoy."
    Sino
        Si (mes == 4 Y dia >= 20) O (mes == 5 Y dia <= 20) Entonces
            Escribir "Tu signo es Tauro. Es un gran día para consolidar metas."
        Sino
            Escribir "Signo genérico: ¡Disfruta tu día al máximo y sonríe!"
        FinSi
    FinSi
FinAlgoritmo