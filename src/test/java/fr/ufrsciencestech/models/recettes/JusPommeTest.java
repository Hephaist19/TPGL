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
public class JusPommeTest {
    
    public JusPommeTest() {
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
     * Test of getName method, of class JusPomme.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        JusPomme instance = new JusPomme();
        String expResult = "Jus de pomme";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrix method, of class JusPomme.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        JusPomme instance = new JusPomme();
        double result = instance.getPrix();
        assertTrue(result >= 0.0);
    }

    /**
     * Test of getFruits method, of class JusPomme.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getFruits");
        JusPomme instance = new JusPomme();
        ArrayList<Fruit> result = instance.getFruits();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getDescription method, of class JusPomme.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        JusPomme instance = new JusPomme();
        String result = instance.getDescription();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getEtapes method, of class JusPomme.
     */
    @Test
    public void testGetEtapes() {
        System.out.println("getEtapes");
        JusPomme instance = new JusPomme();
        String result = instance.getEtapes();
        assertFalse(result.isEmpty());
    }
    
}
