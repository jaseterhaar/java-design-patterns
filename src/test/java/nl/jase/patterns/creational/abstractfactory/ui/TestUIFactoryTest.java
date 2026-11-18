package nl.jase.patterns.creational.abstractfactory.ui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestUIFactoryTest {


    @Test
    void shouldRenderAllComponents() {

        TestUIFactory factory = new TestUIFactory();

        Application application = new Application(factory);

        application.render();

        assertEquals(1, ((RecordingButton)factory.createButton()).getRenderCount());
        assertEquals(1, ((RecordingCheckbox)factory.createCheckbox()).getRenderCount());
        assertEquals(1, ((RecordingTextField)factory.createTextField()).getRenderCount());
    }
}