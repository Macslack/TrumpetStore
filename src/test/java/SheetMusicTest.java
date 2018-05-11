import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(100.00, 200.00, 20);
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(100.00, sheetMusic.getBuyPrice(),0.01);
    }
    @Test


}
