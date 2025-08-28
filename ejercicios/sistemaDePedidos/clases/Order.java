package clases;

import enums.OrderStatus;
import enums.OrderPriority;
import enums.PaymentMethod;

public class Order {

    private int id;
    private String customer;
    private OrderStatus status;
    private OrderPriority priority;
    private PaymentMethod paymentMethod;

    public Order(int id, String customer, OrderStatus status, OrderPriority priority, PaymentMethod paymentMethod) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    public void showDetails() {
        System.out.println("Pedido #" + this.id);
        System.out.println("Cliente: " + this.customer);
        System.out.println("Estado: " + this.status + " -> " + this.status.getDescripcion());
        System.out.println("Prioridad: " + this.priority + " (Nivel " + this.priority.getLevel() + ")");
        System.out.println("Método de pago: " + this.paymentMethod + " -> " + this.paymentMethod.getDescripcion());
        System.out.println();
    }
}