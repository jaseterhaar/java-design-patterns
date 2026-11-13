package nl.jase.patterns.creational.factorymethod.document;

public class JsonDocumentCreator extends DocumentCreator {

    @Override
    public Document createDocument() {
        return new JsonDocument();
    }
}
