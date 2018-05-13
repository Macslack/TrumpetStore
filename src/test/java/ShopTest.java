import instuments.Guitar;
import instuments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shop.InstumentType;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Trumpet trumpet;

    @Before
    public void before(){
        shop = new Shop("Test Shop");
        guitar = new Guitar(100.00, 200.00, InstumentType.STRINGS, 5);
        trumpet = new Trumpet(100.00, 150.00, InstumentType.BRASS, 5);
    }
    @Test
    public void canGetShopName(){
        assertEquals("Test Shop", shop.getName());
    }
    @Test
    public void shopStartsEmpty(){
        assertEquals(0, shop.numberOfItemsInStock());
    }
    @Test
    public void canAddItem(){
            shop.addItem(guitar);
        assertEquals(1,shop.numberOfItemsInStock());
    }
    @Test
    public void canRemoveItem(){
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.numberOfItemsInStock());
    }
    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addItem(guitar);
        shop.addItem(guitar);
        shop.addItem(guitar);
        assertEquals(300.00, shop.totalPotentialProfit(),0.01);
   }
   @Test
    public void canGetLowestPriceItem(){
        shop.addItem(guitar);
        shop.addItem(guitar);
        shop.addItem(trumpet);
        shop.addItem(trumpet);
        assertEquals(trumpet, shop.getLowestPriceItem());

   }
   @Test
    public void canGetHighestPriceItem(){
       shop.addItem(guitar);
       shop.addItem(trumpet);
       assertEquals(guitar, shop.getHighestPriceItem());

   }
   @Test
    public void canGetMostProfitableItem(){
       shop.addItem(guitar);
       shop.addItem(trumpet);
       assertEquals(guitar, shop.getMostProfitableItem());
   }

}
