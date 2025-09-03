package modelos.concretos;

import modelos.abstractos.Canino;

public class Perro extends Canino {
    private int fuerzaMordidaPsi;

    public Perro(String habitat, double altura, double peso, String nombreCientifico, String color, double tamanoColmillos, int fuerzaMordidaPsi) {
        super(habitat, altura, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordidaPsi = fuerzaMordidaPsi;
    }

    public int getFuerzaMordidaPsi() {
        return fuerzaMordidaPsi;
    }

    @Override
    public String comer() {
        return "El perro come su alimento.";
    }

    @Override
    public String dormir() {
        return "El perro duerme en su cama.";
    }

    @Override
    public String correr() {
        return "El perro corre en el parque.";
    }

    @Override
    public String comunicarse() {
        return "El perro ladra.";
    }
}

