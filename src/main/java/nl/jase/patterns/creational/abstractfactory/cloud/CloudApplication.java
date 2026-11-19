package nl.jase.patterns.creational.abstractfactory.cloud;

public class CloudApplication {

    private final Storage storage;
    private final Notification notification;

    public CloudApplication(CloudFactory factory) {
        this.storage = factory.createStorage();
        this.notification = factory.createNotification();
    }

    public void uploadFile(String filename) {
        storage.upload(filename);
        notification.send(filename);
    }
}
