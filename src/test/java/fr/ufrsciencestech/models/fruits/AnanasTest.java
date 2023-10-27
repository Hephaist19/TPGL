/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nj123548
 */
public class AnanasTest extends FruitTest {
    
    @Override
    public Fruit createInstance() {
        return new Ananas(0.5, "Espagne");
    }
    
    public AnanasTest() {
        super.setUp();
    }
    
    /**
     * Test of toString method, of class Ananas.
     */
    @Override
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Ananas de Espagne à 0.5 euros";
        String result = fi.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Ananas.
     */
    @Override
    @Test
    public void testEquals() {
        System.out.println("equals");
        System.out.println("Test pas égal");
        Fruit o = new Ananas(0.5, "Espagne");
        boolean expResult = true;
        boolean result = fi.equals(o);
        assertEquals(expResult, result);
        
        o = new Ananas(0.5, "France");
        result = fi.equals(o);
        System.out.println("Test égal");
        assertEquals(false, result);
    }
}
