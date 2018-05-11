package instuments;

public class Trumpet extends Brass {

    public Trumpet(double buyPrice, double sellPrice, int numberOfValues) {
        super(buyPrice, sellPrice, numberOfValues);
    }

    public String play() {
        return "toot toot";
    }
}
