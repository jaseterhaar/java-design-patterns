package nl.jase.patterns.creational.abstractfactory.cloud;

public class AwsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("AWS: Sending notification: " + message);
    }
}
