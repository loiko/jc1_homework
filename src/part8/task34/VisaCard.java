package part8.task34;

public class VisaCard extends DebitCard {
    private String cardIssuer;

    public VisaCard(String cardType, int validUntil, double serviceCost, boolean isVirtual, String currency, String cardIssuer) {
        super(cardType, validUntil, serviceCost, isVirtual, currency);
        this.cardIssuer = cardIssuer;
    }

    public String getCardIssuer() {
        return cardIssuer;
    }

    public void useCard() {
        System.out.println("Using the Visa card");
    }
}

