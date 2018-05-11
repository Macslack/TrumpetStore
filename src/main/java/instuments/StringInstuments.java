package instuments;

public abstract class StringInstuments extends Instuments  {

    private int numberOfStrings;

    public StringInstuments(double buyPrice, double sellPrice, int numberOfStrings) {
        super(buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
