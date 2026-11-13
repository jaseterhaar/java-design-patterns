package nl.jase.patterns.creational.factorymethod;

public class Main {
    static void main() {

        String message = "Welkom bij Factory Method!";

        NotificationCreator emailCreator = new EmailNotificationCreator();
        emailCreator.notifyUser(message);
        NotificationCreator smsCreator = new SmsNotificationCreator();
        smsCreator.notifyUser(message);
        NotificationCreator pushCreator = new PushNotificationCreator();
        pushCreator.notifyUser(message);
    }
}
