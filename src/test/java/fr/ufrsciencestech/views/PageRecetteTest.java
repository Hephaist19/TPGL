/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.views;

import fr.ufrsciencestech.controllers.factories.RecettesFactory;
import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.utils.RecetteType;
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
public class PageRecetteTest {
    
    @Mock
    private PageRecette pr;
    
    private Panier p;

    private MarcheFruits parent;
    
    public PageRecetteTest() {
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
        pr = new PageRecette(parent,false,RecettesFactory.createRecette(RecetteType.JUSPOMME),p);
        
        PageRecette emph = new PageRecette(parent,false,RecettesFactory.createRecette(RecetteType.BANANASPLIT),p);
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of AjoutFruit method, of class PageRecette.
     */
    @Test
    public void testgetAjoutRecette() {
        System.out.println("getAjoutRecette");
        int tailleavant = p.getTaillePanier();
        pr.getAjoutRecette().doClick();
        assertTrue(p.getTaillePanier() >= tailleavant);
        //test catch
        for(int i = p.getTaillePanier();i<p.getContenanceMax();i++){
            pr.getAjoutRecette().doClick();
        }
        assertTrue(p.estPlein());
         pr.getAjoutRecette().doClick();
        assertTrue(p.estPlein());
    }
    
    /**
     * Test of MoinsFruit method, of class PageRecette.
     */
    @Test
    public void testgetMoinsRecette() {
        System.out.println("getMoinsRecette");
        pr.getPlusRecette().doClick();
        int before = Integer.parseInt(pr.getNbRecette().getText());
        pr.getMoinsRecette().doClick();
        int result = Integer.parseInt(pr.getNbRecette().getText());
        assertTrue(result == before -1);
        pr.getMoinsRecette().doClick();
        assertTrue(result == 1);
    }
    
    /**
     * Test of PlusFruit method, of class PageRecette.
     */
    @Test
    public void testgetPlusRecette() {
        System.out.println("getPlusRecette");
        int before = Integer.parseInt(pr.getNbRecette().getText());
        pr.getPlusRecette().doClick();
        int result = Integer.parseInt(pr.getNbRecette().getText());
        assertTrue(result == before +1);
    }
    
}
