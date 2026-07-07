string[,] edades = new string[3, 3];
int edadTemporal;

// Pedir datos al profesor
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Console.WriteLine("Ingresa la edad del alumno (Fila " + i + ", Columna " + j + "):");
        edadTemporal = int.Parse(Console.ReadLine());

        // Evaluar si es mayor o menor de edad
        if (edadTemporal >= 18) {
            edades[i, j] = edadTemporal + " - mayor";
        } else {
            edades[i, j] = edadTemporal + " - menor";
        }
    }
}

Console.WriteLine("--- MATRIZ DE EDADES ---");
// Mostrar los resultados
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        Console.Write(edades[i, j] + "\t\t");
    }
    Console.WriteLine();
}