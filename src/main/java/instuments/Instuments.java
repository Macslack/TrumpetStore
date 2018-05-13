package instuments;

import Sellable.Sellable;
import behaviours.Iplay;
import shop.InstumentType;


public abstract class Instuments extends Sellable implements Iplay{
    public Instuments(double buyPrice, double sellPrice, InstumentType instumentType) {
        super(buyPrice, sellPrice);
    }
}
