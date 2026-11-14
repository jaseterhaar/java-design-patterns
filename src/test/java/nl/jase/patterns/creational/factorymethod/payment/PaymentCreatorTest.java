package nl.jase.patterns.creational.factorymethod.payment;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCreatorTest {

    @Test
    void shouldNotCreatePaymentWhenAmountIsInvalid() {
        TestPaymentCreator creator = new TestPaymentCreator();

        assertThrows(
            IllegalArgumentException.class,
            () -> creator.processPayment(BigDecimal.ZERO)
        );

        assertFalse(creator.createPaymentCalled);
    }

    private static class TestPaymentCreator extends PaymentCreator {

        private boolean createPaymentCalled = false;

        @Override
        public Payment createPayment() {
            createPaymentCalled = true;
            return new CreditcardPayment();
        }
    }
}