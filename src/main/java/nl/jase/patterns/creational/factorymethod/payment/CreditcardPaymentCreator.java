package nl.jase.patterns.creational.factorymethod.payment;

public class CreditcardPaymentCreator extends PaymentCreator {


    @Override
    public Payment createPayment() {
        return new CreditcardPayment();
    }
}
