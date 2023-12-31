/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.views;

import fr.ufrsciencestech.models.Panier;
import java.beans.PropertyChangeEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;

/**
 *
 * @author guyot
 */
public class MarcheFruitsTest {
    
    @Mock
    private MarcheFruits parent;
    
    public MarcheFruitsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        parent = new MarcheFruits();
    }
    
    @After
    public void tearDown() {
        
        parent.dispose();
    }

    /**
     * Test of initButtons method, of class MarcheFruits.
     */
    @Test
    public void testInitButtons() {
        System.out.println("initButtons");
        MarcheFruits instance = parent;
        instance.initButtons();
    }

    /**
     * Test of propertyChange method, of class MarcheFruits.
     */
    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        
        MarcheFruits instance = parent;
        assertTrue(instance != null);;
        
        PropertyChangeEvent evt = new PropertyChangeEvent(instance.getPanier(), "fruits", 0, 1);
        instance.propertyChange(evt);

        evt = new PropertyChangeEvent(instance.getPanier(), "fake", 0, 1);
        instance.propertyChange(evt);
    }

    /**
     * Test of getPanier method, of class MarcheFruits.
     */
    @Test
    public void testGetPanier() {
        System.out.println("getPanier");
        MarcheFruits instance = parent;
        Panier result = instance.getPanier();
        assertTrue(result != null);
    }
    
}
