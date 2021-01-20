/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven1() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(-2);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven2() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(-9);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd1() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(-3);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd2() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(-6);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 0;
        NumberHelper instance = new NumberHelper(-2);
        int expResult = -6;
        int result = instance.sum(-4);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime1() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(7);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(9);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime3() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy1() {
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(2);
        assertEquals(expResult, result); 
    }
    
    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy2() {
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(3);
        assertEquals(expResult, result); 
    }
    
    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy3() {
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(0);
        assertEquals(expResult, result); 
    }
    
}
