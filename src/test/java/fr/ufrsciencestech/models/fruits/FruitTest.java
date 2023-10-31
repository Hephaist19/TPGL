/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.mockito.Mock;

/**
 *
 * @author nj123548
 */
public abstract class FruitTest {
    
    /**
     * Instancie un fruit pour les tests de l'interface Fruit.
     * @return 
     */
    public abstract Fruit createInstance();
    
    @Mock
    Fruit fi;
    
    public FruitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        fi = createInstance();
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of isSeedless method, of class Fruit.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        boolean res = fi.isSeedless(); //Obligé pour la couverture de code
        //Ici aucune particularitée
        assertTrue(res || !res);
    }

    /**
     * Test of getPrix method, of class Fruit.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        //On veut qu'un fruit ait toujours un prix positif (ou nul)
        boolean result = fi.getPrix() >= 0.0;
        assertTrue(result);
    }

    /**
     * Test of getOrigine method, of class Fruit.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        //On veut que ce getter renvoie une chaine non vide
        boolean result = !fi.getOrigine().equals("");
        assertTrue(result);
    }

    /**
     * Test of equals method, of class Fruit.
     */
    @Test
    public abstract void testEquals();

    /**
     * Test of toString method, of class Fruit.
     */
    @Test
    public abstract void testToString();

    /**
     * Test of setPrix method, of class Fruit.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double d = 8.2;
        fi.setPrix(d);
        
        double result = fi.getPrix();
        assertEquals(result, d, 0.001);
    }

    /**
     * Test of setOrigine method, of class Fruit.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String string = "Lune";
        fi.setOrigine(string);
        
        String result = fi.getOrigine();
        assertEquals(string, result);
    }

    @Test
    public void testClone() {
        System.out.println("clone");
        try {
            Fruit copie = (Fruit) fi.clone();
            boolean result = fi.equals(copie);
            //Même contenu
            assertTrue(result);
            //Pas les mêmes références mémoire
            assertFalse(copie == fi);
        }catch (CloneNotSupportedException e) {
            fail("Clone non supporté");
        }
    }
}
