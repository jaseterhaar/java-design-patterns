package nl.jase.patterns.creational.abstractfactory.ui;

class RecordingButton implements Button {

    private int renderCount;

    @Override
    public void render() {
        renderCount += 1;
    }

    public int getRenderCount() {
        return renderCount;
    }
}
