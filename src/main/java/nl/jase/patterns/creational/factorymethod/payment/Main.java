package nl.jase.patterns.creational.factorymethod.payment;

import java.math.BigDecimal;

public class Main {

    static void main() {

        PaymentCreator creditcardPaymentCreator = new CreditcardPaymentCreator();
        PaymentCreator bankPaymentCreator = new BankPaymentCreator();

        BigDecimal amount = BigDecimal.valueOf(49.95);
        System.out.println(creditcardPaymentCreator.processPayment(amount));
        System.out.println(bankPaymentCreator.processPayment(amount));
    }
}
