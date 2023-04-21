package part7;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text and we'll count the words for fun: ");
        String text = scanner.nextLine().trim();

        String[] words = text.split("\\s+");
        int count = words.length;
        System.out.println("The number of words in your text: " + count);
    }
}
