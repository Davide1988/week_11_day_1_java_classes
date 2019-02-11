import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 10);
    }

    @Test
    public void canPrint(){
        assertEquals(true ,printer.print(1,4));
    }

    @Test
    public void canRefill(){
        Printer epson = new Printer(90,10);
        assertEquals(100, epson.refill(10));
        assertEquals(100, printer.refill(10));
    }


    @Test
    public void canReduceToner(){
        assertEquals(8 ,printer.reduceToner(2));
    }




}
