package nl.jase.patterns.creational.factorymethod.payment;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CreditcardPaymentCreatorTest {

    @Test
    void shouldCreateCorrectPayment() {
        var amount = new BigDecimal("49.95");
        var payment = new CreditcardPaymentCreator().processPayment(amount);

        assertEquals("Creditcard betaling: € 49.95", payment);

    }

    @Test
    void shouldThrowExceptionWhenAmountIsZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> new CreditcardPaymentCreator().processPayment(BigDecimal.ZERO)
        );
    }
}