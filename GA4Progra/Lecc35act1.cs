using System;

class Program {
    static void Main() {
        string continuar = "s";
        while (continuar.ToLower() == "s") {
            Console.Write("Ingrese la cantidad en su moneda local: ");
            double cantidad = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine($"Dólares: {cantidad * 0.013}");
            Console.WriteLine($"Euros: {cantidad * 0.012}");
            Console.WriteLine($"Yenes: {cantidad * 2.05}");
            Console.WriteLine($"Pesos Mexicanos: {cantidad * 0.22}");
            Console.WriteLine($"Quetzales: {cantidad * 0.10}");

            Console.Write("¿Desea convertir otra cantidad? (s/n): ");
            continuar = Console.ReadLine();
        }
    }
}