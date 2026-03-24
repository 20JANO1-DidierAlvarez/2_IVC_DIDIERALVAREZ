internal class Program
{
    private static void Main(string[] args)
    {
        Console.WriteLine("Ingrese un numero: ");
        int numero = Convert.ToInt32(Console.ReadLine());
        if (numero >= 0)
        {
            Console.WriteLine("El numero es positivo");
        }
        else
        {
            Console.WriteLine("El numero es negativo");
        }

    }
}