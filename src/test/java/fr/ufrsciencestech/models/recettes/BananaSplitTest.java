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
public class BananaSplitTest {
    
    public BananaSplitTest() {
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
     * Test of getName method, of class BananaSplit.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BananaSplit instance = new BananaSplit();
        String expResult = "Banana split";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrix method, of class BananaSplit.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        BananaSplit instance = new BananaSplit();
        double result = instance.getPrix();
        assertTrue(result >= 0.0);
    }

    /**
     * Test of getFruits method, of class BananaSplit.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getFruits");
        BananaSplit instance = new BananaSplit();
        ArrayList<Fruit> result = instance.getFruits();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getDescription method, of class BananaSplit.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        BananaSplit instance = new BananaSplit();
        String result = instance.getDescription();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getEtapes method, of class BananaSplit.
     */
    @Test
    public void testGetEtapes() {
        System.out.println("getEtapes");
        BananaSplit instance = new BananaSplit();
        String result = instance.getEtapes();
        assertFalse(result.isEmpty());
    }
    
}
