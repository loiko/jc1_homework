package part16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task64 {
    public static void main(String[] args) {

        int n = 20;
        int minValue = 4;
        int maxValue = 121;

        List<Integer> numbers = IntStream.range(0, n)
                .map(i -> (int) (Math.random() * (maxValue - minValue + 1) + minValue))
                .boxed()
                .collect(Collectors.toList());

        List<Integer> containsDivisible = numbers.stream()
                .filter(num -> num % 3 == 0 && num % 5 == 0)
                .collect(Collectors.toList());

        System.out.println("Generated numbers: " + numbers);
        System.out.println("Contains numbers divisible by 3 and 5: " + containsDivisible);

    }
}
