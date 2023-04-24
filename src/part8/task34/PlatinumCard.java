package part8.task34;

public class PlatinumCard extends MasterCard {
    private boolean hasConciergeService;

    public PlatinumCard(String cardType, int validUntil, double serviceCost, boolean isVirtual, String currency, int creditLimit, boolean hasConciergeService) {
        super(cardType, validUntil, serviceCost, isVirtual, currency, creditLimit);
        this.hasConciergeService = hasConciergeService;
    }

    public boolean hasConciergeService() {
        return hasConciergeService;
    }

    public void useCard() {
        System.out.println("Using the Platinum Mastercard");
    }
}
