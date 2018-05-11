package accessories;

import behaviours.Isell;

public abstract class Accessories implements Isell{

    private double buyPrice;
    private double sellPrice;

    public Accessories(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }
}
