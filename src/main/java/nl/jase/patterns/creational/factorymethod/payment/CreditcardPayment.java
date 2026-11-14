package nl.jase.patterns.creational.factorymethod.payment;

import java.math.BigDecimal;

public class CreditcardPayment implements Payment {
    @Override
    public String pay(BigDecimal amount) {
        return "Creditcard betaling: € %s".formatted(amount);
    }
}
