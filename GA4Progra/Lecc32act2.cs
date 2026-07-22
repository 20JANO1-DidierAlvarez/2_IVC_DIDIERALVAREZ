using System;

class Program {
    static void Main() {
        Console.Write("Ingrese su mes de nacimiento (1-12): ");
        int mes = Convert.ToInt32(Console.ReadLine());
        Console.Write("Ingrese su día de nacimiento: ");
        int dia = Convert.ToInt32(Console.ReadLine());
        
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            Console.WriteLine("Tu signo es Aries. Tendrás mucha energía creativa hoy.");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            Console.WriteLine("Tu signo es Tauro. Es un gran día para consolidar metas.");
        } else {
            Console.WriteLine("Tu signo genérico: ¡Disfruta tu día al máximo y sonríe!");
        }
    }
}