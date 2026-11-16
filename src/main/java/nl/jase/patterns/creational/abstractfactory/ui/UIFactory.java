
package nl.jase.patterns.creational.abstractfactory.ui;

public interface UIFactory {

    Button createButton();

    Checkbox createCheckbox();

    TextField createTextField();
}
