package sumdigits;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumDigitsTest {
	public SumDigitsTest() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
      @Test
    public void testsumdigits1() {
                 System.out.println ("Prueba de un entero");
        SumDigits sum = new SumDigits();
        int expResult = 5;
        int result = sum.sum(5);
        assertEquals(expResult, result);
    }
          @Test
    public void testsumdigits2() {
                 System.out.println ("Prueba de entero de dos dígitos");
        SumDigits sum = new SumDigits();
        int expResult = 7;
        int result = sum.sum(25);
        assertEquals(expResult, result);
    }
          @Test
    public void testsumdigits3() {
                 System.out.println ("Prueba de entero de tres dígitos");
        SumDigits sum = new SumDigits();
        int expResult = 6;
        int result = sum.sum(150);
        assertEquals(expResult, result);
    }
          @Test
    public void testsumdigits4() {
                 System.out.println ("La prueba de números negativos no pasa la prueba");
        SumDigits sum = new SumDigits();
        int expResult = -2;
        int result =sum.sum(-20);
        assertFalse(result==expResult);  
    }
@Test(expected = IllegalArgumentException.class)
	public void testsumdigits5(){
         SumDigits sum = new SumDigits();
         int expResult = 6;
                   int result = sum.sum ((int) 150.00); // Forzar la conversión del tipo de datos
         assertFalse(result==expResult);        
        }
}
