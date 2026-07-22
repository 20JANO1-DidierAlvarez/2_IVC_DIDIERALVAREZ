using System;

class Program {
    static void Main() {
        Console.Write("Ingrese un número decimal: ");
        int decimalNum = Convert.ToInt32(Console.ReadLine());
        string binario = Convert.ToString(decimalNum, 2);
        Console.WriteLine($"En binario es: {binario}");

        Console.Write("Ingrese un número binario: ");
        string bin = Console.ReadLine();
        int dec = Convert.ToInt32(bin, 2);
        Console.WriteLine($"En decimal es: {dec}");
    }
}