package nl.jase.patterns.creational.factorymethod.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonDocumentCreatorTest {

    @Test
    void shouldReturnCorrectContent() {
        String content = "Mijn document";
        DocumentCreator jsonCreator= new JsonDocumentCreator();
        Document document = jsonCreator.createDocument();

        String export = document.export(content);

        assertEquals("{\"content\":\"Mijn document\"}", export);
    }
}