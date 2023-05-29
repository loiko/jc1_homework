package part15.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGeneration implements Callable<String> {
    private final String threadName;

    public RandomNumberGeneration(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public String call() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            numbers.add(number);
        }

        int sleepTime = random.nextInt(10_000) + 1000;
        Thread.sleep(sleepTime);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return "Thread: " + threadName + ", Sum: " + sum;
    }
}

