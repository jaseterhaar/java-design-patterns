package nl.jase.patterns.creational.abstractfactory.cloud;

public class AzureNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Azure: Sending notification: " + message);
    }
}
