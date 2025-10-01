package clases;

import java.util.List;

public class Venta {
    private int id;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> productos;
    private double total;

    public Venta() {}

    public Venta(int id, Cliente cliente, Empleado empleado, List<Producto> productos, double total) {
        this.id = id;
        this.cliente = cliente;
        this.empleado = empleado;
        this.productos = productos;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", empleado=" + empleado +
                ", productos=" + productos +
                ", total=" + total +
                '}';
    }
}

