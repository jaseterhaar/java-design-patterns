package nl.jase.patterns.creational.factorymethod.shipping;

import java.math.BigDecimal;

public class StandardShipping implements Shipping {

    @Override
    public String ship(String orderId) {
        return "Standard shipping for order %s".formatted(orderId);
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("4.95");
    }
}
