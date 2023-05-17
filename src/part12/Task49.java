package part12;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task49 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path to create the file: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter the text with numbers to write into the file: ");
        String contents = scanner.nextLine();

        File file = new File(directoryPath, fileName);

        String filePath = directoryPath + File.separator + fileName;
        List<Integer> numbers = new ArrayList<>();

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(contents);
            writer.close();

            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\b\\d+\\b");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    int number = Integer.parseInt(matcher.group());
                    numbers.add(number);
                }
            }
            bufferedReader.close();


            System.out.println("Numbers in the file:");
            for (int number : numbers) {
                System.out.println(number);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            System.out.println("Unique numbers:");
            for (int number : uniqueNumbers) {
                System.out.println(number);
            }

            int uniqueSum = 0;
            for (int number : uniqueNumbers) {
                uniqueSum += number;
            }
            System.out.println("Sum of unique numbers: " + uniqueSum);

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
            System.exit(1);
        } finally {
            System.exit(0);
        }

        scanner.close();

    }
}

