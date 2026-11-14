package nl.jase.patterns.creational.factorymethod.payment;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankPaymentCreatorTest {

    @Test
    void shouldCreateCorrectPayment() {
        var amount = new BigDecimal("49.95");
        var payment = new BankPaymentCreator().createPayment().pay(amount);

        assertEquals("Bankoverschrijving: € 49.95", payment);
    }

    @Test
    void shouldThrowExceptionWhenAmountIsZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new BankPaymentCreator().processPayment(BigDecimal.ZERO)
        );
    }
}