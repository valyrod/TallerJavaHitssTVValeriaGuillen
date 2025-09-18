package list;

import java.util.*;

class TablaConsola {
    private ArrayList<String[]> filas;
    private String[] encabezados;
    private int[] anchosColumnas;

    public TablaConsola() {
        filas = new ArrayList<>();
    }

    public void agregarEncabezado(String... columnas) {
        this.encabezados = columnas;
        calcularAnchos();
    }

    public void agregarFila(String... columnas) {
        filas.add(columnas);
        calcularAnchos();
    }

    private void calcularAnchos() {
        if (encabezados == null) return;
        
        anchosColumnas = new int[encabezados.length];
        
        for (int i = 0; i < encabezados.length; i++) {
            anchosColumnas[i] = encabezados[i].length();
        }
        
        for (String[] fila : filas) {
            for (int i = 0; i < fila.length && i < anchosColumnas.length; i++) {
                if (fila[i].length() > anchosColumnas[i]) {
                    anchosColumnas[i] = fila[i].length();
                }
            }
        }
    }

    public void mostrar() {
        imprimirLinea();
        imprimirEncabezados();
        imprimirLinea();
        imprimirFilas();
        imprimirLinea();
    }

    private void imprimirLinea() {
        System.out.print("+");
        for (int ancho : anchosColumnas) {
            for (int i = 0; i < ancho + 2; i++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();
    }

    private void imprimirEncabezados() {
        System.out.print("|");
        for (int i = 0; i < encabezados.length; i++) {
            System.out.printf(" %-" + anchosColumnas[i] + "s |", encabezados[i]);
        }
        System.out.println();
    }

    private void imprimirFilas() {
        for (String[] fila : filas) {
            System.out.print("|");
            for (int i = 0; i < fila.length; i++) {
                String valor = i < fila.length ? fila[i] : "";
                if (i == fila.length - 1 && esNumero(valor)) {
                    System.out.printf(" %" + anchosColumnas[i] + "s |", valor);
                } else {
                    System.out.printf(" %-" + anchosColumnas[i] + "s |", valor);
                }
            }
            System.out.println();
        }
    }

    private boolean esNumero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
