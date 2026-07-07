int[,] matriz = new int[4, 4];

// Llenar la matriz
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        if (i == j) {
            matriz[i, j] = 1;
        } else {
            matriz[i, j] = 0;
        }
    }
}

// Mostrar la matriz en consola
for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        // Usamos Write en lugar de WriteLine para que no salte de línea
        Console.Write(matriz[i, j] + "\t"); 
    }
    Console.WriteLine(); // Salto de línea al terminar la fila
}