using System;

class Program
{
    static void Main(string[] args)
    {
        int[] edades = new int[7];
        int contadorComoMayor = 0;

        // Leer y almacenar los datos
        for (int i = 0; i < 7; i++)
        {
            Console.Write($"Ingrese la edad de la persona {i + 1}: ");
            edades[i] = int.Parse(Console.ReadLine());
        }

        // Validar cuántos son mayores de edad
        for (int i = 0; i < 7; i++)
        {
            if (edades[i] >= 18)
            {
                contadorComoMayor++;
            }
        }

        Console.WriteLine($"La cantidad de personas mayores de edad es: {contadorComoMayor}");
    }
}