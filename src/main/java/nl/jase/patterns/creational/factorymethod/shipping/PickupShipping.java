package nl.jase.patterns.creational.factorymethod.shipping;

import java.math.BigDecimal;

public class PickupShipping implements Shipping {

    @Override
    public String ship(String orderId) {
        return "Pickup shipping for order %s".formatted(orderId);
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(0.00);
    }
}
