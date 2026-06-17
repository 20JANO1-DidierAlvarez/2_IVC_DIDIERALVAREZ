using System;

class Program
{
    static void Main(string[] args)
    {
        int[] numeros = new int[8];

        // Leer y almacenar los datos
        for (int i = 0; i < 8; i++)
        {
            Console.Write($"Ingrese el número {i + 1}: ");
            numeros[i] = int.Parse(Console.ReadLine());
        }

        // Suponemos que el primero es el mayor
        int mayor = numeros[0];
        int posicion = 0; // En C# los arreglos inician en índice 0

        // Comparar con el resto
        for (int i = 1; i < 8; i++)
        {
            if (numeros[i] > mayor)
            {
                mayor = numeros[i];
                posicion = i;
            }
        }

        // Sumamos 1 a la posición para que sea más natural al usuario (1 a 8)
        Console.WriteLine($"El número mayor del arreglo es: {mayor}");
        Console.WriteLine($"Se encuentra en la posición: {posicion + 1}");
    }
}