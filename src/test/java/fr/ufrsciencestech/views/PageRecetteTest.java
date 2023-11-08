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
        
        p = parent.getPanier();
        pr = new PageRecette(parent,false,RecettesFactory.createRecette(RecetteType.JUSPOMME),p);
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of AjoutFruit method, of class PageRecette.
     */
    @Test
    public void testgetAjoutFruit() {
        System.out.println("getAjoutFruit");
        int tailleavant = p.getTaillePanier();
        int ajout = Integer.parseInt(pr.getNbRecette().getText());
        pr.getAjoutRecette().doClick();
        assertTrue(p.getTaillePanier() == tailleavant+ajout);
    }
    
}
