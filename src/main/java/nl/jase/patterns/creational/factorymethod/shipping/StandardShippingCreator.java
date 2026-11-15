package nl.jase.patterns.creational.factorymethod.shipping;

public class StandardShippingCreator extends ShippingCreator {

    @Override
    public Shipping createShipping() {
        return new StandardShipping();
    }
}
