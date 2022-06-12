/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elena
 */
public class NumeroParTest {
    
    public NumeroParTest() {
    }

    /**
     * Test of ePar method, of class NumeroPar.
     */
    @Test
    public void testEPar1() {
        System.out.println("ePar1");
        int numero = 8;
        boolean expResult = true;
        boolean result = NumeroPar.ePar(numero);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEPar2() {
        System.out.println("ePar2");
        int numero = 7;
        boolean expResult = false;
        boolean result = NumeroPar.ePar(numero);
        assertEquals(expResult, result);
    }


}
