package nl.jase.patterns.creational.abstractfactory.ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlueUIFactoryTest {

    private final UIFactory uiFactory = new BlueUIFactory();

    @Test
    void shouldCreateBlueButton() {
        Button button = uiFactory.createButton();

        assertInstanceOf(BlueButton.class, button);
    }

    @Test
    void shouldCreateBlueCheckbox() {
        Checkbox checkbox = uiFactory.createCheckbox();

        assertInstanceOf(BlueCheckbox.class, checkbox);
    }

    @Test
    void shouldCreateBlueTextField() {
        TextField textField = uiFactory.createTextField();

        assertInstanceOf(BlueTextField.class, textField);
    }
}