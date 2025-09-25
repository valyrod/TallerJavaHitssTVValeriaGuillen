package test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import models.*;

public class TestMain {

    public static void main(String[] args) {
        Inventario inventarioManager = new Inventario();
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Producto> inventario = new TreeMap<>();
        LinkedHashMap<String, Producto> inventarioInsercion = new LinkedHashMap<>();

        Producto p1 = new Producto("SKU001", "Balón Adidas", "fútbol", 50);
        Producto p2 = new Producto("SKU004", "Raqueta", "tenis", 30);
        Producto p3 = new Producto("SKU002", "Zapatillas Nike", "running", 120);
        Producto p4 = new Producto("SKU003", "Camiseta", "baloncesto", 85);

        inventario.put(p1.getNombre(), p1);
        inventarioInsercion.put(p1.getSku(), p1);

        inventario.put(p2.getNombre(), p2);
        inventarioInsercion.put(p2.getSku(), p2);

        inventario.put(p3.getNombre(), p3);
        inventarioInsercion.put(p3.getSku(), p3);

        inventario.put(p4.getNombre(), p4);
        inventarioInsercion.put(p4.getSku(), p4);

        System.out.println("Datos de prueba cargados.");

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarProducto(inventario, inventarioInsercion, scanner);
                    break;
                case 2:
                    consultarProducto(inventario, inventarioManager, scanner);
                    break;
                case 3:
                    System.out.println("\n********** Reporte de productos por orden de inserción **********");
                    imprimirEnTabla(inventarioInsercion);
                    break;
                case 4:
                    System.out.println("\n********** Reporte de productos ordenados alfabéticamente por nombre **********");
                    imprimirEnTabla(inventario);
                    break;
                case 5:
                    actualizarStock(inventario, inventarioManager, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    public static void imprimirEnTabla(Map<?, Producto> mapa) {
        System.out.println("+-----------------+--------------------------------+--------------------+------------+");
        System.out.printf("| %-15s | %-30s | %-18s | %-10s |%n", "SKU", "NOMBRE", "CATEGORIA", "STOCK");
        System.out.println("+-----------------+--------------------------------+--------------------+------------+");

        for (Producto producto : mapa.values()) {
            System.out.printf("| %-15s | %-30s | %-18s | %-10d |%n",
                producto.getSku(),
                producto.getNombre(),
                producto.getCategoria(),
                producto.getStock());
        }
        System.out.println("+-----------------+--------------------------------+--------------------+------------+");
    }

    private static void registrarProducto(TreeMap<String, Producto> inventario, LinkedHashMap<String, Producto> inventarioInsercion, Scanner scanner) {
        System.out.println("\n********** Registrar Nuevo Producto **********");
        System.out.print("Ingrese SKU: ");
        String sku = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese categoría: ");
        String categoria = scanner.nextLine();
        System.out.print("Ingrese stock inicial: ");
        int stock = scanner.nextInt();
        scanner.nextLine();
        
        Producto nuevoProducto = new Producto(sku, nombre, categoria, stock);
        inventario.put(nombre, nuevoProducto);
        inventarioInsercion.put(sku, nuevoProducto);
        System.out.println("\nProducto registrado exitosamente.");
    }

    private static void consultarProducto(TreeMap<String, Producto> inventario, Inventario inventarioManager, Scanner scanner) {
        System.out.println("\n********** Consultar Producto por SKU **********");
        System.out.print("Ingrese SKU a buscar: ");
        String sku = scanner.nextLine();
        Producto producto = inventarioManager.buscarProductoPorSKU(inventario, sku);
        if (producto != null) {
            System.out.println("\nProducto encontrado:");
            System.out.println("+-----------------+--------------------------------+--------------------+------------+");
            System.out.printf("| %-15s | %-30s | %-18s | %-10s |%n", "SKU", "NOMBRE", "CATEGORIA", "STOCK");
            System.out.println("+-----------------+--------------------------------+--------------------+------------+");
            System.out.printf("| %-15s | %-30s | %-18s | %-10d |%n",
                producto.getSku(),
                producto.getNombre(),
                producto.getCategoria(),
                producto.getStock());
            System.out.println("+-----------------+--------------------------------+--------------------+------------+");
        } else {
            System.out.println("\nProducto con SKU " + sku + " no encontrado.");
        }
    }

    private static void actualizarStock(TreeMap<String, Producto> inventario, Inventario inventarioManager, Scanner scanner) {
        System.out.println("\n********** Actualizar Stock **********");
        System.out.print("Ingrese SKU del producto a actualizar: ");
        String sku = scanner.nextLine();
        
        System.out.println("1. Registrar venta (disminuir stock)");
        System.out.println("2. Registrar entrada de unidades (aumentar stock)");
        System.out.print("Seleccione la operación (1 o 2): ");
        int tipoOperacion = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        if (tipoOperacion == 1) {
            inventarioManager.actualizarStock(inventario, sku, -cantidad);
        } else if (tipoOperacion == 2) {
            inventarioManager.actualizarStock(inventario, sku, cantidad);
        } else {
            System.out.println("\nOpción de operación no válida.");
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n********** Menú de Gestión de Inventario **********");
        System.out.println("1. Registrar un nuevo producto");
        System.out.println("2. Consultar un producto por SKU");
        System.out.println("3. Generar reporte por orden de inserción");
        System.out.println("4. Generar reporte ordenado por nombre");
        System.out.println("5. Actualizar stock de un producto");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
}