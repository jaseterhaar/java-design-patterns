
package nl.jase.patterns.creational.abstractfactory.ui;

public class DarkUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
