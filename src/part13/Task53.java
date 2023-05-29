package part13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task53 {

    public static class Calculator extends Thread {
        private List<Integer> numbers;

        public Calculator(List<Integer> numbers) {
            this.numbers = numbers;
        }

        @Override
        public void run() {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = sum / numbers.size();
            System.out.println("Arithmetic mean: " + average);
        }

        public static void main(String[] args) {
            List<Calculator> threads = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                List<Integer> numbers = generateRandomNumbers(10);

                Calculator thread = new Calculator(numbers);
                threads.add(thread);
            }

            for (Calculator thread : threads) {
                thread.start();
            }

            for (Calculator thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private static List<Integer> generateRandomNumbers(int count) {
            Random random = new Random();
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                numbers.add(random.nextInt(48));
            }
            return numbers;
        }
    }

}
