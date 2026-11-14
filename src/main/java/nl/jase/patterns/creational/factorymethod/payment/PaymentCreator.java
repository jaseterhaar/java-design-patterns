package nl.jase.patterns.creational.factorymethod.payment;

import java.math.BigDecimal;

public abstract class PaymentCreator {
    public abstract Payment createPayment();

    public String processPayment(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }

        return createPayment().pay(amount);
    }
}
