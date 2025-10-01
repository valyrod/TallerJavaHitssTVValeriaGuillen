package test;

import clases.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class TestMain {
        
    private TestMain() {}
    
    public static void main(String[] args) {
        SupermercadoService service = new SupermercadoService();
        
        System.out.println("=== SISTEMA DE PUNTO DE VENTA SUPERMERCADO ===\n");

        System.out.println("1. FILTRAR PRODUCTOS CON STOCK BAJO:");
        Predicate<Producto> filtrarStockBajo = producto -> producto.getStock() < 5;
        List<Producto> inventario = service.getInventario();
        List<Producto> productosBajos = inventario.stream()
                .filter(filtrarStockBajo)
                .collect(java.util.stream.Collectors.toList());
        System.out.println("Productos con stock < 5:");
        productosBajos.forEach(p -> System.out.println("  " + p.getNombre() + " (Stock: " + p.getStock() + ")"));
        System.out.println();

        System.out.println("2. CALCULAR TOTAL DE VENTA:");
        Function<List<Producto>, Double> calcularTotalVenta = 
            productos -> productos.stream()
                        .mapToDouble(Producto::getPrecio)
                        .sum();
        List<Producto> productosParaVenta = Arrays.asList(
            new Producto(1, "Leche", 25.50, 3),
            new Producto(2, "Pan", 15.00, 20),
            new Producto(3, "Huevos", 35.00, 2)
        );
        double total = calcularTotalVenta.apply(productosParaVenta);
        System.out.println("Productos para venta:");
        productosParaVenta.forEach(p -> System.out.println("  " + p.getNombre() + ": $" + p.getPrecio()));
        System.out.println("Total calculado: $" + String.format("%.2f", total));
        System.out.println();

        System.out.println("3. IMPRIMIR DETALLES DE VENTA:");
        Consumer<Venta> imprimirDetallesVenta = venta -> {
            System.out.println("=== DETALLES DE VENTA ===");
            System.out.println("ID Venta: " + venta.getId());
            System.out.println("Cliente: " + venta.getCliente().getNombre() + " (" + venta.getCliente().getTipo() + ")");
            System.out.println("Empleado: " + venta.getEmpleado().getNombre() + " - " + venta.getEmpleado().getPuesto());
            System.out.println("Productos:");
            venta.getProductos().forEach(p -> System.out.println("  - " + p.getNombre() + ": $" + p.getPrecio()));
            System.out.println("Total: $" + venta.getTotal());
            System.out.println("========================");
        };
        Cliente clienteEjemplo = new Cliente(1, "Juan Pérez", "Normal");
        Empleado empleadoEjemplo = new Empleado(1, "Ana Martínez", "Cajera");
        Venta ventaEjemplo = new Venta(1, clienteEjemplo, empleadoEjemplo, productosParaVenta, total);
        System.out.println("Mostrando detalles de venta:");
        imprimirDetallesVenta.accept(ventaEjemplo);
        System.out.println();

        System.out.println("4. GENERAR PRODUCTO DE MUESTRA:");
        Supplier<Producto> generarProductoMuestra = 
            () -> new Producto(999, "Producto de prueba", 99.99, 10);
        Producto productoMuestra = generarProductoMuestra.get();
        System.out.println("Producto generado: " + productoMuestra.getNombre() + 
                          " - Precio: $" + productoMuestra.getPrecio() + 
                          " - Stock: " + productoMuestra.getStock());
        System.out.println();

        System.out.println("5. APLICAR DESCUENTO DEL 10%:");
        UnaryOperator<Producto> aplicarDescuento10 = producto -> {
            Producto productoConDescuento = new Producto();
            productoConDescuento.setId(producto.getId());
            productoConDescuento.setNombre(producto.getNombre());
            productoConDescuento.setPrecio(producto.getPrecio() * 0.9);
            productoConDescuento.setStock(producto.getStock());
            return productoConDescuento;
        };
        Producto productoOriginal = new Producto(10, "Televisor", 5000.00, 5);
        Producto productoConDescuento = aplicarDescuento10.apply(productoOriginal);
        System.out.println("Producto original: " + productoOriginal.getNombre() + " - $" + productoOriginal.getPrecio());
        System.out.println("Producto con 10% descuento: " + productoConDescuento.getNombre() + " - $" + String.format("%.2f", productoConDescuento.getPrecio()));
        System.out.println("Ahorro: $" + String.format("%.2f", productoOriginal.getPrecio() - productoConDescuento.getPrecio()));
        System.out.println();

        System.out.println("6. COMPARAR PRODUCTOS - MÁS CARO:");
        BinaryOperator<Producto> compararProductosMasCaro = 
            (p1, p2) -> p1.getPrecio() > p2.getPrecio() ? p1 : p2;
        Producto producto1 = new Producto(11, "Laptop", 15000.00, 3);
        Producto producto2 = new Producto(12, "Mouse", 200.00, 10);
        Producto masCaro = compararProductosMasCaro.apply(producto1, producto2);
        System.out.println("Producto 1: " + producto1.getNombre() + " - $" + producto1.getPrecio());
        System.out.println("Producto 2: " + producto2.getNombre() + " - $" + producto2.getPrecio());
        System.out.println("Más caro: " + masCaro.getNombre() + " - $" + masCaro.getPrecio());
        System.out.println();

        System.out.println("7. VERIFICAR DESCUENTO PARA CLIENTE:");
        BiPredicate<Cliente, Double> verificarDescuentoCliente = 
            (cliente, monto) -> "VIP".equals(cliente.getTipo()) && monto > 1000;
        Cliente clienteVIP = new Cliente(2, "María González", "VIP");
        Cliente clienteNormal = new Cliente(1, "Juan Pérez", "Normal");
        
        boolean descuentoVIP = verificarDescuentoCliente.test(clienteVIP, 1500.00);
        boolean descuentoNormal = verificarDescuentoCliente.test(clienteNormal, 1500.00);
        boolean descuentoVIPbajo = verificarDescuentoCliente.test(clienteVIP, 500.00);
        
        System.out.println("Cliente VIP con compra $1500: " + (descuentoVIP ? "Tiene descuento" : "No tiene descuento"));
        System.out.println("Cliente Normal con compra $1500: " + (descuentoNormal ? "Tiene descuento" : "No tiene descuento"));
        System.out.println("Cliente VIP con compra $500: " + (descuentoVIPbajo ? "Tiene descuento" : "No tiene descuento"));
        System.out.println();

        System.out.println("8. GENERAR TICKET DE VENTA:");
        BiConsumer<Cliente, Venta> generarTicketVenta = (cliente, venta) -> {
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
        };
        System.out.println("Generando ticket de ejemplo:");
        generarTicketVenta.accept(clienteEjemplo, ventaEjemplo);
        System.out.println();

        System.out.println("9. NOTIFICAR COMPRA PROCESADA:");
        BiConsumer<Cliente, Empleado> notificarCompraProcesada = 
            (cliente, empleado) -> System.out.println(
                "Estimado " + cliente.getNombre() + 
                ", su compra ha sido procesada por " + 
                empleado.getNombre() + " (" + empleado.getPuesto() + ")."
            );
        System.out.println("Notificación:");
        notificarCompraProcesada.accept(clienteEjemplo, empleadoEjemplo);
        System.out.println();

        System.out.println("10. REGISTRAR VENTA COMPLETA:");
        try {
            List<Producto> compra = Arrays.asList(
                new Producto(1, "Leche", 25.50, 3),
                new Producto(4, "Arroz", 45.00, 15),
                new Producto(5, "Aceite", 80.00, 8)
            );
            
            System.out.println("Registrando venta para cliente VIP...");
            Venta ventaRegistrada = service.registrarVenta(2, 1, compra);
            System.out.println("Venta registrada exitosamente! ID: " + ventaRegistrada.getId());
            
        } catch (Exception e) {
            System.err.println("Error al registrar venta: " + e.getMessage());
        }
    }
}
