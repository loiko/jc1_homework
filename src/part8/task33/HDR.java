package part8.task33;

public class HDR extends SmartTV {
    private boolean supportsHDR;

    public HDR(String model, int size, String os, boolean supportsHDR) {
        super(model, size, os);
        this.supportsHDR = supportsHDR;
    }

    public boolean supportsHDR() {
        return supportsHDR;
    }

    public void playHDRContent() {
        System.out.println("Playing HDR content on the TV");
    }

    public void turnOn() {
        System.out.println("HDR TV is turned on");
    }

    public void turnOff() {
        System.out.println("HDR TV is turned off");
    }
}

