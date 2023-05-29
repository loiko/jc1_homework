package part15.task59;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGeneration implements Callable<String> {
    private final String threadName;

    public FileGeneration(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public String call() throws Exception {
        List<String> filenames = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            String filename = threadName + "_file_" + i + ".txt";
            filenames.add(filename);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (int j = 1; j <= 10; j++) {
                    writer.write("Line " + j + " - " + threadName);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            int sleepTime = random.nextInt(3000) + 1000;
            Thread.sleep(sleepTime);
        }

        return filenames.toString();
    }
}

