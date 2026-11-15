package nl.jase.patterns.creational.factorymethod.shipping;

public abstract class ShippingCreator {
    public abstract Shipping createShipping();

    public String processShipping(String orderId) {
        if(orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("orderId must not be null or blank");
        }

        Shipping shipping = createShipping();

        return shipping.ship(orderId) + "\nShipping cost: €" + shipping.getCost();
    }
}
