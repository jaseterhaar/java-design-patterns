package nl.jase.patterns.creational.factorymethod.document;

public class PdfDocument implements Document {
    @Override
    public String export(String content) {
        return "PDF: " + content;
    }
}
