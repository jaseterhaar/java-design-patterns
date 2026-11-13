package nl.jase.patterns.creational.factorymethod.document;

public class Main {

    static void main() {
        String content = "Mijn eerste document";

        DocumentCreator pdfCreator = new PdfDocumentCreator();
        System.out.println(pdfCreator.exportDocument(content));

        DocumentCreator jsonCreator = new JsonDocumentCreator();
        System.out.println(jsonCreator.exportDocument(content));
    }
}