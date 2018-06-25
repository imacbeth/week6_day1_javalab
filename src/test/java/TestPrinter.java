import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void getSheets(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void print(){
        printer.print(5, 2);
        assertEquals(40, printer.getSheets());
    }

    @Test
    public void refillPrinter(){
        printer.refill();
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void tonerReduces(){
        printer.print(1,1);
        assertEquals(99,printer.getTonerVolume());
    }

}
