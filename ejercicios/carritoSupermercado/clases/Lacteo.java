package clases;

public record Lacteo(String nombre, double precio, int cantidad, int proteinas) implements Producto {
    @Override
    public String getNombre() { return nombre; }
    
    @Override
    public double getPrecio() { return precio; }
}

