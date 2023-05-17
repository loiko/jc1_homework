package part12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path to create the file: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        String fullPath = directoryPath + File.separator + fileName;

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt();
            numbers.add(randomNumber);
        }

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(fullPath))) {
            for (Integer number : numbers) {
                output.writeInt(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> readNumbers = new ArrayList<>();
        try (DataInputStream input = new DataInputStream(new FileInputStream(fullPath))) {
            while (input.available() > 0) {
                int readNumber = input.readInt();
                readNumbers.add(readNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        for (Integer number : readNumbers) {
            sum += number;
        }
        double mean = sum / readNumbers.size();

        System.out.println("Numbers:");
        for (Integer number : readNumbers) {
            System.out.println(number);
        }
        System.out.println("Arithmetic Mean: " + mean);

        scanner.close();
    }
}

