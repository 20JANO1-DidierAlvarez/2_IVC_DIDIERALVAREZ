using System;

class Program {
    static void Main() {
        Console.Write("Ingrese la cantidad en metros: ");
        double m = Convert.ToDouble(Console.ReadLine());
        
        Console.WriteLine("\n1. Milímetros\n2. Centímetros\n3. Decímetros\n4. Hectómetros\n5. Kilómetros");
        Console.Write("Seleccione una opción: ");
        int opc = Convert.ToInt32(Console.ReadLine());
        
        switch (opc) {
            case 1: Console.WriteLine($"{m} metros equivale a {m * 1000} milímetros."); break;
            case 2: Console.WriteLine($"{m} metros equivale a {m * 100} centímetros."); break;
            case 3: Console.WriteLine($"{m} metros equivale a {m * 10} decímetros."); break;
            case 4: Console.WriteLine($"{m} metros equivale a {m / 100} hectómetros."); break;
            case 5: Console.WriteLine($"{m} metros equivale a {m / 1000} kilómetros."); break;
            default: Console.WriteLine("Opción no válida."); break;
        }
    }
}