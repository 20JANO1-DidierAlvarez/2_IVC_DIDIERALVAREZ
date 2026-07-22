using System;

class Program {
    static void Main() {
        string[] nombres = new string[10];
        string[] telefonos = new string[10];

        for (int i = 0; i < 10; i++) {
            Console.Write($"Ingrese nombre para la posición {i}: ");
            nombres[i] = Console.ReadLine();
            Console.Write($"Ingrese teléfono para la posición {i}: ");
            telefonos[i] = Console.ReadLine();
        }

        Console.Write("\nIngrese el número de posición a consultar (0 al 9): ");
        int pos = Convert.ToInt32(Console.ReadLine());

        if (pos >= 0 && pos < 10) {
            Console.WriteLine($"Nombre: {nombres[pos]} - Teléfono: {telefonos[pos]}");
        } else {
            Console.WriteLine("Posición inválida.");
        }
    }
}