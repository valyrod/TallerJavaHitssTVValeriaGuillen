package enums;

public enum OrderStatus {
    NEW("Pedido creado"),
    PROCESSING("Pedido en proceso"),
    SHIPPED("Pedido enviado"),
    DELIVERED("Pedido entregado"),
    CANCELLED("Pedido cancelado");

    private final String descripcion;

    OrderStatus(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}