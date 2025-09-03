package modelos.concretos;

import modelos.abstractos.Felino;

public class Leon extends Felino {
    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, double altura, double peso, String nombreCientifico, double tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El Leon caza junto a su grupo de " + numManada + " individuos en las llanuras africanas.";
    }

    @Override
    public String dormir() {
        return "El Leon duerme en las cuevas de la manada.";
    }

    @Override
    public String correr() {
        return "El Leon corre por la sabana.";
    }

    @Override
    public String comunicarse() {
        return "El Leon ruge con una potencia de " + potenciaRugidoDecibel + " decibelios.";
    }
}

