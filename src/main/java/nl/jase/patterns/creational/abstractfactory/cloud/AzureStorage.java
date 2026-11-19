package nl.jase.patterns.creational.abstractfactory.cloud;

public class AzureStorage implements Storage {
    @Override
    public void upload(String filename) {
        System.out.println("Azure: Uploading " + filename);
    }
}
