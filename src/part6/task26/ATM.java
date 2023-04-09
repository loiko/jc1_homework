package part6.task26;

import java.util.Scanner;

public class ATM {

    private int banknote20;
    private int banknote50;
    private int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addMoney(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
    }

    public boolean withdrawalOfMoney() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount of money to withdraw: ");
        int amount = scanner.nextInt();

        if (amount % 10 != 0) {
            System.out.println("The ATM cannot withdraw the entered amount. There are banknotes in denominations of 20, 50 and 100 only");
            return false;
        }

        int banknote100needed = amount / 100;
        int banknote50needed = (amount % 100) / 50;
        int banknote20needed = ((amount % 100) % 50) / 20;

        if (banknote100needed > banknote100 || banknote50needed > banknote50 || banknote20needed > banknote20) {
            System.out.println("There is not enough money in the ATM to withdraw the entered amount");
            return false;
        } else {
            banknote100 -= banknote100needed;
            banknote50 -= banknote50needed;
            banknote20 -= banknote20needed;
            System.out.println("Withdrawal successful!");
            System.out.println("Dispensing " + banknote100needed + " x 100 banknotes");
            System.out.println("Dispensing " + banknote50needed + " x 50 banknotes");
            System.out.println("Dispensing " + banknote20needed + " x 20 banknotes");
            return true;
        }
    }
}




