package nl.jase.patterns.creational.factorymethod.shipping;

public class PickupShippingCreator extends ShippingCreator {

    @Override
    public Shipping createShipping() {
        return new PickupShipping();
    }
}
