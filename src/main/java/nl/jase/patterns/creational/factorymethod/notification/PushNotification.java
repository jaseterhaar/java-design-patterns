package nl.jase.patterns.creational.factorymethod.notification;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("PUSH: " + message);
    }
}