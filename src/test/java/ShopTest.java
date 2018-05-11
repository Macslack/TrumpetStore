import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Test Shop");
    }
    @Test
    public void canGetShopName(){
        assertEquals("Test Shop", shop.getName());
    }
}
