package part12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path to create the file: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the text to write into the file: ");
        String text = scanner.nextLine();

        File file = new File(directoryPath, fileName);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
            System.out.println("File created successfully");

            int punctuationCount = 0;
            int wordCount = 0;

            String[] words = text.split("\\s+");
            for (String word : words) {
                if (word.matches(".*[\\p{Punct}].*")) {
                    punctuationCount++;
                } else {
                    wordCount++;
                }
            }

            System.out.println("Number of punctuation marks: " + punctuationCount);
            System.out.println("Number of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
            System.exit(1);
        } finally {
            System.exit(0);
        }

        scanner.close();

    }
}
