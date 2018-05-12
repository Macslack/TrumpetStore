package accessories;

import Sellable.Sellable;
import behaviours.Isell;

public abstract class Accessories extends Sellable {
    public Accessories(double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
    }
}
