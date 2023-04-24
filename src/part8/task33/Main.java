package part8.task33;

public class Main {
    public static void main(String[] args) {

        TV tv1 = new SmartTV("Sony", 55, "Android TV");
        TV tv2 = new HDR("LG", 85, "LG webOS", true);

        PowerSocket powerSocket = new PowerSocket();
        powerSocket.plugIn(tv2);

    }
}