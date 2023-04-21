package part7;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text and we'll print the last letters of the words for fun: ");
        String text = scanner.nextLine().trim();

        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                result.append(word.charAt(word.length() - 1));
            }
        }
        System.out.println(result.toString());
    }
}