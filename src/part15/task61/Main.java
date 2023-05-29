package part15.task61;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String threadName = "Thread_" + i;
            String message = "Hello World!";
            Callable<String> task = new MessageGeneration(threadName, message);
            Future<String> future = executor.submit(task);
            futures.add(future);
        }

        executor.shutdown();

        for (Future<String> future : futures) {
            try {
                String result = future.get();
                System.out.println("Task completed: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

