/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.controllers.factories;

import fr.ufrsciencestech.models.recettes.Recette;
import fr.ufrsciencestech.utils.RecetteType;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

/**
 *
 * @author guyot
 */
public class RecettesFactoryTest {
    
    @Mock
    private  RecettesFactory p;

    private PropertyChangeListener l = mock(PropertyChangeListener.class);
    
    public RecettesFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new RecettesFactory();
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of createAllOf method, of class RecettesFactory.
     */
    @Test
    public void testCreateAllOf() {
        
        System.out.println("createAllOf");
        ArrayList<Recette> result = RecettesFactory.createAllOf(RecetteType.BANANASPLIT);
        System.out.println(result.get(0).getName());
        assertEquals("Banana split", result.get(0).getName());
        result = RecettesFactory.createAllOf(RecetteType.CAKECITRON);
        System.out.println(result.get(0).getName());
        assertEquals("Cake au citron", result.get(0).getName());
        result = RecettesFactory.createAllOf(RecetteType.JUSPOMME);
        System.out.println(result.get(0).getName());
        assertEquals("Jus de pomme", result.get(0).getName());
        result = RecettesFactory.createAllOf(RecetteType.TARTECERISE);
        System.out.println(result.get(0).getName());
        assertEquals("Tarte aux cerises", result.get(0).getName());
    }
    
}
