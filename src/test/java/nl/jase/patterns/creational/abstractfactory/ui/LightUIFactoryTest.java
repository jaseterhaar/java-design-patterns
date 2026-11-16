
package nl.jase.patterns.creational.abstractfactory.ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightUIFactoryTest {

    private final LightUIFactory lightUIFactory = new LightUIFactory();

    @Test
    void shouldCreateLightButton() {
        Button button = lightUIFactory.createButton();
        assertInstanceOf(LightButton.class, button);
    }

    @Test
    void shouldCreateLightCheckbox() {
        Checkbox checkbox = lightUIFactory.createCheckbox();
        assertInstanceOf(LightCheckbox.class, checkbox);
    }
}
