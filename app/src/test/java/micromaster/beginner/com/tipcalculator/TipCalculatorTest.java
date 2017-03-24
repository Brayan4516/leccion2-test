package micromaster.beginner.com.tipcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by byron on 2/14/2017.
 */
public class TipCalculatorTest {
    @Test
    public void calculateTip() throws Exception {

    }

    @Test
    public void parseBillValue() throws Exception {

    }

    private TipCalculator tipCalculator;

    @Before
    public void setUp() throws Exception {
        tipCalculator = new TipCalculator();
    }

    @Test

    public void parse_test() throws Exception{
        Double respuesta = 2.35;
        assertEquals(respuesta , tipCalculator.parseBillValue("2.35"));
    }
    @Test
    public void calculateTip_15() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.15;
        String totalExpected = "115.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        //expected: 100 + (100*15%) = 115.0
        assertEquals(totalExpected, totalAmount);
    }

    @Test
    public void calculateTip_20() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.20;
        String totalExpected = "120.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        //expected: 100 + (100*15%) = 115.0
        assertEquals(totalExpected, totalAmount);
    }

    @Test
    public void calculateTip_30() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.30;
        String totalExpected = "130.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        //expected: 100 + (100*15%) = 115.0
        assertEquals(totalExpected, totalAmount);
    }

    @Test
    public void calculateTip_40() throws Exception {
        Double billAmount = 100.0;
        Double tipToCalculate = 0.40;
        String totalExpected = "140.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        //expected: 100 + (100*15%) = 115.0
        assertEquals(totalExpected, totalAmount);
    }

}