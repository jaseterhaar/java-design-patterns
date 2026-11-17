
package nl.jase.patterns.creational.abstractfactory.ui;

public class Main {

    static void main() {
        UIFactory lightUIFactory = new LightUIFactory();
        Application lightApp = new Application(lightUIFactory);
        lightApp.render();

        UIFactory darkUIFactory = new DarkUIFactory();
        Application darkApp = new Application(darkUIFactory);
        darkApp.render();

        UIFactory blueUIFactory = new BlueUIFactory();
        Application blueApp = new Application(blueUIFactory);
        blueApp.render();
    }
}
