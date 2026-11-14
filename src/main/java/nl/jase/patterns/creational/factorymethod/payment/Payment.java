package nl.jase.patterns.creational.factorymethod.payment;

import java.math.BigDecimal;

public interface Payment {

    String pay(BigDecimal amount);
}