package enums;

public enum PaymentMethod {
    CASH("Efectivo"),
    CARD("Tarjeta de crédito/débito"),
    TRANSFER("Transferencia bancaria");

    private final String descripcion;

    PaymentMethod(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}