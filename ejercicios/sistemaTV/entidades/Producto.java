package entidades;

import genericos.Identificable;

public class Producto implements Identificable<Integer> {
    private Integer id;
    private String descripcion;
    private double precio;

    public Producto(Integer id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Producto [id: " + id + ", descripcion: " + descripcion + ", precio: " + precio + "]";
    }
}






