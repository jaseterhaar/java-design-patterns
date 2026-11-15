package nl.jase.patterns.creational.factorymethod.shipping;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ExpressShippingCreatorTest {

    @Test
    void shouldReturnExpressShippingCost() {
        ExpressShippingCreator creator = new ExpressShippingCreator();
        BigDecimal costs = creator.createShipping().getCost();

        assertEquals(new BigDecimal("12.50"), costs);
    }

}