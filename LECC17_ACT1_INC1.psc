Algoritmo LECC17_ACT1_INC1
	//Encabezado
	Escribir "Nombre: Didier Alvarez"
	Escribir "Grado y Seccion: IVC"
	Escribir "Clave 2"
	Escribir "Ejemplo de una matriz"
	Definir donas como Cadena
	Definir fila, columna Como Entero
	Dimensionar donas[2,4]
	//Fila 1
	donas[1,1]= "Chocolate"
	donas[1,2]= "Vainilla"
	donas[1,3]= "Chicle"
	donas[1,4]= "Fresa"
	//FiLA 2
	donas[2,1]= "Caramelo"
	donas[2,2]= "Cafe"
	donas[2,3]= "Banano"
	donas[2,4]= "Coco"
	//MOSTRAR DATOS
	Para fila= 1 Hasta 2 Con Paso 1 Hacer
		Para columna=1 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar "Dona de: ",donas[fila,columna]
		FinPara
	FinPara
	
FinAlgoritmo
