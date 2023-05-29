package part15.task61;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;

public class MessageGeneration implements Callable<String> {
    private final String threadName;
    private final String message;

    public MessageGeneration(String threadName, String message) {
        this.threadName = threadName;
        this.message = message;
    }

    @Override
    public String call() throws Exception {
        LocalDateTime currentTime = LocalDateTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String content = "[" + formattedTime + "] Thread: " + threadName + " - " + message;

        writeToFile(content);

        return "Thread: " + threadName;
    }

    private synchronized void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            writer.write(content);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

