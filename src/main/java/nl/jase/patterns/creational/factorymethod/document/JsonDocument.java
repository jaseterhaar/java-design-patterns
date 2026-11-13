package nl.jase.patterns.creational.factorymethod.document;

public class JsonDocument implements Document {
    @Override
    public String export(String content) {
        return "{\"content\":\"%s\"}".formatted(content);
    }
}
