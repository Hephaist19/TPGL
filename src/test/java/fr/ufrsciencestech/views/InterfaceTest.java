package fr.ufrsciencestech.views;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.exceptions.PanierPleinException;
import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.models.fruits.Banane;
import fr.ufrsciencestech.utils.FruitType;

public class InterfaceTest {

    private Interface i;

    @Mock
    private Panier p;

    private MarcheFruits parent;

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

        parent = new MarcheFruits();

        p = parent.getPanier();

        try {
            p.ajouterTout(FruitsFactory.createAllOf(FruitType.FRAISE, FruitType.ANANAS, FruitType.BANANE, FruitType.CITRON));
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
        //Simuler un clique avec un panier vide
        i.getButtonValider().doClick();
        assertFalse(i.isActive());
    }

    @Test
    public void testBoutonRetourMouseClicked() {
        System.out.println("testBoutonRetourMouseClicked");
        i.getButtonRetour().doClick();
        //Resultat attendu: la fenêtre n'est plus visible
        assertFalse(i.isActive());
    }

    @Test
    public void testBoutonViderPanierMouseClicked() {
        System.out.println("testBoutonViderPanierMouseClicked");
        i.getButtonViderPanier().doClick();
        System.out.println(p);
        assertTrue(p.getTaillePanier() == 0);
        // assertFalse(i.isActive());
    }

    @Test
    public void testBoutonRetirerFruit() {
        System.out.println("testBoutonRetirerFruit");
        int debut = p.getTaillePanier();
        System.out.println(p);
        i.getAffichePanier().setSelectedIndex(1);
        i.getButtonRetirerFruit().doClick();
        System.out.println(p);
        assertTrue(p.getTaillePanier() == (debut-1));
        // assertFalse(i.isActive());
    }

    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        
        Interface instance = new Interface(parent, false, p);
        assertTrue(instance != null);
        PropertyChangeEvent evt = new PropertyChangeEvent(instance.getPanier(), "fruits", 0, 1);
        instance.propertyChange(evt);
        
        evt = new PropertyChangeEvent(instance.getPanier(), "fake", 0, 1);
        instance.propertyChange(evt);
    }

}
