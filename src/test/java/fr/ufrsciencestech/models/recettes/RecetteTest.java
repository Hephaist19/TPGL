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
import org.mockito.Mock;

/**
 *
 * @author guyot
 */
public abstract class RecetteTest {
    
    
    public abstract Recette createInstance();

    @Mock
    Recette re;
    
    public RecetteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        re = createInstance(); 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Recette.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        // On veut que ce getter renvoie une chaine non vide
        boolean result = !re.getName().equals("");
        assertTrue(result);
    }

    /**
     * Test of getPrix method, of class Recette.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        // On veut qu'un fruit ait toujours un prix positif (ou nul)
        boolean result = re.getPrix() >= 0.0;
        assertTrue(result);
    }

    /**
     * Test of getFruits method, of class Recette.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getPrix");
        // On veut qu'un fruit ait toujours un prix positif (ou nul)
        boolean result = re.getFruits().isEmpty();
        assertTrue(result);
    }

    /**
     * Test of getDescription method, of class Recette.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        // On veut que ce getter renvoie une chaine non vide
        boolean result = !re.getDescription().equals("");
        assertTrue(result);
    }

    /**
     * Test of getEtapes method, of class Recette.
     */
    @Test
    public void testGetEtapes() {
        System.out.println("getEtapes");
        // On veut que ce getter renvoie une chaine non vide
        boolean result = !re.getEtapes().equals("");
        assertTrue(result);
    }

    public class RecetteImpl implements Recette {

        public String getName() {
            return "";
        }

        public double getPrix() {
            return 0.0;
        }

        public ArrayList<Fruit> getFruits() {
            return null;
        }

        public String getDescription() {
            return "";
        }

        public String getEtapes() {
            return "";
        }
    }
    
}
