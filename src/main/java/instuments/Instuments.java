package instuments;

import Sellable.Sellable;
import behaviours.Iplay;


public abstract class Instuments extends Sellable implements Iplay{
    public Instuments(double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
    }
}
