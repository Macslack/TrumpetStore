package instuments;

import shop.InstumentType;

public class Trumpet extends Brass {

    public Trumpet(double buyPrice, double sellPrice, InstumentType instumentType, int numberOfValues) {
        super(buyPrice, sellPrice, instumentType, numberOfValues);
    }

    public String play() {
        return "toot toot";
    }
}
