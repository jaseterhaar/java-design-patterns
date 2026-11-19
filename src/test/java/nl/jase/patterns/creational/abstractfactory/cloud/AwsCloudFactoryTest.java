package nl.jase.patterns.creational.abstractfactory.cloud;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AwsCloudFactoryTest {

    private final CloudFactory factory = new AwsCloudFactory();

    @Test
    void shouldCreateAwsProducts() {
        Storage storage = factory.createStorage();
        Notification notification = factory.createNotification();

        assertInstanceOf(AwsStorage.class, storage);
        assertInstanceOf(AwsNotification.class, notification);
    }

}