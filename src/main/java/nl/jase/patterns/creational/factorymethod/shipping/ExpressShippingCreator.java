package nl.jase.patterns.creational.factorymethod.shipping;

public class ExpressShippingCreator extends ShippingCreator {

    @Override
    public Shipping createShipping() {
        return new ExpressShipping();
    }
}
