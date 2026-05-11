// Ejercicio 1 - Desbloquear Nivel 5
Algoritmo DesbloquearNivel5
	Definir monedas Como Entero
	
	Escribir "=== Acceso al Nivel 5 ==="
	Escribir "Ingrese la cantidad de monedas que tiene el jugador:"
	Leer monedas
	
	Mientras monedas < 350 Hacer
		Escribir "Nivel BLOQUEADO. Te faltan ", 350 - monedas, " monedas."
		Escribir "Gana más monedas e ingresa el nuevo total:"
		Leer monedas
	Fin Mientras
	
	Escribir "¡Nivel 5 DESBLOQUEADO! Puedes ingresar."
	
Fin Algoritmo