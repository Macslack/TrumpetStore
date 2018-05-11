package instuments;


public abstract class Brass extends Instuments{

    private int numberOfValues;

    public Brass(double buyPrice, double sellPrice, int numberOfValues) {
        super(buyPrice, sellPrice);
        this.numberOfValues = numberOfValues;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }
}
