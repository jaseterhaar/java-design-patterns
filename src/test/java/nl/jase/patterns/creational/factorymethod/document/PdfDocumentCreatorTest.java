package nl.jase.patterns.creational.factorymethod.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class PdfDocumentCreatorTest {

    @Test
    void shouldCreatePdfDocument() {
        DocumentCreator pdfCreator = new PdfDocumentCreator();
        Document document = pdfCreator .createDocument();

        assertInstanceOf(PdfDocument.class, document);
    }
}