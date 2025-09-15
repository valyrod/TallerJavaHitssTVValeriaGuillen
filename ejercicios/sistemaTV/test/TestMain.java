package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import entidades.Cliente;
import genericos.ServicioGenerico;
import entidades.Factura;
import entidades.Producto;
import clase.claseMetEst;

// Sistema de facturación, utilizando las siguientes entidades:
        // -> Cliente
        // -> Producto
        // -> Factura

        // Un servicio generico con las siguientes operaciones:
        // -> Guardar(agregar) elementos
        // -> Listar los elementos
        // -> Buscar por ID
        // -> Eliminar por ID
        // -> Actualizar por ID

        // Interfaz generica identificable, que obligue a cada entidad 
        // Tener un método getId()
public class TestMain {

    public static void main(String[] args) {
        ServicioGenerico<Cliente, String> servicioCliente = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> servicioProducto = new ServicioGenerico<>();
        ServicioGenerico<Factura, Long> servicioFactura = new ServicioGenerico<>();

        //Tratar de crear un servicio para Proveedor, nos da error
        //ServicioGenerico<Proveedor, Integer> servicioProveedor = new ServicioGenerico<>();

        // Crear clientes
        Cliente cliente1 = new Cliente("C001", "Juan Perez", "juan.perez@example.com");
        Cliente cliente2 = new Cliente("C001", "Maria Gomez", "maria.gomez@example.com");
        Cliente cliente3 = new Cliente("C002", "Carlos Lopez", "carlos.lopez@example.com");

        // Agregar clientes al servicio
        servicioCliente.agregar(cliente1);
        servicioCliente.agregar(cliente2);  // Intento de agregar un cliente con ID duplicado
        servicioCliente.agregar(cliente3);

        //Productos
        Producto producto1 = new Producto(101, "Laptop", 1500.00);
        Producto producto2 = new Producto(102, "Smartphone", 800.00);
        Producto producto3 = new Producto(103, "Tablet", 300.00);

        // Agregar productos al servicio
        servicioProducto.agregar(producto1);
        servicioProducto.agregar(producto2);
        servicioProducto.agregar(producto3); 

        // // Crear facturas
        Factura factura1 = new Factura(1L, cliente1, new ArrayList<Producto>(Arrays.asList(producto1, producto2)));
        Factura factura2 = new Factura(2L, cliente3, new ArrayList<Producto>(Arrays.asList(producto2, producto3)));
        Factura factura3 = new Factura(3L, cliente2, new ArrayList<Producto>(Arrays.asList(producto1, producto3)));

        //Actualizar cliente con ID
        System.out.println("\n--- Actualizar Cliente con ID C002 ---");
        servicioCliente.actualizarPorId("C002", new Cliente("C002", "Carlos Lopez Updated", "carlos.lopez.updated@example.com"));

        //Eliminar cliente con ID
        System.out.println("\n--- Eliminar Cliente con ID C003 ---");
        Cliente cliente4 = new Cliente("C003", "Ana Torres", "ana.torres@example.com");
        servicioCliente.agregar(cliente4);
        for (Cliente cliente : servicioCliente.listar()) {
            System.out.println(cliente);
        }
        servicioCliente.eliminarPorId("C003"); 

        // Agregar y eliminar un producto de forma dinamica a la factura
        System.out.println("Modificando factura, en la lista de productos:");
        factura2.agregarProducto(producto3);
        factura2.eliminarProducto(102); 
        
        System.out.println(factura2);

        System.out.println("\n===== Operaciones de Facturas en Archivos =====");
        claseMetEst.guardarFactura(factura1);
        claseMetEst.guardarFactura(factura2);
        claseMetEst.guardarFactura(factura3);

        System.out.println("\n===== Leyendo Facturas desde Archivos =====");
        claseMetEst.leerFactura(1L);
        claseMetEst.leerFactura(2L);
        claseMetEst.leerFactura(3L);

        System.out.println("\n===== Listando Facturas desde Archivos =====");
        claseMetEst.listarFacturas();
    }
}





