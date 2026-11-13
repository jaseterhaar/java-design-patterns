package nl.jase.patterns.creational.factorymethod.notification;

public class SmsNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
