package nl.jase.patterns.creational.factorymethod.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShippingCreatorTest {

    @Test
    public void shouldRejectBlankOrderId() {
        TestShippingCreator shippingCreator = new TestShippingCreator();

        assertThrows(
            IllegalArgumentException.class,
            () -> shippingCreator.processShipping(" ")
        );

        assertFalse(shippingCreator.createShippingCalled);
    }

    @Test
    void shouldRejectNullOrderId() {
        TestShippingCreator creator = new TestShippingCreator();

        assertThrows(
            IllegalArgumentException.class,
            () -> creator.processShipping(null)
        );

        assertFalse(creator.createShippingCalled);
    }

    private static class TestShippingCreator extends ShippingCreator {

        private boolean createShippingCalled = false;

        @Override
        public Shipping createShipping() {
            createShippingCalled = true;
            return new ExpressShipping();
        }
    }
}
