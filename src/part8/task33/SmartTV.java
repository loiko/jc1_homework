package part8.task33;

public class SmartTV extends TV {
    private String os;

    public SmartTV(String model, int size, String os) {
        super(model, size);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void turnOn() {
        System.out.println("Smart TV is turned on");
    }

    public void turnOff() {
        System.out.println("Smart TV is turned off");
    }
}

