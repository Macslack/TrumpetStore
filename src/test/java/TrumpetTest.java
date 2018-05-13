import instuments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shop.InstumentType;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;


    @Before
    public void before(){
        trumpet = new Trumpet(100.00, 200.00, InstumentType.BRASS, 5);
    }
    @Test
    public void canGetBuyPrice(){
        assertEquals(100.00, trumpet.getBuyPrice(),0.01);
    }
    @Test
    public void canGetSellPrice(){
        assertEquals(200.0, trumpet.getSellPrice(),0.01);
    }
    @Test
    public void canGetNumberOfValves(){
        assertEquals(5, trumpet.getNumberOfValues());
    }
    @Test
    public void canPlay(){
        assertEquals("toot toot", trumpet.play());
    }
    @Test
    public void canGetMarkup(){
        assertEquals(100.00, trumpet.calculateMarkup(),0.01);
    }

}

