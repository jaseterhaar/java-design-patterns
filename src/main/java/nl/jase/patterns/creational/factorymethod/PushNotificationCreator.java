package nl.jase.patterns.creational.factorymethod;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
