package test;

import java.util.*;
import interfaz.ContadorPalabras;

public class TestMain {
    public static void main(String[] args) {
        ContadorPalabras contador = frase -> {
            if (frase == null || frase.trim().isEmpty()) {
                return new HashMap<>();
            }
            
            String[] palabras = frase.toLowerCase().split("\\s+");
            
            Map<String, Integer> frecuencia = new HashMap<>();
            for (String palabra : palabras) {
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
            
            String palabraMax = "";
            int maxFrecuencia = 0;
            
            for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
                if (entry.getValue() > maxFrecuencia) {
                    maxFrecuencia = entry.getValue();
                    palabraMax = entry.getKey();
                }
            }
            
            Map<String, Integer> resultado = new HashMap<>();
            resultado.put(palabraMax, maxFrecuencia);
            
            return resultado;
        };

        String frase = "Pablito clavó un clavito, ¿qué clavito clavó Pablito?  \n" + 
                        "Pablito clavó un clavito en la calva de un calvito.  \n" + 
                        "";
        Map<String, Integer> resultado = contador.palabraMasRepetida(frase);
        
        System.out.println("\nFrase: " + frase);
        System.out.println("\n========== Resultado ==========");
        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
            System.out.println("Palabra más repetida: " + entry.getKey());
            System.out.println("Cantidad: " + entry.getValue());
        }
    }
}
