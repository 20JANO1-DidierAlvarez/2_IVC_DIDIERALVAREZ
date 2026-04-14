Proceso Impresoras
	Definir cantidad Como Entero
	Definir pago Como Entero
	Definir precio, iva, subtotal, totalConIVA, descuento, totalFinal Como Real
	
	precio <- 650
	iva <- 0.12
	
	Escribir "Ingrese la cantidad de impresoras:"
	Leer cantidad
	
	Escribir "Forma de pago:"
	Escribir "1. Efectivo (10%)"
	Escribir "2. Tarjeta (5%)"
	Escribir "3. Vale (15%)"
	Leer pago
	
	subtotal <- cantidad * precio
	totalConIVA <- subtotal + (subtotal * iva)
	
	Segun pago Hacer
		1:
			descuento <- 0.10
		2:
			descuento <- 0.05
		3:
			descuento <- 0.15
		De Otro Modo:
			Escribir "Opción inválida"
			descuento <- 0
	FinSegun
	
	totalFinal <- totalConIVA - (totalConIVA * descuento)
	
	Escribir "Cantidad de impresoras: ", cantidad
	Escribir "Precio unitario con IVA: Q", precio + (precio * iva)
	Escribir "Total sin descuento: Q", totalConIVA
	Escribir "Descuento: Q", totalConIVA * descuento
	Escribir "Total a pagar: Q", totalFinal
FinProceso