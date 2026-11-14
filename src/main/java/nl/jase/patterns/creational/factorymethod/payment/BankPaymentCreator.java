package nl.jase.patterns.creational.factorymethod.payment;

public class BankPaymentCreator extends PaymentCreator {

    @Override
    public Payment createPayment() {
        return new BankPayment();
    }
}
