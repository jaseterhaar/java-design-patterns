package nl.jase.patterns.creational.abstractfactory.cloud;

public interface CloudFactory {

    Storage createStorage();

    Notification createNotification();

}
