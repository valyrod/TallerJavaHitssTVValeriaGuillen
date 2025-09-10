package clases;

public record Fruta(String nombre, double precio, double peso, String color) implements Producto {
    @Override
    public String getNombre() { return nombre; }
    
    @Override
    public double getPrecio() { return precio; }
}
