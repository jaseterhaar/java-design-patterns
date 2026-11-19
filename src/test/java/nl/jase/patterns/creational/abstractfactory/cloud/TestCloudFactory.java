package nl.jase.patterns.creational.abstractfactory.cloud;

import java.util.List;

public class TestCloudFactory implements CloudFactory {

    private final List<String> events;

    TestCloudFactory(List<String>events) {
        this.events = events;
    }

    @Override
    public Storage createStorage() {
        return filename -> events.add("upload: " + filename);
    }

    @Override
    public Notification createNotification() {
        return message -> events.add("notify: " + message);
    }
}
