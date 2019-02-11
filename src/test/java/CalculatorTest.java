import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10, 5);
    }



    @Test
    public void canAdd(){
        assertEquals(15, calculator.add(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiply(), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide(), 0.01);
    }



}
