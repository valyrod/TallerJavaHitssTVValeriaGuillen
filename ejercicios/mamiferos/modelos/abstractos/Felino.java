package modelos.abstractos;

public abstract class Felino extends Mamifero {
    protected double tamanioGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, peso, velocidad, nombreCientifico);
        this.tamanioGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public double getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}

