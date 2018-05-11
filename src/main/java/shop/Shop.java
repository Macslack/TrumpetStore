package shop;

import behaviours.Isell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<Isell>();
    }

    public String getName() {
        return name;
    }
    public int numberOfItemsInStock(){
        return stock.size();
    }
    public void addItem(Isell item){
        stock.add(item);
    }
    public void removeItem(Isell item){
        stock.remove(item);
    }
}
