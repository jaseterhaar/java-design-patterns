package nl.jase.patterns.creational.factorymethod.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonDocumentCreatorTest {

    @Test
    void shouldReturnCorrectContent() {
        DocumentCreator jsonCreator= new JsonDocumentCreator();

        String export = jsonCreator.exportDocument("Mijn document");

        assertEquals("{\"content\":\"Mijn document\"}", export);
    }
}