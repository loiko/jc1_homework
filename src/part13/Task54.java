package part13;

import java.util.Random;

public class Task54 {

    public static class RandomNumber implements Runnable {
        private static final int ARRAY_SIZE = 10;
        private static final int THREAD_COUNT = 10;

        private final String name;

        public RandomNumber(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int[] numbers = generateRandomArray();
            int max = findMaximum(numbers);
            System.out.println(name + ": " + max);
        }

        private int[] generateRandomArray() {
            Random random = new Random();
            int[] numbers = new int[ARRAY_SIZE];
            for (int i = 0; i < ARRAY_SIZE; i++) {
                numbers[i] = random.nextInt();
            }
            return numbers;
        }

        private int findMaximum(int[] numbers) {
            int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            for (int i = 0; i < THREAD_COUNT; i++) {
                Thread thread = new Thread(new RandomNumber("Stream " + (i + 1)));
                thread.start();
            }
        }
    }

}
