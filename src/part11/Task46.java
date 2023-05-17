package part11;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            int result = divideNumbers(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(1);
        } finally {
            System.exit(0);
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Уou can't divide by zero!");
        }
        return dividend / divisor;
    }
}
