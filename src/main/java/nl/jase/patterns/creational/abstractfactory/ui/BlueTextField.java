package nl.jase.patterns.creational.abstractfactory.ui;

public class BlueTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering Blue TextField");
    }
}
