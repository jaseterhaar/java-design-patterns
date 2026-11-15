package nl.jase.patterns.creational.factorymethod.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardShippingCreatorTest {

    @Test
    void shouldProcessStandardShipping() {
        String orderId = "ORD-2026-001";
        ShippingCreator standardShipping = new StandardShippingCreator();
        String shippingMessage = standardShipping.processShipping(orderId);

        assertEquals(
            "Standard shipping for order ORD-2026-001\nShipping cost: €4.95",
            shippingMessage
        );
    }
}