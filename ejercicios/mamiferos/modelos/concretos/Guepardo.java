package modelos.concretos;

import modelos.abstractos.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, double altura, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo come antílopes.";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en la sabana.";
    }

    @Override
    public String correr() {
        return "El guepardo corre a gran velocidad.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo maulla.";
    }
}

