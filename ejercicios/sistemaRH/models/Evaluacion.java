package models;

public class Evaluacion {
    private int anio;
    private int puntaje;

    public Evaluacion(int año, int puntaje) {
        this.anio = año;
        this.puntaje = puntaje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int año) {
        this.anio = año;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Año " + anio + ": " + puntaje + " puntos";
    }
}

