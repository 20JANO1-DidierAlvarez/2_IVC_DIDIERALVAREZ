using System;

class Program {
    static void Main() {
        Console.Write("Ingrese su peso en kg: ");
        double peso = Convert.ToDouble(Console.ReadLine());
        Console.Write("Ingrese su altura en metros: ");
        double altura = Convert.ToDouble(Console.ReadLine());

        double imc = peso / (altura * altura);
        Console.WriteLine($"Su IMC es: {imc:F2}");
    }
}