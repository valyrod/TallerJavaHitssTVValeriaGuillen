package arreglos;

import java.util.Scanner;

public class MatricesEjercicio3 {

    public static void main(String[] args) {  
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Ingrese el tamaño de la matriz (n): ");
       int n = scanner.nextInt();
       
       final int FILAS = n, COLUMNAS = n;
        char[][] matriz = new char[FILAS][COLUMNAS];

        if (matriz.length == 0) {
            System.out.println("\nERROR\n");
            System.exit(1);
        } else {
            System.out.println("Matriz generada:");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || (i + j == n - 1)) {
                    matriz[i][j] = 'X'; 
                } else {
                    matriz[i][j] = '_'; 
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

    }
    
}
