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
    public void canGetPages(){
        assertEquals(100, printer.getPages());
    }

    @Test
    public void canGetToner(){
        assertEquals(10, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.print(1,4);
        assertEquals(96,printer.getPages());
    }

    @Test
    public void canRefill(){
        Printer epson = new Printer(90,10);
        assertEquals(100, epson.refill(10));
        assertEquals(100, printer.refill(10));
    }


    @Test
    public void canReduceToner(){
        printer.print(1,1);
        assertEquals(9 ,printer.getToner());
    }




}
