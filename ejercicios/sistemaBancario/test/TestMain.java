package test;

import clases.CuentaBancaria;
import clases.Transaccion;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

    private static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    realizarOperacion();
                    break;
                case 3:
                    mostrarInformacionDeCuenta();
                    break;
                case 4:
                    mostrarTodasLasCuentas();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n------ SISTEMA BANCARIO ------\n");
        System.out.println("1. Crear cuenta bancaria");
        System.out.println("2. Realizar operación (Depósito/Retiro)");
        System.out.println("3. Mostrar información de una cuenta");
        System.out.println("4. Mostrar todas las cuentas");
        System.out.println("5. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Ingrese un número.");
            scanner.next();
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    private static void crearCuenta() {
        System.out.print("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("\nSaldo no válido. Ingrese un número.");
            scanner.next();
        }
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();

        CuentaBancaria nuevaCuenta = new CuentaBancaria(titular, saldoInicial);
        cuentas.add(nuevaCuenta);
        System.out.println("\nCuenta creada exitosamente con ID: " + nuevaCuenta.getId());
    }

    private static void realizarOperacion() {
        System.out.print("Ingrese el ID de la cuenta: ");
        int idCuenta = leerOpcion();
        CuentaBancaria cuenta = buscarCuentaPorId(idCuenta);

        if (cuenta != null) {
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.print("\nSeleccione el tipo de operación: \n");
            int tipoOperacion = leerOpcion();

            System.out.print("Ingrese el monto: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("\nMonto no válido. Ingrese un número.");
                scanner.next();
            }
            double monto = scanner.nextDouble();
            scanner.nextLine();

            switch (tipoOperacion) {
                case 1:
                    cuenta.depositar(monto);
                    break;
                case 2:
                    cuenta.retirar(monto);
                    break;
                default:
                    System.out.println("Opción de operación no válida.");
                    break;
            }

        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    private static void mostrarInformacionDeCuenta() {
        System.out.print("Ingrese el ID de la cuenta: ");
        int idCuenta = leerOpcion();
        CuentaBancaria cuenta = buscarCuentaPorId(idCuenta);

        if (cuenta != null) {
            cuenta.mostrarInformacion();
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }

    private static void mostrarTodasLasCuentas() {
        System.out.println("\n--- LISTA DE TODAS LAS CUENTAS ---");
        if (cuentas.isEmpty()) {
            System.out.println("\nNo hay cuentas registradas.");
        } else {
            for (CuentaBancaria cuenta : cuentas) {
                System.out.println(cuenta);
            }
        }
    }

    private static CuentaBancaria buscarCuentaPorId(int id) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getId() == id) {
                return cuenta;
            }
        }
        return null;
    }
}