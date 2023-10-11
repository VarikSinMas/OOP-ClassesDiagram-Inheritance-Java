import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AA1_AlquilerVehiculos {

    public static void main(String[] args) {
        AA1_AlquilerVehiculos aa1 = new AA1_AlquilerVehiculos();
        aa1.inicio();
    }

    void inicio() {
        Scanner scanner = new Scanner(System.in);

        // Crear dos objetos de tipo cliente.
        Cliente cliente1 = new Cliente("53287465S", "Antoni Fernandez");
        Cliente cliente2 = new Cliente("72564983H", "Oscar Jimenez");

        for (int i = 0; i < 3; i++) {
            System.out.println("Contrato " + (i + 1));

            Cliente clienteSeleccionado = getCliente(cliente1, cliente2, scanner);
            if (clienteSeleccionado == null) return;

            // Solicitar al usuario seleccionar un tipo de vehículo
            System.out.println("Seleccione un vehículo:");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Camion");
            int opcionVehiculo = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            Vehiculo vehiculo;
            double precioDia;

            switch (opcionVehiculo) {
                case 1:
                    vehiculo = new Coche("0098KTK", "Toyota", "Corolla AE86 Sprinter Trueno", 3, 5);
                    precioDia = 48.99;
                    break;
                case 2:
                    vehiculo = new Moto("3498JLV", "Honda", "H2R", 980);
                    precioDia = 29.49;
                    break;
                case 3:
                    vehiculo = new Camion("1980JMP", "Volvo", "FH", 25000);
                    precioDia = 89.99;
                    break;
                default:
                    System.err.println("Opción de vehículo no válida.");
                    return;
            }

            // Solicitar al usuario ingresar las fechas de inicio y fin del contrato manualmente
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaInicio = null;
            Date fechaFin = null;

            try {
                System.out.print("Ingrese la fecha de inicio del contrato (dd/MM/yyyy): ");
                fechaInicio = dateFormat.parse(scanner.nextLine());

                System.out.print("Ingrese la fecha de fin del contrato (dd/MM/yyyy): ");
                fechaFin = dateFormat.parse(scanner.nextLine());
            } catch (Exception e) {
                System.err.println("Error al analizar la fecha. Asegúrese de ingresarla en el formato correcto (dd/MM/yyyy).");
                return;
            }

            // Crear el contrato correspondiente
            ContratoAlquiler contrato = new ContratoAlquiler(fechaInicio, fechaFin, precioDia, vehiculo, clienteSeleccionado);

            // Mostrar los datos del contrato en el formato deseado
            System.out.println(contrato);

            System.out.println();
        }
    }

    private static Cliente getCliente(Cliente cliente1, Cliente cliente2, Scanner scanner) {
        // Solicitar al usuario seleccionar un cliente
        System.out.println("Seleccione un cliente:");
        System.out.println("1. " + cliente1.getNombre());
        System.out.println("2. " + cliente2.getNombre());
        int opcionCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Cliente clienteSeleccionado;
        if (opcionCliente == 1) {
            clienteSeleccionado = cliente1;
        } else if (opcionCliente == 2) {
            clienteSeleccionado = cliente2;
        } else {
            System.err.println("Opción de cliente no válida.");
            return null;
        }
        return clienteSeleccionado;
    }
}
