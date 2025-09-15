package entidades;

import java.util.List;

import genericos.Identificable;

public class Factura implements Identificable<Long> {
    private Long id;
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Long id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
    }

    //Construcción de Factura
    public String generarFactura(){
        StringBuilder factura = new StringBuilder();
        String lineaJustificada = String.format("%" + 36 + "s", "Factura # " + id);
        factura.append(lineaJustificada).append("\n");
        factura.append("Cliente: ").append(cliente.getNombre()).append("\n");
        factura.append("------------------------------------\n");
        for (Producto producto : productos) {
            factura.append("* ").append(producto.getDescripcion()).append("\t: $").append(producto.getPrecio()).append("\n");
        }
        factura.append("------------------------------------\n");
        lineaJustificada = String.format("%" + 36 + "s", "Total: $ " + calcularTotal());
        factura.append(lineaJustificada).append("\n");
        factura.append("====================================\n");
        return factura.toString();
    }

     @Override
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    //Método dinamico para agregar productos a la factura
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado a la factura: " + producto);
    }

    //Eliminar un producto de la factura de forma dinamica
    public boolean eliminarProducto(int idProducto) {
       for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getId() == idProducto){
                productos.remove(i); // Eliminar el producto de la lista
                System.out.println("Eliminado producto con ID: " + idProducto);
                return true;
            }
        }
        System.out.println("Producto con ID: " + idProducto + " no encontrado.");
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Factura [id:" + id + ", cliente:" + cliente + ", productos:" + productos + " total:" + calcularTotal() + "]";
    }
    
}





