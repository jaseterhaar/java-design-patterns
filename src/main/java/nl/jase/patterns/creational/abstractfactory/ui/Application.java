
package nl.jase.patterns.creational.abstractfactory.ui;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
