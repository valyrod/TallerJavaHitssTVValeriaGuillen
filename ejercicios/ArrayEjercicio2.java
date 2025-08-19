package arreglos;

import java.util.Arrays;

public class ArrayEjercicio2 {

    public static void main(String[] args) {
        final int RANGO = 10;
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        Arrays.sort(numeros); 
        System.out.println(Arrays.toString(numeros));
        
        int[] repeticiones = new int[10]; 
        
        for (int numero : numeros) {
            repeticiones[numero]++;
        }

        int numeroMasRepetido = -1;
        int mayorOcurrencia = 0;

        for (int j = 1; j < repeticiones.length; j++) { 
            if (repeticiones[j] > mayorOcurrencia) {
                mayorOcurrencia = repeticiones[j];
                numeroMasRepetido = j;
            }
        }

        System.out.println("\n==========Resultados==========");
        System.out.println("1. La mayor ocurrencias es: " + mayorOcurrencia);
        System.out.println("2. El elemento que mas se repite es: " + numeroMasRepetido);
    }
}




