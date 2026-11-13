package nl.jase.patterns.creational.factorymethod.document;

public abstract class DocumentCreator {

    public abstract Document createDocument();

    public String exportDocument(String content) {
        Document document = createDocument();
        return document.export(content);
    }
}
