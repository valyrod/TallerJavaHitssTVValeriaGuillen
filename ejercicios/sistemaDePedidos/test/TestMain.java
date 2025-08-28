package test;

import clases.Order;
import enums.OrderStatus;
import enums.OrderPriority;
import enums.PaymentMethod;

public class TestMain {
    public static void main(String[] args) {

        Order order1 = new Order(1, "Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order order2 = new Order(2, "Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order order3 = new Order(3, "Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);
        Order order4 = new Order(4, "Carlos", OrderStatus.CANCELLED, OrderPriority.LOW, PaymentMethod.TRANSFER);

        order1.showDetails();
        order2.showDetails();
        order3.showDetails();
        order4.showDetails();

    }
}