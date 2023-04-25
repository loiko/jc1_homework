package part9.task39;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public void park(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;

    }
}
