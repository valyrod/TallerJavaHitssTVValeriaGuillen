package test;

import interfaz.*;

public class TestMain {
    public static void main(String[] args) {
        ProcesadorTexto procesador = texto -> texto.replaceAll("[\\s,.]+", "").toUpperCase();
        
        String frase1 = "   Texto con   muchos                 espacios, comas. y puntos...   ";

        System.out.println("\nFrase original: " + frase1);
        System.out.println("Frase procesada: " + procesador.procesar(frase1));
    }
}

