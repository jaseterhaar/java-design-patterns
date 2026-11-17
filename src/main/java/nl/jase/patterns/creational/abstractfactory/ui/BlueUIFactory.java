
package nl.jase.patterns.creational.abstractfactory.ui;

public class BlueUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new BlueCheckbox();
    }

    @Override
    public TextField createTextField() {
        return new BlueTextField();
    }
}
