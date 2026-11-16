
package nl.jase.patterns.creational.abstractfactory.ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class DarkUIFactoryTest {

    private final DarkUIFactory darkUIFactory = new DarkUIFactory();

    @Test
    void shouldCreateDarkButton() {
        Button button = darkUIFactory.createButton();
        assertInstanceOf(DarkButton.class, button);
    }

    @Test
    void shouldCreateDarkCheckbox() {
        Checkbox checkbox = darkUIFactory.createCheckbox();
        assertInstanceOf(DarkCheckbox.class, checkbox);
    }
}
