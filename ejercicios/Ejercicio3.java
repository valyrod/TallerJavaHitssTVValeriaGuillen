package ciclos;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaMy6 = 0;
        int contadorMy6 = 0;

        double sumaMen6 = 0;
        int contadorMen6 = 0;

        int contadorNi1 = 0;

        double sumaTotal = 0;
        int totalNotas = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota #" + i + " (1.0 a 10.0): ");
            double nota = sc.nextDouble();

            if (nota < 1.0 || nota > 10.0) {
                System.out.println("ERROR: La nota debe estar entre 1.0 y 10.0. Programa finalizado.");
                totalNotas = 0;
                break;
            }

            totalNotas++;
            sumaTotal += nota;

            if (nota >= 6.0) {
                sumaMy6 += nota;
                contadorMy6++;
            } else {
                sumaMen6 += nota;
                contadorMen6++;
            }

            if (nota == 1.0) {
                contadorNi1++;
            }
        }

        if (totalNotas > 0) {
            System.out.println("\nResultados:");
            if (contadorMy6 > 0) {
                System.out.println("Promedio de notas >= 6: " + (sumaMy6 / contadorMy6));
            } else {
                System.out.println("No hay notas mayores o iguales a 6.");
            }

            if (contadorMen6 > 0) {
                System.out.println("Promedio de notas < 6: " + (sumaMen6 / contadorMen6));
            } else {
                System.out.println("No hay notas menores a 6.");
            }

            System.out.println("Cantidad de notas iguales a 1: " + contadorNi1);
            System.out.println("Promedio total: " + (sumaTotal / totalNotas));
        }

        sc.close();
    }
}


