package nl.jase.patterns.creational.abstractfactory.ui;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Light Button");
    }
}
