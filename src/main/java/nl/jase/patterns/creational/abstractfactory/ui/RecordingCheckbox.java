package nl.jase.patterns.creational.abstractfactory.ui;

class RecordingCheckbox implements Checkbox {

    private int renderCount;

    @Override
    public void render() {
        renderCount += 1;
    }

    public int getRenderCount() {
        return renderCount;
    }
}
