package part3;

public class Task9 {
    public static void main(String[] args) {
        int rubles = 137914;
        int lastDigit = rubles % 10;
        if ((rubles % 100 >= 11 && rubles % 100 <= 14)
                || (rubles % 100 <= -11 && rubles % 100 >= -14)) {
            System.out.println(rubles + " рублей");
        } else if (lastDigit == 1 || lastDigit == -1) {
            System.out.println(rubles + " рубль");
        } else if (lastDigit == 2 || lastDigit == 3 || lastDigit == 4
                || lastDigit == -2 || lastDigit == -3 || lastDigit == -4) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рублей");
        }
    }
}
