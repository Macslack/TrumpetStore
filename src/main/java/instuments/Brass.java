package instuments;


import shop.InstumentType;

public abstract class Brass extends Instuments{

    private int numberOfValues;

    public Brass(double buyPrice, double sellPrice, InstumentType instumentType, int numberOfValues) {
        super(buyPrice, sellPrice, instumentType);
        this.numberOfValues = numberOfValues;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }
}
