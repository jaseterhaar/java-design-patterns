package nl.jase.patterns.creational.factorymethod.shipping;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PickupShippingCreatorTest {

    @Test
    void shouldReturnZeroCostForPickup() {
        ShippingCreator shippingCreator = new PickupShippingCreator();
        BigDecimal costs = shippingCreator.createShipping().getCost();

        assertEquals(new BigDecimal("0.0"), costs);
    }

}