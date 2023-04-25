package part9.task37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current season: ");
        String input = scanner.nextLine();

        Season currentSeason = Season.valueOf(input.toUpperCase());
        Season nextSeason = currentSeason.next();
        System.out.println("The next season is " + nextSeason);

    }
}
