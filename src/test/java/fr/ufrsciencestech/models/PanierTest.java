/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.models;

import fr.ufrsciencestech.exceptions.PanierPleinException;
import fr.ufrsciencestech.models.fruits.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PanierTest {
    
    public PanierTest() {
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
     * Test of getTaillePanier method, of class Panier.
     */
    @Test
    public void testGetTaillePanier() {
        System.out.println("getTaillePanier");
        Panier instance = new Panier(2);
        int expResult = 0;
        int result = instance.getTaillePanier();
        assertEquals(expResult, result);
        Fruit fruit1 = (Fruit)(new Pomme());
        try{
            instance.ajout(fruit1);
        }catch(PanierPleinException e ){}
        expResult = 1;
        result = instance.getTaillePanier();
        assertEquals(expResult, result);
        
        Fruit fruit2 = (Fruit)(new Orange());
        try{
            instance.ajout(fruit2);
        }catch(PanierPleinException e ){}
        expResult = 2;
        result = instance.getTaillePanier();
        assertEquals(expResult, result);
        
        Fruit fruit3 = (Fruit)(new Pomme());
        try{
            instance.ajout(fruit3);
        }catch(PanierPleinException e ){assertEquals(1, 1);}
 
    }

    /**
     * Test of getContenanceMax method, of class Panier.
     */
    @Test
    public void testGetContenanceMax() {
        System.out.println("getContenanceMax");
        int expResult = 2;
        Panier instance = new Panier(expResult);
        int result = instance.getContenanceMax();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFruit method, of class Panier.
     */
    @Test
    public void testGetFruit() {
        System.out.println("getFruit");
        int i = 0;
        Panier instance = new Panier(1);
        Fruit expResult = new Pomme();
        try{
            instance.ajout(expResult);
        }catch(PanierPleinException e ){}
        Fruit result = instance.getFruit(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = new Panier(1);
        boolean expResult = true;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = new Panier(1);
        boolean expResult = true;
        Fruit fruit1 = new Pomme();
        try{
            instance.ajout(fruit1);
        }catch(PanierPleinException e ){}
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
    }

    /**
     * Test of ajout method, of class Panier.
     */
    @Test
    public void testAjout() throws Exception {
        System.out.println("ajout");
        Fruit o = new Pomme();
        Panier instance = new Panier(1);
        instance.ajout(o);
    }

    /**
     * Test of retrait method, of class Panier.
     */
    @Test
    public void testRetrait() throws Exception {
        System.out.println("retrait");
        Panier instance = new Panier(1);
        Fruit o = new Pomme();
        instance.ajout(o);
        instance.retrait();
    }
}