package shop;

import Sellable.Sellable;
import behaviours.Isell;
import instuments.Guitar;
import instuments.Instuments;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<Sellable>();
    }

    public String getName() {
        return name;
    }
    public int numberOfItemsInStock(){
        return stock.size();
    }
    public void addItem(Sellable item){
        stock.add(item);
    }
    public void removeItem(Sellable item){
        stock.remove(item);
    }
//    public double totalPotentialProfit(){
//          double  totalPotentialProfit = 0.00;
//        for ( : this.stock ){
//              totalPotentialProfit += sellable.calculateMarkup() ;
//        }
//        return totalPotentialProfit ;
//
//    }
    public double totalPotentialProfit(){
        double total = 0;

        for (Sellable item : this.stock){
            total += item.calculateMarkup();
        }
         return  total;



    }
    public Sellable getLowestPriceItem(){
        Sellable lowestItem = stock.get(0);

        for ( Sellable checkingItem : stock){
            if (checkingItem.getSellPrice() < lowestItem.getSellPrice()){
                lowestItem = checkingItem;
            }
        }
        return lowestItem;
    }
    public Sellable getHighestPriceItem(){
        Sellable highestItem = stock.get(0);

        for (Sellable checkingItem : stock){
            if (checkingItem.getSellPrice() > highestItem.getSellPrice()){
                highestItem = checkingItem;
            }
        }
        return highestItem;
    }
    public Sellable getMostProfitableItem(){
        Sellable mostProfit = stock.get(0);

        for (Sellable checkingItem : stock){
            if (checkingItem.calculateMarkup() > mostProfit.calculateMarkup()){
                mostProfit = checkingItem;
            }
        }
        return mostProfit;
    }
}
