package part11.task45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 5) {
                throw new ScannerException("Enter five!");
            }
        }

    }
}

