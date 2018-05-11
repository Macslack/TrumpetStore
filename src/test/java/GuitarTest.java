import instuments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(100.00, 200.00, 5);
    }
    @Test
    public void canGetMarkUp(){
        assertEquals(100.00, guitar.calculateMarkup(),0.01);
    }




}
