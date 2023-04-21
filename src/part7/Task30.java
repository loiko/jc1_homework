package part7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text and we'll find hexadecimal numbers: ");
        String text = scanner.nextLine().trim();
        findHexNumbers(text);
    }

    public static void findHexNumbers(String text) {
        Pattern hexPattern = Pattern.compile("\\b0[xX][0-9a-fA-F]+\\b");
        Matcher hexMatcher = hexPattern.matcher(text);

        while (hexMatcher.find()) {
            String hexNumber = hexMatcher.group();
            System.out.println("Hexadecimal numbers: " + hexNumber);
        }
    }
}

