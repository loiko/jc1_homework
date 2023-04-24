package part8.task33;

public abstract class TV {
    private String model;
    private int size;

    public TV(String model, int size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public abstract void turnOn();

    public abstract void turnOff();
}

