/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
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

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        System.out.println("isChaineValide");
        String str = "Paris";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isChaineValide(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        String str = "13";
        StringUtils instance = new StringUtils();
        String expResult = "31";
        String result = instance.inverse(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String str = "toto";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        System.out.println("compterOccurences");
        String str = "toto";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = null;
        expResult = new TreeMap<>();
        expResult.put("t",2);
        expResult.put("o",2);
        Map<String, Integer> result = instance.compterOccurences(str);
        assertEquals(expResult, result);
    }
    @Test(expected=IllegalArgumentException.class)
    public void ispoiuette(){
        String s = "j";
        StringUtils instance = new StringUtils();
        instance.isChaineValide(s);
    }
}
