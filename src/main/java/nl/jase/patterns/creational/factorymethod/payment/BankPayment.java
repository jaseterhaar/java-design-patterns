package nl.jase.patterns.creational.factorymethod.payment;

import java.math.BigDecimal;

public class BankPayment implements Payment {

    public String pay(BigDecimal amount) {
        return "Bankoverschrijving: € %s".formatted(amount);
    }
}
