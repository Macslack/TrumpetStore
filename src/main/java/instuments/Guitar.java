package instuments;


import shop.InstumentType;

public class Guitar extends StringInstuments {

    public Guitar(double buyPrice, double sellPrice, InstumentType instumentType, int numberOfStrings) {
        super(buyPrice, sellPrice, instumentType, numberOfStrings);
    }

    public String play(){
        return "Plink plonk";
    }
}
