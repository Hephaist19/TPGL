package fr.ufrsciencestech.models;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.controllers.factories.RecettesFactory;
import fr.ufrsciencestech.exceptions.PanierPleinException;
import fr.ufrsciencestech.exceptions.PanierVideException;
import fr.ufrsciencestech.models.fruits.*;
import fr.ufrsciencestech.utils.FruitType;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

public class PanierTest {

    @Mock
    private Panier p;

    private PropertyChangeListener l = mock(PropertyChangeListener.class);

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
        p = new Panier(2);
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
        //Test vide
        int expResult = 0;
        int result = p.getTaillePanier();
        assertEquals(expResult, result);

        //Test 1 fruit
        Pomme fruit1 = new Pomme();
        try {
            p.ajout(fruit1);
        } catch (PanierPleinException e) {
        }

        expResult = 1;
        result = p.getTaillePanier();
        assertEquals(expResult, result);

        Orange fruit2 = new Orange();
        try {
            p.ajout(fruit2);
        } catch (PanierPleinException e) {
        }
        expResult = 2;
        result = p.getTaillePanier();
        assertEquals(expResult, result);

        //Test ajout erreur:
        Ananas fruit3 = new Ananas();
        try {
            p.ajout(fruit3);
        } catch (PanierPleinException e) {
            assertEquals(1, 1);
        }

    }

    /**
     * Test of getContenanceMax method, of class Panier.
     */
    @Test
    public void testGetContenanceMax() {
        System.out.println("getContenanceMax");
        int result = p.getContenanceMax();
        assertEquals(2, result);
    }

    /**
     * Test of getFruit method, of class Panier.
     */
    @Test
    public void testGetFruit() {
        System.out.println("getFruit");
        int i = 0;
        Pomme expResult = new Pomme();
        try {
            p.ajout(expResult);
        } catch (PanierPleinException e) {
        }

        Pomme result = (Pomme) p.getFruit(i);
        assertEquals(expResult, result);

        Pomme miss = (Pomme) p.getFruit(-1);
        assertEquals(null, miss);

        miss = (Pomme) p.getFruit(2);
        assertEquals(null, miss);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        boolean expResult = true;
        boolean result = p.estVide();
        assertEquals(expResult, result);

        try {
            p.ajout(new Orange(1, "France"));
        } catch (PanierPleinException e) {
        }

        expResult = false;
        result = p.estVide();
        assertEquals(expResult, result);

        try {
            p.retrait();
        } catch (PanierVideException e) {
        }

        expResult = true;
        result = p.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        
        Pomme po = new Pomme();
        try {
            p.ajout(po);
        } catch (PanierPleinException e) {
        }
        boolean result = p.estPlein();
        //Test si le panier n'est pas plein
        assertEquals(false, result);

        try {
            p.ajout(po);
        } catch (PanierPleinException e) {
        }

        //Test d'un panier plein
        assertEquals(true, p.estPlein());

    }

    /**
     * Test of ajout method, of class Panier.
     */
    @Test
    public void testAjout() {
        System.out.println("ajout");
        Fruit o = new Pomme();
        int expResult = 1;
        try {
            p.ajout(o);
        } catch (PanierPleinException e) {
        }

        int result = p.getTaillePanier();
        assertEquals(expResult, result);

    }

    /**
     * Test of retrait method, of class Panier.
     */
    @Test
    public void testRetrait() {
        System.out.println("retrait");

        Pomme o = new Pomme();
        try {
            p.ajout(o);
        } catch (PanierPleinException e) {};

        try {
            p.retrait();
        } catch (PanierVideException ex) {
        }

        int expResult = 0;
        int result = p.getTaillePanier();
        //Cas ok
        assertEquals(expResult, result);
        
        try {
            p.retrait();
        } catch (PanierVideException ex) {
            //Cas où le retrait est impossible (PanierVideException)
            assertEquals(1, 1);
        }
    }

    /**
     * Test of getFruits method, of class Panier.
     */
    @Test
    public void testGetFruits() {
        System.out.println("getFruits");

        ArrayList<Fruit> expResult = new ArrayList<>();
        Pomme po = new Pomme(1, "France");

        expResult.add(po);
        try {
            p.ajout(po);
        } catch (PanierPleinException ex) {
        }
        ArrayList<Fruit> result = p.getFruits();

        assertEquals(expResult, result);
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");

        Pomme po = new Pomme(1.5, "France");
        Orange o = new Orange(2.3, "France");

        try {
            p.ajout(po);
            p.ajout(o);
        } catch (PanierPleinException ex) {
        }

        double result = p.getPrix();
        assertEquals(3.8, result, 0.003);
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");

        int expresult = 1;
        String origine = "Espagne";

        Pomme po = new Pomme(1.9, "Espagne");
        Orange o = new Orange(2.3, "France");
        try {
            p.ajout(po);
            p.ajout(o);
        } catch (PanierPleinException e) {
        }

        p.boycotteOrigine(origine);
        int result = p.getTaillePanier();

        assertEquals(expresult, result);

        //Test sans modification faite
        p.boycotteOrigine(origine);
        assertEquals(expresult, result);

    }

    /**
     * Test of addObserver method, of class Panier.
     */
    @Test
    public void testAddObserver() {
        System.out.println("addObserver");

        p.addObserver(l);
        assertEquals(1, p.getPropertyChangeSupport().getPropertyChangeListeners().length);
    }

    /**
     * Test of setFruits method, of class Panier.
     */
    @Test
    public void testSetFruits() {
        System.out.println("setFruits");
        Pomme po = new Pomme();
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(po);

        p.setFruits(fruits);
        assertEquals(p.getFruits(), fruits);
    }

    @Test
    public void testRetirer() {
        System.out.println("retirer");
        //Test invalide 1
        p.retirer(-1);
        assertTrue(p.getTaillePanier() == 0);

        p.retirer(5);
        assertTrue(p.getTaillePanier() == 0);
        try {
            p.ajout(new Ananas());
        } catch (PanierPleinException e) {
            e.printStackTrace();
        }

        p.retirer(0);
        assertTrue(p.getTaillePanier() == 0);
    }

    /**
     * Test of setFruit method, of class Panier.
     */
    @Test
    public void testSetFruit() {
        System.out.println("setFruit");
        Pomme po = new Pomme();
        //Deux pommes dans le panier
        try {
            p.ajout(po);
            p.ajout(po);
        } catch (PanierPleinException ex) {
        }

        Orange o = new Orange();
        //On remplace la 1ere pomme avec une Orange
        p.setFruit(0, o);

        //On vérifie l'orange soit bien à l'emplacement 0
        assertEquals(p.getFruit(0), o);

        try {
            Panier temoin = (Panier) p.clone();
            //Test out -
            p.setFruit(-1, o);
            assertTrue(p.equals(temoin));
            //Test out +
            p.setFruit(3, o);
            assertTrue(p.equals(temoin));
        } catch (Exception e) {}

    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Taille: 1" + System.getProperty("line.separator") + "Pomme de France à 1.0 euros" + System.getProperty("line.separator");
        try {
            p.ajout(new Pomme(1.0, "France"));
        } catch (PanierPleinException ex) {
        }

        String result = p.toString();

        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        //Réflexivité vide
        boolean result = p.equals(p);
        assertTrue(result);
        
        Panier p1 = new Panier(1);
        //Premier cas faux (pas la même contenance max)
        assertEquals(false, p.equals(p1));
        
        ///Meme taille de panier
        Panier p2 = new Panier(2);

        //Symétrie vide
        assertEquals(p.equals(p2), p2.equals(p));

        Pomme po = new Pomme();
        Orange o = new Orange();
        
        //p aura une pomme
        //p2 aura une orange
        try {
            p.ajout(po);
            p2.ajout(o);
        } catch (PanierPleinException ex) {}

        result = p.equals(p2);

        //Cas meme taille, mais pas les même fruits
        assertEquals(false, result);
        
        try {
            p.ajout(o);
            //Test pas le même nombre de fruit
            assertFalse(p.equals(p2));
            p2.ajout(po);
        } catch (PanierPleinException ex) {}
        
        result = p.equals(p2);
        //Cas meme taille, mais même fruits, et pas dans le même ordre
        assertEquals(true, result);
        //Test symétrie
        assertEquals(result, p2.equals(p));

        Panier p3 = new Panier(2);
        p3.setFruits(p.getFruits());
        //Test transitivité d'égalité:
        boolean resultxy = p.equals(p2);
        boolean resultyz = p2.equals(p3);
        assertEquals(resultxy, resultyz);

        result = p.equals(p3);

        assertTrue(result);

        //Test comparaison Panier avec autre Object
        assertFalse(p.equals(new Pomme()));
    }

    /**
     * Test of removeObserver method, of class Panier.
     */
    @Test
    public void testRemoveObserver() {
        System.out.println("removeObserver");

        PropertyChangeSupport pcs = new PropertyChangeSupport(this);
        pcs.addPropertyChangeListener(l);

        p.addObserver(l);

        p.removeObserver(l);
        pcs.removePropertyChangeListener(l);
        assertEquals(p.getPropertyChangeSupport().getPropertyChangeListeners().length, pcs.getPropertyChangeListeners().length);
    }

    /**
     * Test of getPropertyChangeSupport method, of class Panier.
     */
    @Test
    public void testGetPropertyChangeSupport() {
        System.out.println("getPropertyChangeSupport");

        PropertyChangeSupport result = p.getPropertyChangeSupport();
        assertEquals(0, result.getPropertyChangeListeners().length);
    }

    /**
     * Test du clone
     */
    @Test
    public void testClone() {
        try {
            p.ajout(new Orange());
            
            Panier copie = (Panier) p.clone();
            //Même panier + même contenu
            assertTrue(p.equals(copie));

            //Pas la même référence
            assertFalse(p == copie);

            //test spéciale où l'arraylist a plus de Fruit que contenance max
            //On remplie le panier de taille 2
            p.ajout(new Kiwi());
            //Hack pour sur-remplir le panier
            p.getFruits().add(new Orange());

            try {
                Panier copieOver = (Panier) p.clone();
                assertEquals(copieOver, p);
                //Une copie devant satisfaire un equals
                //Nous avons décider de lancer une erreur
                //
                //Nous aurions pu copier le contenu du panier:
                //- En copiant le débordement
                //  -> satisfait le equals

                //- En copiant uniquement les fruits pouvant être contenu dans le panier
                //  -> ne satisfait pas le equals

            } catch (CloneNotSupportedException e) {
                assertTrue(true);
            }
            
            } catch (Exception e) {
            fail("Clone impossible de Panier");
        }
        
    }

    @Test
    public void testVider() {
        System.out.println("testVider");
        try {
            p.ajout(new Orange());
        } catch (PanierPleinException e) {
            e.printStackTrace();
        }

        p.vider();
        assertEquals(0, p.getTaillePanier());

    }

    @Test
    public void testAjouterTout() {
        System.out.println("testAjouterTout");
        ArrayList<Fruit> test = FruitsFactory.createAllOf(FruitType.BANANE, FruitType.LITCHI);
        try {
            p.ajouterTout(test);
        } catch (PanierPleinException e) {
            e.printStackTrace();
        }

        assertEquals(2, p.getTaillePanier());

        //ajout de trop de fruit
        test = FruitsFactory.createAllOf(FruitType.FRAISE);

        try {
            p.ajouterTout(test);
        } catch (PanierPleinException e) {
            assertTrue(true);
        }
    }

}
