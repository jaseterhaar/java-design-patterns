package nl.jase.patterns.creational.abstractfactory.cloud;

public class AwsStorage implements Storage {
    @Override
    public void upload(String filename) {
        System.out.println("AWS: Uploading " + filename);
    }
}
