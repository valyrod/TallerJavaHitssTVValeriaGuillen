package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class SupermercadoService {
    
    private List<Producto> inventario;
    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Venta> ventas;

    public SupermercadoService() {
        this.inventario = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.ventas = new ArrayList<>();
        inicializarDatos();
    }

    private void inicializarDatos() {
        inventario.add(new Producto(1, "Leche", 25.50, 3));
        inventario.add(new Producto(2, "Pan", 15.00, 20));
        inventario.add(new Producto(3, "Huevos", 35.00, 2));
        inventario.add(new Producto(4, "Arroz", 45.00, 15));
        inventario.add(new Producto(5, "Aceite", 80.00, 8));

        clientes.add(new Cliente(1, "Juan Pérez", "Normal"));
        clientes.add(new Cliente(2, "María González", "VIP"));
        clientes.add(new Cliente(3, "Carlos López", "VIP"));

        empleados.add(new Empleado(1, "Ana Martínez", "Cajera"));
        empleados.add(new Empleado(2, "Pedro Sánchez", "Supervisor"));
    }

    public List<Producto> obtenerProductosStockBajo() {
        return inventario.stream()
                .filter(producto -> producto.getStock() < 5)
                .collect(Collectors.toList());
    }

    public double calcularTotalVenta(List<Producto> productos) {
        return productos.stream()
                    .mapToDouble(Producto::getPrecio)
                    .sum();
    }

    public void mostrarDetallesVenta(Venta venta) {
        System.out.println("=== DETALLES DE VENTA ===");
        System.out.println("ID Venta: " + venta.getId());
        System.out.println("Cliente: " + venta.getCliente().getNombre() + " (" + venta.getCliente().getTipo() + ")");
        System.out.println("Empleado: " + venta.getEmpleado().getNombre() + " - " + venta.getEmpleado().getPuesto());
        System.out.println("Productos:");
        venta.getProductos().forEach(p -> System.out.println("  - " + p.getNombre() + ": $" + p.getPrecio()));
        System.out.println("Total: $" + venta.getTotal());
        System.out.println("========================");
    }

    public Producto crearProductoMuestra() {
        return new Producto(999, "Producto de prueba", 99.99, 10);
    }

    public Producto aplicarDescuentoProducto(Producto producto) {
        Producto productoConDescuento = new Producto();
        productoConDescuento.setId(producto.getId());
        productoConDescuento.setNombre(producto.getNombre());
        productoConDescuento.setPrecio(producto.getPrecio() * 0.9);
        productoConDescuento.setStock(producto.getStock());
        return productoConDescuento;
    }

    public Producto obtenerProductoMasCaro(Producto p1, Producto p2) {
        return p1.getPrecio() > p2.getPrecio() ? p1 : p2;
    }

    public boolean clienteTieneDescuento(Cliente cliente, double monto) {
        return "VIP".equals(cliente.getTipo()) && monto > 1000;
    }

    public void generarTicket(Cliente cliente, Venta venta) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = ahora.format(formatter);
        
        System.out.println("\n=== TICKET DE VENTA ===");
        System.out.println("Fecha: " + fechaFormateada);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("ID Cliente: " + cliente.getId());
        System.out.println("Empleado: " + venta.getEmpleado().getNombre());
        System.out.println("ID Venta: " + venta.getId());
        System.out.println("------------------------");
        venta.getProductos().forEach(p -> 
            System.out.println(p.getNombre() + " x1 - $" + p.getPrecio()));
        System.out.println("------------------------");
        System.out.println("TOTAL: $" + String.format("%.2f", venta.getTotal()));
        System.out.println("========================\n");
    }

    public void notificarCompra(Cliente cliente, Empleado empleado) {
        System.out.println(
            "Estimado " + cliente.getNombre() + 
            ", su compra ha sido procesada por " + 
            empleado.getNombre() + " (" + empleado.getPuesto() + ")."
        );
    }

    public Venta registrarVenta(int idCliente, int idEmpleado, List<Producto> productosComprados) {
        Cliente cliente = clientes.stream()
                .filter(c -> c.getId() == idCliente)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Empleado empleado = empleados.stream()
                .filter(e -> e.getId() == idEmpleado)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado"));

        double total = calcularTotalVenta(productosComprados);
        
        if (clienteTieneDescuento(cliente, total)) {
            total *= 0.9;
        }

        Venta venta = new Venta(ventas.size() + 1, cliente, empleado, productosComprados, total);
        ventas.add(venta);

        notificarCompra(cliente, empleado);
        generarTicket(cliente, venta);

        return venta;
    }

    public List<Producto> getInventario() { return inventario; }
    public List<Cliente> getClientes() { return clientes; }
    public List<Empleado> getEmpleados() { return empleados; }
}

