package part15.task59;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String threadName = "Thread_" + i;
            Callable<String> task = new FileGeneration(threadName);
            Future<String> future = executor.submit(task);
            futures.add(future);
        }

        executor.shutdown();

        for (Future<String> future : futures) {
            try {
                String filenames = future.get();
                System.out.println("Task completed. Filenames: " + filenames);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

