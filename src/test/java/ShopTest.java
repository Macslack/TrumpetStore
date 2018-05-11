import instuments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop("Test Shop");
        guitar = new Guitar(100.00, 200.00, 6);
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
}
