
package nl.jase.patterns.creational.abstractfactory.ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class LightUIFactoryTest {

    private final UIFactory factory = new LightUIFactory();

    @Test
    void shouldCreateLightButton() {
        Button button = factory.createButton();
        assertInstanceOf(LightButton.class, button);
    }

    @Test
    void shouldCreateLightCheckbox() {
        Checkbox checkbox = factory.createCheckbox();
        assertInstanceOf(LightCheckbox.class, checkbox);
    }

    @Test
    void shouldCreateLightTextField() {
        TextField textField = factory.createTextField();
        assertInstanceOf(LightTextField.class, textField);
    }
}
