/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nj123548
 */
public class AnanasTest {
    
    public AnanasTest() {
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
     * Test of getPrix method, of class Ananas.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Ananas instance = new Ananas();
        double expResult = 0.5;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getOrigine method, of class Ananas.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Ananas instance = new Ananas();
        String expResult = "Espagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Ananas.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ananas instance = new Ananas();
        String expResult = "Ananas de Espagne a 0.5 euros";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Ananas.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Ananas();
        Ananas instance = new Ananas();
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSeedless method, of class Ananas.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Ananas instance = new Ananas();
        boolean expResult = true;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
    }
    
}
