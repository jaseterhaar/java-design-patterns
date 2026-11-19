package nl.jase.patterns.creational.abstractfactory.cloud;

public class AwsCloudFactory implements CloudFactory {

    @Override
    public Storage createStorage() {
        return new AwsStorage();
    }

    @Override
    public Notification createNotification() {
        return new AwsNotification();
    }
}
