package part7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text and we'll count the punctuation marks for fun: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("The number of punctuation marks in your text: " + count);
    }
}
