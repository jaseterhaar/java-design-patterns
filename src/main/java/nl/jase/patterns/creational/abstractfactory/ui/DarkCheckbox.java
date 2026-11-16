package nl.jase.patterns.creational.abstractfactory.ui;

public class DarkCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Rendering Dark Checkbox");
    }
}
