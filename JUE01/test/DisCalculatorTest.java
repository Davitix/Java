/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.DiscountCalculator;
import Servicio.ServiciosDisCalc;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class DisCalculatorTest {

    public DisCalculatorTest() {
    }
    
    ServiciosDisCalc sd;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        sd = new ServiciosDisCalc();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TenPercentDiscount() {
        assertEquals(20.0, sd.discount(new DiscountCalculator(200, 10)), 0);
        assertEquals(10.0, sd.discount(new DiscountCalculator(100, 10)), 0);
        assertEquals(5.0, sd.discount(new DiscountCalculator(50, 10)), 0);
        assertEquals(2.5, sd.discount(new DiscountCalculator(25, 10)), 0);
        assertEquals(1.2, sd.discount(new DiscountCalculator(12, 10)), 0);
    }
    
    @Test
    public void MaxDiscount() {
        assertEquals(200, sd.discount(new DiscountCalculator(200, 100)), 0);
        assertEquals(100, sd.discount(new DiscountCalculator(100, 100)), 0);
        assertEquals(50, sd.discount(new DiscountCalculator(50, 100)), 0);
        assertEquals(25, sd.discount(new DiscountCalculator(25, 100)), 0);
        assertEquals(12, sd.discount(new DiscountCalculator(12, 100)), 0);
    }
    
    @Test
    public void NoDiscount() {
        assertEquals(0.0, sd.discount(new DiscountCalculator(200, 0)), 0);
        assertEquals(0.0, sd.discount(new DiscountCalculator(100, 0)), 0);
        assertEquals(0.0, sd.discount(new DiscountCalculator(50, 0)), 0);
        assertEquals(0.0, sd.discount(new DiscountCalculator(25, 0)), 0);
        assertEquals(0.0, sd.discount(new DiscountCalculator(12, 0)), 0);
    }
    
}
