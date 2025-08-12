package ciclos;

import java.util.Scanner;

public class Ejercicio2BucleFor {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad = 0;
        int menor = Integer.MAX_VALUE; 

        System.out.print("cuántos números quieres comparar? (mínimo 10): ");
        cantidad = entrada.nextInt();

        if (cantidad < 10) {
            System.out.println("Debes ingresar al menos 10 números... Saliendo del programa");
            System.exit(-1); 
        }

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int num = entrada.nextInt();

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("El menor número ingresado es: " + menor);

        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
    
}
