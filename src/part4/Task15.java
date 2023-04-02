package part4;

public class Task15 {
    public static void main(String[] args) {

        long number = 7893823445L;
        int sum = 0;

        do {
            long lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        } while (number > 0);
        System.out.println("Сумма цифр числа 7893823445 равняется " + sum);
    }
}
