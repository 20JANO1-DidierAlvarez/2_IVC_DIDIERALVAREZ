using System;

class Program {
    static void Main() {
        Console.Write("Ingrese el precio del producto: ");
        double precio = Convert.ToDouble(Console.ReadLine());
        Console.Write("Ingrese con cuánto pagó el cliente: ");
        double pago = Convert.ToDouble(Console.ReadLine());

        double cambio = pago - precio;
        Console.WriteLine($"Cambio total a devolver: {cambio}");

        int v200 = (int)(cambio / 200); cambio %= 200;
        int v100 = (int)(cambio / 100); cambio %= 100;
        int v50 = (int)(cambio / 50); cambio %= 50;
        int v20 = (int)(cambio / 20); cambio %= 20;
        int m1 = (int)cambio;

        Console.WriteLine($"Billetes de 200: {v200}");
        Console.WriteLine($"Billetes de 100: {v100}");
        Console.WriteLine($"Billetes de 50: {v50}");
        Console.WriteLine($"Billetes de 20: {v20}");
        Console.WriteLine($"Monedas / Resto: {m1}");
    }
}