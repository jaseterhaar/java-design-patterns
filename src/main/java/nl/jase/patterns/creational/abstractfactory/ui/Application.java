
package nl.jase.patterns.creational.abstractfactory.ui;

public class Application {

    private final Button button;
    private final Checkbox checkbox;
    private final TextField textField;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        textField = factory.createTextField();
    }

    public void render() {
        button.render();
        checkbox.render();
        textField.render();
    }
}
