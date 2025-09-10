package clases;

public record NoPerecible(String nombre, double precio, int calorias) implements Producto {
    @Override
    public String getNombre() { return nombre; }
    
    @Override
    public double getPrecio() { return precio; }
}

