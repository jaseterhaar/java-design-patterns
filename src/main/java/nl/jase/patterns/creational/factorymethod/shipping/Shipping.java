package nl.jase.patterns.creational.factorymethod.shipping;

import java.math.BigDecimal;

public interface Shipping {

    String ship(String orderId);
    BigDecimal getCost();
}