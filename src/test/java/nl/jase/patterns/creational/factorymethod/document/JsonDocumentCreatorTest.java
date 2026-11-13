package nl.jase.patterns.creational.factorymethod.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonDocumentCreatorTest {

    @Test
    void shouldCreateJsonDocument() {
        DocumentCreator jsonCreator= new JsonDocumentCreator();
        Document document = jsonCreator.createDocument();

        assertInstanceOf(JsonDocument.class, document);
    }
}