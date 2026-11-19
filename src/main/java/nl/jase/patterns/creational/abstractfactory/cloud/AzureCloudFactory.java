package nl.jase.patterns.creational.abstractfactory.cloud;

public class AzureCloudFactory implements CloudFactory {

    @Override
    public Storage createStorage() {
        return new AzureStorage();
    }

    @Override
    public Notification createNotification() {
        return new AzureNotification();
    }
}
