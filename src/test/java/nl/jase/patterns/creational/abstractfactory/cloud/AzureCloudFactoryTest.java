package nl.jase.patterns.creational.abstractfactory.cloud;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AzureCloudFactoryTest {

    private final CloudFactory factory = new AzureCloudFactory();

    @Test
    void shouldCreateAzureProducts() {
        Storage storage = factory.createStorage();
        Notification notification = factory.createNotification();

        assertInstanceOf(AzureStorage.class, storage);
        assertInstanceOf(AzureNotification.class, notification);
    }

}