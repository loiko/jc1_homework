package part9.task38;

import java.util.Scanner;

import static part9.task38.Season.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a season: ");
        String input = scanner.nextLine().toUpperCase();

        Season season;
        switch (input) {
            case "SPRING":
                season = SPRING;
                break;
            case "SUMMER":
                season = SUMMER;
                break;
            case "FALL":
                season = AUTUMN;
                break;
            case "WINTER":
                season = WINTER;
                break;
            default:
                System.out.println("Invalid season entered");
                return;
        }

        System.out.println("Days in " + input + ": " + season.getDaysInSeason());
    }
}
