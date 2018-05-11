package instuments;


public class Guitar extends StringInstuments {

    public Guitar(double buyPrice, double sellPrice, int numberOfStrings) {
        super(buyPrice, sellPrice, numberOfStrings);
    }

    public String play(){
        return "Plink plonk";
    }
}
