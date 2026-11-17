package nl.jase.patterns.creational.abstractfactory.ui;

public class BlueCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Blue Checkbox");
    }
}
