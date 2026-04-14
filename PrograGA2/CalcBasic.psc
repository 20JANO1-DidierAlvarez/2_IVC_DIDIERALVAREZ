Algoritmo CalcBasic
	Definir opc Como Entero
	Definir n1,n2 Como Entero
	
	Escribir "**************************"
	Escribir"***MENU DE OPCIONES*****"
	Escribir "**************************"
	Escribir " 1- Suma"
	Escribir " 2- Resta"
	Escribir " 3- Multiplicacion"
	Escribir " 4- Division"
	Escribir Sin Saltar "Digite la opcion[]: "
	Leer opc
	Escribir "Digite 2 valores numericos :"
	Leer n1
	Leer n2
	
	Segun opc Hacer
	1:
			Escribir "La suma es: ",(n1+n2)
		2:
			Escribir "La resta es: ",(n1-n2)
		3:
			Escribir "La multiplicacion es: ",(n1*n2)
		4:
			Escribir "La division es: ",(n1/n2)
		De Otro Modo:
			Escribir "Error al operar os numeros !!!"
	Fin Segun
FinAlgoritmo
