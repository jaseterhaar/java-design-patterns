package nl.jase.patterns.creational.abstractfactory.ui;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Dark Button");
    }
}
