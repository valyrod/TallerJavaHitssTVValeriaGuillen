package test;

import modelos.abstractos.Mamifero;
import modelos.concretos.*;


public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Leon leon = new Leon("Sabana africana", 1.20f, 190.0f, "Panthera leo", 7.5f, 58, 20, 120.0f);
        Guepardo guepardo = new Guepardo("Sabana africana", 0.9f, 60.0f, "Acinonyx jubatus", 4.9f, 130);
        Lobo lobo = new Lobo("Bosques y tundras", 0.8f, 40.0f, "Canis lupus", "Gris", 3.5f, 8, "Lobo gris");
        Perro perro = new Perro("Doméstico", 0.5f, 25.0f, "Canis familiaris", "Marrón", 2.0f, 250);
        Tigre tigre = new Tigre("Selva tropical", 1.0f, 200.0f, "Panthera tigris", 8.0f, 65, "Bengala");

        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = tigre;
        mamiferos[5] = new Leon("Sabana africana", 1.1f, 180.0f, "Panthera leo", 7.0f, 55, 15, 110.0f);

        System.out.println("\n**************************************************");
        System.out.println("*             MAMÍFEROS DEL ZOOLOGICO            *");
        System.out.println("**************************************************");

        for (Mamifero m : mamiferos) {
            String titulo = "Datos de la especie: " + m.getClass().getSimpleName();
            System.out.println("\n------------------------------------------------");
            System.out.println("            " + titulo + "                ");
            System.out.println("------------------------------------------------");
            System.out.println("Nombre Científico: " + m.getNombreCientifico());
            System.out.println("Hábitat: " + m.getHabitat());
            System.out.println("Altura: " + m.getAltura() + " m");
            System.out.println("Peso: " + m.getPeso() + " kg");
            System.out.println("Acción: " + m.comer());
            System.out.println("Acción: " + m.dormir());
            System.out.println("Acción: " + m.correr());
            System.out.println("Acción: " + m.comunicarse() + "\n");

            if (m instanceof Leon) {
                Leon l = (Leon) m;
                System.out.println("Número de Manada: " + l.getNumManada());
                System.out.println("Potencia de Rugido: " + l.getPotenciaRugidoDecibel() + " dB");
            } else if (m instanceof Guepardo) {
                Guepardo g = (Guepardo) m;
                System.out.println("Velocidad: " + g.getVelocidad() + " km/h");
            } else if (m instanceof Tigre) {
                Tigre t = (Tigre) m;
                System.out.println("Especie de Tigre: " + t.getEspecieTigre());
            } else if (m instanceof Lobo) {
                Lobo lo = (Lobo) m;
                System.out.println("Número de Camada: " + lo.getNumCamada());
                System.out.println("Especie de Lobo: " + lo.getEspecieLobo());
            } else if (m instanceof Perro) {
                Perro p = (Perro) m;
                System.out.println("Fuerza de Mordida: " + p.getFuerzaMordidaPsi() + " PSI");
            }
        }
    }
}

