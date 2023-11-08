/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.views;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.utils.FruitType;
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
public class PageFruitTest {
    
    private PageFruit pf;

    @Mock
    private Panier p;

    private MarcheFruits parent;
    
    public PageFruitTest() {
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

        p = parent.getPanier();
        
        pf = new PageFruit(parent,false,FruitsFactory.createFruit(FruitType.POMME),p);
        
        /// instanciation de PageFruit avec un fruit sans recette. 
        PageFruit ephem = new PageFruit(parent,false,FruitsFactory.createFruit(FruitType.ANANAS),p);
        
    }
    
    @After
    public void tearDown() {
        
        pf.dispose();
    }

    /**
     * Test of AjoutFruit method, of class PageFruit.
     */
    @Test
    public void testgetAjoutFruit() {
        System.out.println("getAjoutFruit");
        int tailleavant = p.getTaillePanier();
        int ajout = Integer.parseInt(pf.getNbFruit().getText());
        pf.getAjoutFruit().doClick();
        assertTrue(p.getTaillePanier() == tailleavant+ajout);
        //test catch
        for(int i = p.getTaillePanier();i<p.getContenanceMax();i++){
            pf.getAjoutFruit().doClick();
        }
        assertTrue(p.estPlein());
        pf.getAjoutFruit().doClick();
        assertTrue(p.estPlein());
    }
    
    /**
     * Test of MoinsFruit method, of class PageFruit.
     */
    @Test
    public void testgetMoinsFruit() {
        System.out.println("getMoinsFruit");
        pf.getPlusFruit().doClick();
        int before = Integer.parseInt(pf.getNbFruit().getText());
        pf.getMoinsFruit().doClick();
        int result = Integer.parseInt(pf.getNbFruit().getText());
        assertTrue(result == before -1);
        pf.getMoinsFruit().doClick();
        assertTrue(result == 1);
    }
    
    /**
     * Test of PlusFruit method, of class PageFruit.
     */
    @Test
    public void testgetPlusFruit() {
        System.out.println("getPlusFruit");
        int before = Integer.parseInt(pf.getNbFruit().getText());
        pf.getPlusFruit().doClick();
        int result = Integer.parseInt(pf.getNbFruit().getText());
        assertTrue(result == before +1);
    }
    
}
