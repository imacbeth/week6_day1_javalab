import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void subtract(){
        assertEquals(4,calculator.subtract(6,2));
    }

    @Test
    public void multiply(){
        assertEquals(9,calculator.multiply(3,3));
    }

    @Test
    public void divide(){
        assertEquals(3, calculator.divide(6,2));
    }
}
