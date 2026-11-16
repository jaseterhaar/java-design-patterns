
package nl.jase.patterns.creational.abstractfactory.ui;

public class LightUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
