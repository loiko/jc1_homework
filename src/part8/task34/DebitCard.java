package part8.task34;

public abstract class DebitCard {
    private String cardType;
    private int validUntil;
    private double serviceCost;
    private boolean isVirtual;
    private String currency;

    public DebitCard(String cardType, int validUntil, double serviceCost, boolean isVirtual, String currency) {
        this.cardType = cardType;
        this.validUntil = validUntil;
        this.serviceCost = serviceCost;
        this.isVirtual = isVirtual;
        this.currency = currency;
    }

    public String getCardType() {
        return cardType;
    }

    public int getValidUntil() {
        return validUntil;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public boolean isVirtual() {
        return isVirtual;
    }

    public String getCurrency() {
        return currency;
    }

    public abstract void useCard();
}


