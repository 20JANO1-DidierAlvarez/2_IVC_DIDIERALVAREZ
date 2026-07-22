using System;

class Program {
    static void Main() {
        Console.Write("Ingrese la cantidad en grados Centígrados (Celsius): ");
        double c = Convert.ToDouble(Console.ReadLine());

        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;

        Console.WriteLine($"a. Fahrenheit: {f}°F");
        Console.WriteLine($"b. Celsius: {c}°C");
        Console.WriteLine($"c. Kelvin: {k}K");
    }
}