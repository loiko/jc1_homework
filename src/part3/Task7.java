package part3;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(getBoolean());
    }

    private static boolean getBoolean() {
        int number = -26894357;

        if (number % 10 == 7 || number % 10 == -7) {
            return true;
        } else {
            return false;
        }
    }
}

