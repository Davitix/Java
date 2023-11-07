/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.PasswordManager;
import Servicio.ServicePassMan;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class PassManagerTest {

    public PassManagerTest() {
    }
    
    ServicePassMan sp = new ServicePassMan();;

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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void length() {
        assertSame(sp, sp);
        assertTrue(sp.length(new PasswordManager("aaaaaaaa")));
        assertTrue(sp.length(new PasswordManager("12345678")));
        assertTrue(sp.length(new PasswordManager("abcdefgh")));
    }
    
    @Test
    public void symbols() {
        assertTrue(sp.mayus(new PasswordManager("ACD#")));
        assertTrue(sp.mayus(new PasswordManager("XY-")));
        assertTrue(sp.mayus(new PasswordManager("AAA_")));
        assertTrue(sp.mayus(new PasswordManager("ABC$")));
        assertTrue(sp.mayus(new PasswordManager("XYZ&")));
        assertTrue(sp.mayus(new PasswordManager("XYZ/")));
        assertTrue(sp.mayus(new PasswordManager("XYZ*")));
    }
    
    @Test
    public void mayus() {
        assertTrue(sp.mayus(new PasswordManager("AAAA")));
        assertTrue(sp.mayus(new PasswordManager("ABCD")));
        assertTrue(sp.mayus(new PasswordManager("XYZ")));
    }
    
    @Test
    public void full() {
        assertTrue(sp.symbols(new PasswordManager("Karemonda4225*")));
    }
    
    
    
}
