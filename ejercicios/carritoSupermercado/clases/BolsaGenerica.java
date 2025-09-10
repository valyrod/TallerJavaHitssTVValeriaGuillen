package clases;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T extends Producto> {
    private List<T> productos;
    private String tipoBolsa;
    
    public BolsaGenerica(String tipoBolsa) {
        this.productos = new ArrayList<>();
        this.tipoBolsa = tipoBolsa;
    }
    
    public void agregarProducto(T producto) {
        productos.add(producto);
    }
    
    public List<T> getProductos() {
        return productos;
    }
    
    public String getTipoBolsa() {
        return tipoBolsa;
    }
    
    public int getCantidadProductos() {
        return productos.size();
    }
    
    public double getTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
    
    public void mostrarDetalles() {
        System.out.println("--- BOLSA DE " + tipoBolsa.toUpperCase() + " ---");
        
        for (T producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: $" + String.format("%.2f", producto.getPrecio()));
            
            if (producto instanceof Lacteo lacteo) {
                System.out.println("Cantidad: " + lacteo.cantidad() + " ml");
                System.out.println("Proteínas: " + lacteo.proteinas() + " g");
            } else if (producto instanceof Fruta fruta) {
                System.out.println("Peso: " + fruta.peso() + " kg");
                System.out.println("Color: " + fruta.color());
            } else if (producto instanceof Limpieza limpieza) {
                System.out.println("Componentes: " + limpieza.componentes());
                System.out.println("Litros: " + limpieza.litros() + " L");
            } else if (producto instanceof NoPerecible noPerecible) {
                System.out.println("Calorías: " + noPerecible.calorias());
            }
            
            System.out.println("----------------------");
        }
        
        System.out.println("TOTAL " + tipoBolsa.toUpperCase() + ": $" + String.format("%.2f", getTotal()));
        System.out.println();
    }
}

