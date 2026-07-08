Algoritmo ejemploCRUD
	Definir opc Como Entero
	Definir estudiantes Como Caracter
	Dimensionar estudiantes[10,3]
	Repetir
		Limpiar Pantalla
		Escribir "*********MENU PRINCIPAL*******"
		Escribir "1- Registrar"
		Escribir "2- Mostrar"
		Escribir "3- Actualizar"
		Escribir "4- Eliminar"
		Escribir "5- Salir"
		Escribir Sin Saltar"Digite una opcion"
		Leer opc
		Segun opc Hacer
			1: Escribir"========Registrar estudiantes====="
				
			2: Escribir"========Mostrar Estudiantes====="
				
			3: Escribir"=============Actualizar Estudiantes"
				
			4: Escribir"=======Eliminar estudiantes====="
					EliminarEstudiante(estudiantes)
				
			5: Escribir"========Saliendo del sistema====="
			De Otro Modo:
				Escribir "¡Digite una opcion valida!"
		FinSegun
	Hasta Que opc = 5
			
	
	
FinAlgoritmo
SubProceso RegistrarEstudiantes(estudiantes)
	Definir i Como Entero
	Para i=1 Hasta 3 Con Paso 1 Hacer
		Si estudiantes[i,1]=0 Entonces
			Escribir Sin Saltar"Código: "
			Leer estudiantes[i,1]
			Escribir Sin Saltar"Nombre: "
			Leer estudiantes[i,2]
			Escribir Sin Saltar"Edad: "
			Leer estudiantes[i,3]
			Escribir "Datos Almacenados con exito!!"
			
	 FinSi
 FinPara
 
 Escribir "Matrix Llena"
FinSubProceso
Subproceso MostrarEstudiantes(estudiantes)
	Definir i Como Entero
	Escribir "CODIGO  NOMBRE   EDAD"
	Para i=1 Hasta 10 Con Paso 1 Hacer
		Si estudiantes[i,1]="" Entonces
			Escribir estudiantes[i,1]," ", estudiantes[i,2], "  ", estudiantes[i,3]
		FinSi
	FinPara
FinSubProceso
SubProceso EliminarEstudiante(estudiantes)
	Definir codigo Como Caracter
	Escribir "Digite el codigo del estudiante"
	leer codigo
	Para i=1 Hasta 10 Con Paso 1 Hacer
		si estudiantes[i,1]==codigo Entonces
			estudiantes[i,1]=""
			estudiantes[i,2]=""
			estudiantes[i,3]=""
			Escribir " Registro Eliminado"
		
		FinSi
	FinPara
	Escribir "Estudiante no registrado"
FinSubProceso
