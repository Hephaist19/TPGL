/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.models.recettes;

import fr.ufrsciencestech.models.fruits.Fruit;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guyot
 */
public class TarteCeriseTest {
    
    public TarteCeriseTest() {
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
     * Test of getName method, of class TarteCerise.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TarteCerise instance = new TarteCerise();
        String expResult = "Tarte aux cerises";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFruits method, of class TarteCerise.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getFruits");
        TarteCerise instance = new TarteCerise();
        ArrayList<Fruit> result = instance.getFruits();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getPrix method, of class TarteCerise.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        TarteCerise instance = new TarteCerise();
        double result = instance.getPrix();
        assertTrue(result >= 0.0);
    }

    /**
     * Test of getDescription method, of class TarteCerise.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        TarteCerise instance = new TarteCerise();
        String result = instance.getDescription();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getEtapes method, of class TarteCerise.
     */
    @Test
    public void testGetEtapes() {
        System.out.println("getEtapes");
        TarteCerise instance = new TarteCerise();
        String result = instance.getEtapes();
        assertFalse(result.isEmpty());
    }
    
}
