package nl.jase.patterns.creational.factorymethod.shipping;

public class Main {
    static void main() {
        String orderId = "ORD-2026-001";

        ShippingCreator standardCreator = new StandardShippingCreator();
        standardCreator.processShipping(orderId);
        System.out.println(standardCreator.processShipping(orderId));

        ShippingCreator expressCreator = new ExpressShippingCreator();
        expressCreator.processShipping(orderId);
        System.out.println(expressCreator.processShipping(orderId));

        ShippingCreator pickuoCreator = new PickupShippingCreator();
        pickuoCreator.processShipping(orderId);
        System.out.println(pickuoCreator.processShipping(orderId));
    }
}
