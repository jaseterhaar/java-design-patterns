
package nl.jase.patterns.creational.abstractfactory.ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class DarkUIFactoryTest {

    private final UIFactory factory = new DarkUIFactory();

    @Test
    void shouldCreateDarkButton() {
        Button button = factory.createButton();
        assertInstanceOf(DarkButton.class, button);
    }

    @Test
    void shouldCreateDarkCheckbox() {
        Checkbox checkbox = factory.createCheckbox();
        assertInstanceOf(DarkCheckbox.class, checkbox);
    }

    @Test
    void shouldCreateDarkTextField() {
        TextField textField = factory.createTextField();
        assertInstanceOf(DarkTextField.class, textField);
    }
}
