using System;

class Program {
    static void Main() {
        Console.Write("Ingrese una frase: ");
        string frase = Console.ReadLine();
        string invertida = "";

        for (int i = frase.Length - 1; i >= 0; i--) {
            invertida += frase[i];
        }

        Console.WriteLine($"Frase invertida: {invertida}");
    }
}