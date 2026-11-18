package nl.jase.patterns.creational.abstractfactory.ui;

class TestUIFactory implements UIFactory {

    private final RecordingButton button = new RecordingButton();
    private final RecordingCheckbox checkbox = new RecordingCheckbox();
    private final RecordingTextField textField = new RecordingTextField();

    @Override
    public Button createButton() {
        return button;
    }

    @Override
    public Checkbox createCheckbox() {
        return checkbox;
    }

    @Override
    public TextField createTextField() {
        return textField;
    }
}
