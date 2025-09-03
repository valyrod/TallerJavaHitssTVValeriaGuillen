package modelos.concretos;

import modelos.abstractos.Canino;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double peso, String nombreCientifico, String color, double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo come carne en la manada.";
    }

    @Override
    public String dormir() {
        return "El lobo duerme en la madriguera.";
    }

    @Override
    public String correr() {
        return "El lobo corre por el bosque.";
    }

    @Override
    public String comunicarse() {
        return "El lobo aúlla.";
    }
}

