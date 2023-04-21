package part7;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text and we'll replace all paragraph tags with simple <p>: ");
        String text = scanner.nextLine().trim();
        String output = replaceParagraphTags(text);
        System.out.println("Text with simple <p>: ");
        System.out.println(output);
    }

    public static String replaceParagraphTags(String text) {
        String regex = "<p\\b[^>]*>";
        String output = text.replaceAll(regex, "<p>");
        return output;
    }
}
