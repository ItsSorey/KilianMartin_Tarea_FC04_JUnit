package VowelConsonantTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import VowelConsonant.VowelConsonant;

class VowelConsonantTest {
    public void VowelTest() {
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
    public void VowelTest1(){
    VowelConsonant v = new VowelConsonant();
    String expResult = "vowel";
    String result = v.check("o");
    assertEquals(expResult,result);
    }
        @Test
    public void VowelTest2(){
    VowelConsonant v = new VowelConsonant();
    String expResult = "consonant";
    String result = v.check("f");
    assertEquals(expResult,result);
    }
}