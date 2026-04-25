Algoritmo KilosdeManzana
	definir  PESOmanzana, pesototal, totMan Como Real
	//Inicializar la variable
	pesototal= 0 //Acumulador
	Mientras pesototal<1000 Hacer
		Escribir " Dime el peso de la manzana comprada"
		Leer PESOmanzana
		Si pesoManzana<=180 Entonces
			pesototal=pesototal+PESOmanzana
			Escribir "LLevo en total de peso:",pesototal, "Gramos: "
			totMan=totMan+1
		SiNo
			Escribir "Error la manzana no alcanza el peso"
		Fin Si
	Fin Mientras
	
	
	
FinAlgoritmo
