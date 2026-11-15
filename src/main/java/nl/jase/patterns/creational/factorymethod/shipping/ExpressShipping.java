package nl.jase.patterns.creational.factorymethod.shipping;

import java.math.BigDecimal;

public class ExpressShipping implements Shipping {

    @Override
    public String ship(String orderId) {
        return "Express shipping for order %s".formatted(orderId);
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("12.50");
    }
}
