package modelos.concretos;

import modelos.abstractos.Felino;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double peso, String nombreCientifico, double tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre come carne.";
    }

    @Override
    public String dormir() {
        return "El tigre duerme en la selva.";
    }

    @Override
    public String correr() {
        return "El tigre corre muy rápido.";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge.";
    }
}

