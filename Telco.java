public class Telco implements TelcoSubscription {

    
    private int dataAllowance;
    private double promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName() {
        return telcoName;
    }
    public Integer getDataAllowance() {
        return dataAllowance;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }
}
