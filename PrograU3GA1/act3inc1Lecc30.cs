using System;

class Program
{
    static void Main(string[] args)
    {
        int[] lista = new int[15];
        bool tieneRepetido = false;

        // Leer y almacenar los datos
        for (int i = 0; i < 15; i++)
        {
            Console.Write($"Ingrese el número {i + 1}: ");
            lista[i] = int.Parse(Console.ReadLine());
        }

        // Comparar con bucles anidados
        for (int i = 0; i < 14; i++)
        {
            for (int j = i + 1; j < 15; j++)
            {
                if (lista[i] == lista[j])
                {
                    tieneRepetido = true;
                    break; // Rompe el ciclo interno si ya encontramos uno
                }
            }
            if (tieneRepetido) { break; } // Rompe el ciclo externo
        }

        // Mostrar resultado
        if (tieneRepetido)
        {
            Console.WriteLine("Sí existe al menos un número repetido.");
        }
        else
        {
            Console.WriteLine("No hay números repetidos.");
        }
    }
}