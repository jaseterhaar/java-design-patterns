package nl.jase.patterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PushNotificationCreatorTest {

    @Test
    void shouldCreatePushNotification() {
        NotificationCreator pushCreator = new PushNotificationCreator();
        Notification pushNotification = pushCreator.createNotification();

        assertInstanceOf(PushNotification.class, pushNotification);
    }

    @Test
    void shouldCreateNewInstanceForEachCall() {
        NotificationCreator creator = new PushNotificationCreator();

        Notification first = creator.createNotification();
        Notification second = creator.createNotification();

        assertNotSame(first, second);
    }
}