package instuments;

import shop.InstumentType;

public abstract class StringInstuments extends Instuments  {

    private int numberOfStrings;

    public StringInstuments(double buyPrice, double sellPrice, InstumentType instumentType, int numberOfStrings) {
        super(buyPrice, sellPrice, instumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
