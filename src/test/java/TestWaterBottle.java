import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    WaterBottle waterBottle;


    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkWater(){
        assertEquals(90,waterBottle.drink());
    }

}
