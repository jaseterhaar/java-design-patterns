package nl.jase.patterns.creational.factorymethod.notification;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}