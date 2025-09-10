package clases;

public record Limpieza(String nombre, double precio, String componentes, double litros) implements Producto {
    @Override
    public String getNombre() { return nombre; }
    
    @Override
    public double getPrecio() { return precio; }
}
