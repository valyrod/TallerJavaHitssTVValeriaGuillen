package modelos.abstractos;

public abstract class Canino extends Mamifero {
    protected String color;
    protected double tamanioColmillos;

    public Canino(String habitat, double altura, double peso, String nombreCientifico, String color, double tamanioColmillos) {
        super(habitat, altura, peso, tamanioColmillos, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    public String getColor() {
        return color;
    }

    public double getTamanioColmillos() {
        return tamanioColmillos;
    }
}

