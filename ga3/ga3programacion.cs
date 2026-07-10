using System;

namespace RegistroParqueo
{
    class Program
    {
        // Matriz global para almacenar hasta 10 vehículos
        // Columnas: 0 = Placa, 1 = Propietario, 2 = Marca
        static string[,] vehiculos = new string[10, 3];

        static void Main(string[] args)
        {
            int opcion = 0;

            do
            {
                Console.Clear();
                Console.WriteLine("===== MENU PARQUEO =====");
                Console.WriteLine("1. Registrar vehículo");
                Console.WriteLine("2. Mostrar vehículos");
                Console.WriteLine("3. Actualizar vehículo");
                Console.WriteLine("4. Eliminar vehículo");
                Console.WriteLine("5. Salir");
                Console.Write("Seleccione una opción: ");

                if (!int.TryParse(Console.ReadLine(), out opcion))
                {
                    Console.WriteLine("\nPor favor, ingrese un número válido.");
                    Pausa();
                    continue;
                }

                switch (opcion)
                {
                    case 1:
                        Console.Clear();
                        Console.WriteLine("=== REGISTRAR VEHÍCULO ===");
                        Registrar();
                        Pausa();
                        break;

                    case 2:
                        Console.Clear();
                        Console.WriteLine("=== MOSTRAR VEHÍCULOS ===");
                        MostrarV();
                        Pausa();
                        break;

                    case 3:
                        Console.Clear();
                        Console.WriteLine("=== ACTUALIZAR VEHÍCULO ===");
                        Actualizar();
                        Pausa();
                        break;

                    case 4:
                        Console.Clear();
                        Console.WriteLine("=== ELIMINAR VEHÍCULO ===");
                        Eliminar();
                        Pausa();
                        break;

                    case 5:
                        Console.WriteLine("Saliendo del sistema...");
                        break;

                    default:
                        Console.WriteLine("Opción inválida.");
                        Pausa();
                        break;
                }

            } while (opcion != 5);
        }

        // Registrar un nuevo vehículo
        static void Registrar()
        {
            bool registrado = false;

            for (int i = 0; i < 10; i++)
            {
                if (string.IsNullOrEmpty(vehiculos[i, 0]))
                {
                    Console.Write("Número de Placa: ");
                    vehiculos[i, 0] = Console.ReadLine();

                    Console.Write("Nombre del Propietario: ");
                    vehiculos[i, 1] = Console.ReadLine();

                    Console.Write("Marca del Vehículo: ");
                    vehiculos[i, 2] = Console.ReadLine();

                    Console.WriteLine("\nVehículo registrado exitosamente.");
                    registrado = true;
                    break;
                }
            }

            if (!registrado)
            {
                Console.WriteLine("\nEl parqueo está lleno. Máximo 10 vehículos.");
            }
        }

        // Mostrar todos los vehículos
        static void MostrarV()
        {
            bool hayVehiculos = false;

            Console.WriteLine("\nPLACA\t\tPROPIETARIO\t\tMARCA");
            Console.WriteLine("--------------------------------------------------------------");

            for (int i = 0; i < 10; i++)
            {
                if (!string.IsNullOrEmpty(vehiculos[i, 0]))
                {
                    Console.WriteLine(
                        vehiculos[i, 0] + "\t\t" +
                        vehiculos[i, 1] + "\t\t" +
                        vehiculos[i, 2]);

                    hayVehiculos = true;
                }
            }

            if (!hayVehiculos)
            {
                Console.WriteLine("No hay vehículos registrados.");
            }
        }

        // Actualizar un vehículo
        static void Actualizar()
        {
            bool encontrado = false;

            Console.Write("Ingrese el número de placa a buscar: ");
            string placa = Console.ReadLine();

            for (int i = 0; i < 10; i++)
            {
                if (vehiculos[i, 0] == placa)
                {
                    Console.Write("Nuevo Nombre del Propietario: ");
                    vehiculos[i, 1] = Console.ReadLine();

                    Console.Write("Nueva Marca del Vehículo: ");
                    vehiculos[i, 2] = Console.ReadLine();

                    Console.WriteLine("\nRegistro actualizado con éxito.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado)
            {
                Console.WriteLine("\nVehículo con esa placa no fue encontrado.");
            }
        }

        // Eliminar un vehículo
        static void Eliminar()
        {
            bool encontrado = false;

            Console.Write("Ingrese la placa del vehículo que sale: ");
            string placa = Console.ReadLine();

            for (int i = 0; i < 10; i++)
            {
                if (vehiculos[i, 0] == placa)
                {
                    vehiculos[i, 0] = "";
                    vehiculos[i, 1] = "";
                    vehiculos[i, 2] = "";

                    Console.WriteLine("\nVehículo retirado y registro eliminado del sistema.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado)
            {
                Console.WriteLine("\nPlaca no encontrada en el sistema.");
            }
        }

        // Pausa antes de regresar al menú
        static void Pausa()
        {
            Console.WriteLine("\nPresione cualquier tecla para continuar...");
            Console.ReadKey();
        }
    }
}