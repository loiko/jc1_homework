package part6.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM(230, 38, 54);

        atm.addMoney(52, 8, 7); //


        while (true) {
            System.out.println("Please choose an action: ");
            System.out.println("1. Add money to the ATM");
            System.out.println("2. Withdraw money from the ATM");
            System.out.println("3. Quit and pick up the card");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.print("Enter number of 20 banknotes to add: ");
                    int num20 = scanner.nextInt();
                    System.out.print("Enter number of 50 banknotes to add: ");
                    int num50 = scanner.nextInt();
                    System.out.print("Enter number of 100 banknotes to add: ");
                    int num100 = scanner.nextInt();
                    atm.addMoney(num20, num50, num100);
                    System.out.println("Money added to the ATM");
                    break;

                case 2:
                    boolean success = false;
                    while (!success) {
                        success = atm.withdrawalOfMoney();
                    }
                    break;

                case 3:
                    System.out.println("Thank you! Please take your card");
                    System.exit(0);

                default:
                    System.exit(1);
            }
        }
    }
}


