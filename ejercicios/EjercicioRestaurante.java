package ciclos;

    import java.util.Scanner; 

public class EjercicioRestaurante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;
        int opcion;

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|                                                                              |");
        System.out.println("|                      SISTEMA DE CAJA (VERSION 1.0)                           |");
        System.out.println("|                                                                              |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|     PROGRAMA: RESTAURANTE-CAJA                                               |");
        System.out.println("|     FECHA:    2025-08-14                                                     |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        do {
            System.out.println("\n\n+----------------------------------------------------------------------------+");
            System.out.println("|                            MENU DE OPCIONES                                |");
            System.out.println("+----------------------------------------------------------------------------+");
            System.out.println("|                                                                            |");
            System.out.println("|    1. REGISTRAR UN PEDIDO                                                  |");
            System.out.println("|    2. MOSTRAR EL TOTAL DE VENTAS                                           |");
            System.out.println("|    3. SALIR DEL SISTEMA                                                    |");
            System.out.println("|                                                                            |");
            System.out.println("+----------------------------------------------------------------------------+");
            System.out.print  ("|    INGRESE OPCION: ");

            while (!scanner.hasNextInt()) {
                System.out.println("|    ------------------------------------------------------------------------|");
                System.out.println("|    ERROR: VALOR INVALIDO. INGRESE UN NUMERO.                               |");
                System.out.print  ("|    INGRESE OPCION: ");
                scanner.next(); 
            }
            opcion = scanner.nextInt();
            scanner.nextLine();  
 
            switch (opcion) {
                case 1:
                    System.out.println("\n+----------------------------------------------------------------------------+");
                    System.out.println("|                          PANTALLA DE REGISTRO                              |");
                    System.out.println("+----------------------------------------------------------------------------+");
                    System.out.print  ("|    INGRESE EL PRECIO DEL PEDIDO: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("|    ------------------------------------------------------------------------|");
                        System.out.println("|    ERROR: PRECIO INVALIDO. INGRESE UN VALOR NUMERICO.                      |");
                        System.out.print  ("|    INGRESE EL PRECIO DEL PEDIDO: ");
                        scanner.next();
                    }
                    double precioPedido = scanner.nextDouble();
                    scanner.nextLine();

                    if (precioPedido > 0) {
                        totalVentas += precioPedido;
                        System.out.println("|    ------------------------------------------------------------------------|");
                        System.out.printf("|    PEDIDO DE $%.2f REGISTRADO CORRECTAMENTE.                                 |\n", precioPedido);
                    } else {
                        System.out.println("|    ------------------------------------------------------------------------|");
                        System.out.println("|    ERROR: EL PRECIO DEBE SER UN VALOR POSITIVO.                            |");
                    }
                    System.out.println("+----------------------------------------------------------------------------+");
                    System.out.print  ("|    PRESIONE ENTER PARA CONTINUAR... ");
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                case 2:
                    System.out.println("\n+----------------------------------------------------------------------------+");
                    System.out.println("|                           PANTALLA DE VENTAS                               |");
                    System.out.println("+----------------------------------------------------------------------------+");
                    System.out.println("|                                                                            |");
                    System.out.printf("|    EL TOTAL DE VENTAS ACUMULADO ES: $%.2f                                   |\n", totalVentas);
                    System.out.println("|                                                                            |");
                    System.out.println("+----------------------------------------------------------------------------+");
                    System.out.print  ("|    PRESIONE ENTER PARA CONTINUAR... ");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("\n+----------------------------------------------------------------------------+");
                    System.out.println("|                                                                            |");
                    System.out.println("|                  SALIENDO DEL SISTEMA. HASTA LUEGO.                        |");
                    System.out.println("|                                                                            |");
                    System.out.println("+----------------------------------------------------------------------------+");
                    break;
                default:
                    System.out.println("\n+----------------------------------------------------------------------------+");
                    System.out.println("|    ERROR: OPCION NO VALIDA. INGRESE UN NUMERO ENTRE 1 Y 3.                 |");
                    System.out.println("+----------------------------------------------------------------------------+");
                    System.out.print  ("|    PRESIONE ENTER PARA CONTINUAR... ");
                    scanner.nextLine();
            }
        } while (opcion != 3);

        scanner.close();
    }
}
