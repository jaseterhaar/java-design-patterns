package nl.jase.patterns.creational.factorymethod.notification;

public abstract class NotificationCreator {

    public abstract Notification createNotification();

    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}