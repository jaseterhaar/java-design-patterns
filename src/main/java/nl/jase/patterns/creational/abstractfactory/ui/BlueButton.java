package nl.jase.patterns.creational.abstractfactory.ui;

public class BlueButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Blue Button");
    }
}
