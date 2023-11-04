package fr.ufrsciencestech.views;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.awt.Frame;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.exceptions.PanierPleinException;
import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.utils.FruitType;

public class InterfaceTest {

    private Interface i;

    @Mock
    private Panier p;

    @Mock
    private ActionEvent ae = mock(ActionEvent.class);

    private MarcheFruits parent = new MarcheFruits();

    public InterfaceTest() {
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
        try {
            p.ajouterTout(
                    FruitsFactory.createAllOf(FruitType.FRAISE, FruitType.ANANAS, FruitType.BANANE, FruitType.CITRON));
        } catch (PanierPleinException e) {
            e.printStackTrace();
        }

        i = new Interface(parent, true, p);
    }

    @After
    public void tearDown() {
    }

    // Test partie 1
    @Test
    public void testBoutonValiderPanierActionPerformed() {
        System.out.println("testBoutonValiderPanierActionPerformed");
        // Test avec un panier valide
        i.getButtonValider().doClick();
        assertTrue(p.getTaillePanier() == 0);
        assertFalse(i.isActive());
    }

    // Test partie 2
    @Test
    public void testBoutonValiderPanierActionPerformedInvalide() {
        System.out.println("testBoutonValiderPanierActionPerformedInvalide");
        p.vider();
        // Test panier vide donc non valide
        i.BoutonValiderPanierActionPerformed(ae);
        assertFalse(i.isActive());
    }

    @Test
    public void testBoutonRetour() {
        System.out.println("testBoutonRetour");
        // Test avec un panier valide
        i.getButtonRetour().doClick();
        assertFalse(i.isActive());
    }

    @Test
    public void testBoutonViderPanier() {
        System.out.println("testBoutonViderPanier");
        System.out.println(p);
        i.getButtonViderPanier().doClick();
        System.out.println(p);
        assertTrue(p.getTaillePanier() == 0);
        // assertFalse(i.isActive());
    }

    @Test
    public void testBoutonRetirerFruit() {
        System.out.println("testBoutonRetirerFruit");
        i.getButtonRetirerFruit().doClick();
        assertTrue(p.getTaillePanier() == 0);
        // assertFalse(i.isActive());
    }

}
