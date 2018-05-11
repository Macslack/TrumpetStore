package accessories;

import behaviours.Isell;

public class SheetMusic extends Accessories {
    private int pageNumber;

    public SheetMusic(double buyPrice, double sellPrice, int pageNumber) {
        super(buyPrice, sellPrice);
        this.pageNumber = pageNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
