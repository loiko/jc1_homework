package part8.task34;

public class MasterCard extends DebitCard {
    private int creditLimit;

    public MasterCard(String cardType, int validUntil, double serviceCost, boolean isVirtual, String currency, int creditLimit) {
        super(cardType, validUntil, serviceCost, isVirtual, currency);
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void useCard() {
        System.out.println("Using the MasterCard");
    }
}
