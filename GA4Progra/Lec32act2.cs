using System;

class Program {
    static void Main() {
        Console.Write("Lado 1: "); double l1 = Convert.ToDouble(Console.ReadLine());
        Console.Write("Lado 2: "); double l2 = Convert.ToDouble(Console.ReadLine());
        Console.Write("Lado 3: "); double l3 = Convert.ToDouble(Console.ReadLine());
        
        if (l1 == l2 && l2 == l3) {
            Console.WriteLine("Es un triángulo Equilátero.");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            Console.WriteLine("Es un triángulo Isósceles.");
        } else {
            Console.WriteLine("Es un triángulo Escaleno.");
        }
    }
}