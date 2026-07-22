using System;

class Program {
    static void Main() {
        string jugar = "s";
        Random rnd = new Random();
        string[] opciones = { "Piedra", "Papel", "Tijeras" };

        while (jugar.ToLower() == "s") {
            Console.Write("Elija (Piedra, Papel o Tijeras): ");
            string usuario = Console.ReadLine();
            string computadora = opciones[rnd.Next(3)];

            Console.WriteLine($"La computadora eligió: {computadora}");

            if (usuario.Equals(computadora, StringComparison.OrdinalIgnoreCase)) {
                Console.WriteLine("¡Empate!");
            } else if ((usuario.Equals("Piedra", StringComparison.OrdinalIgnoreCase) && computadora == "Tijeras") ||
                       (usuario.Equals("Papel", StringComparison.OrdinalIgnoreCase) && computadora == "Piedra") ||
                       (usuario.Equals("Tijeras", StringComparison.OrdinalIgnoreCase) && computadora == "Papel")) {
                Console.WriteLine("¡Ganaste!");
            } else {
                Console.WriteLine("¡Perdiste!");
            }

            Console.Write("¿Desea jugar de nuevo? (s/n): ");
            jugar = Console.ReadLine();
        }
    }
}