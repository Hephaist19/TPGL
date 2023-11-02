package fr.ufrsciencestech.models.fruits;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jl336673
 */
public class LitchiTest extends FruitTest {
    @Override
    public Fruit createInstance() {
        return new Litchi(0.5, "Espagne");
    }

    public LitchiTest() {
        super.setUp();
    }

    /**
     * Test of toString method, of class Ananas.
     */
    @Override
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Litchi de Espagne à 0.5 euros";
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

        // Test egal
        Fruit o = new Litchi(0.5, "Espagne");

        assertTrue(fi.equals(o));

        o.setOrigine("France");
        // test pas egal par origine
        assertFalse(fi.equals(o));

        // test pas egal par prix
        o.setOrigine("Espagne");
        o.setPrix(1.0);
        assertFalse(fi.equals(o));

        // Test avec null
        assertFalse(fi.equals(null));

        // Test avec une classe différente de celle de l'instance
        assertFalse(fi.equals(new Ananas()));
    }
}