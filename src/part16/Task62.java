package part16;

import java.util.stream.IntStream;

public class Task62 {
    public static void main(String[] args) {

        double sum = IntStream.rangeClosed(1, 20)
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.print(n + " inches "))
                .mapToDouble(n -> n * 2.54)
                .sum();

        System.out.println("\nSum of inches in centimeters: " + sum);

    }
}
