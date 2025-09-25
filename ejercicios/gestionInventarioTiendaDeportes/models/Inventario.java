package models;

import java.util.TreeMap;

public class Inventario {
    
    public Producto buscarProductoPorSKU(TreeMap<String, Producto> inventario, String sku) {
        for (Producto p : inventario.values()) {
            if (p.getSku().equals(sku)) {
                return p;
            }
        }
        return null;
    }

    public void actualizarStock(TreeMap<String, Producto> inventario, String sku, int cantidad) {
        Producto producto = buscarProductoPorSKU(inventario, sku);
        if (producto != null) {
            producto.setStock(producto.getStock() + cantidad);
            System.out.println("\nStock actualizado para " + producto.getNombre() + ": " + producto.getStock());
        } else {
            System.out.println("\nProducto con SKU " + sku + " no encontrado.");
        }
    }
}

