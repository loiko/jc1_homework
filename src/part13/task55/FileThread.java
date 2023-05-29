package part13.task55;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileThread extends Thread {

    private static final int ARRAY_LENGTH = 10;
    private String fileName;

    public FileThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            int[] array = generateRandomArray();

            writeArrayToFile(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int[] generateRandomArray() {
        int[] array = new int[ARRAY_LENGTH];
        Random random = new Random();

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    private void writeArrayToFile(int[] array) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            writer.write(array[i] + "\n");
        }

        writer.close();
    }
}

