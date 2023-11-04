/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.controllers.factories;

import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.utils.PanierType;
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
public class PanierFactoryTest {
    
    public PanierFactoryTest() {
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
     * Test of createPanier method, of class PanierFactory.
     */
    @Test
    public void testCreatePanier_int() {
        System.out.println("createPanier");
        int contenance = 5;
        Panier result = PanierFactory.createPanier(contenance);
        assertEquals(contenance, result.getContenanceMax());
    }

    /**
     * Test of createPanier method, of class PanierFactory.
     */
    @Test
    public void testCreatePanier_PanierType() {
        System.out.println("createPanier");
        PanierFactory pf = new PanierFactory();
        Panier result1 = PanierFactory.createPanier(PanierType.EXOTIQUE);
        assertEquals(result1.getTaillePanier(), 4);
        Panier result2 = PanierFactory.createPanier(PanierType.AGRUME);
        assertEquals(result2.getTaillePanier(), 2);
        Panier result3 = PanierFactory.createPanier(PanierType.SANSPEPINS);
        assertEquals(result3.getTaillePanier(), 5);
        Panier result4 = PanierFactory.createPanier(PanierType.AVECPEPINS);
        assertEquals(result4.getTaillePanier(), 6);
        Panier result5 = PanierFactory.createPanier(PanierType.NULL);
        assertEquals(result5.getTaillePanier(), 11);
    }
    
}
