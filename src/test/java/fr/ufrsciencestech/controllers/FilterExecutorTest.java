package fr.ufrsciencestech.controllers;

import fr.ufrsciencestech.controllers.factories.RecettesFactory;
import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.utils.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;

public class FilterExecutorTest {

    ArrayList<Fruit> listeTest;
    FilterExecutor fe;

    public FilterExecutorTest() {}

    @Before
    public void setUp() {
        //Setup une liste dans cet ordre:
        //Kiwi - Banane - Orange - Cerise - Ananas - Framboise
        listeTest = RecettesFactory.createAllOf(FruitType.KIWI, FruitType.BANANE, FruitType.ORANGE, FruitType.CERISE, FruitType.ANANAS, FruitType.FRAMBOISE);
        fe = new FilterExecutor(listeTest);
    }

    @Test
    public void testSort() {
        System.out.println("testSortAlphabetique");
        ArrayList<Fruit> result = fe.sort(SortType.ALPHABETIQUE).getResult();
        ArrayList<Fruit> attendu = RecettesFactory.createAllOf(FruitType.ANANAS, FruitType.BANANE, FruitType.CERISE, FruitType.FRAMBOISE, FruitType.KIWI, FruitType.ORANGE);
        assertEquals(attendu, result);

        System.out.println("testSortAntiAlphabetique");
        fe = new FilterExecutor(listeTest);
        result = fe.sort(SortType.ANTIALPHABETIQUE).getResult();
        attendu = RecettesFactory.createAllOf(FruitType.ORANGE, FruitType.KIWI, FruitType.FRAMBOISE, FruitType.CERISE, FruitType.BANANE, FruitType.ANANAS);
        assertEquals(attendu, result);

        //Teste tri par prix
        //cf prix constructeur defaut des fruit en question
        System.out.println("testSortprixCroissant");
        result = fe.sort(SortType.PRIXCROISSANT).getResult();
        attendu = RecettesFactory.createAllOf(FruitType.KIWI, FruitType.ORANGE, FruitType.BANANE, FruitType.ANANAS, FruitType.FRAMBOISE, FruitType.CERISE);
        assertEquals(attendu, result);


        System.out.println("testSortprixDécroissant");
        fe = new FilterExecutor(listeTest);
        result = fe.sort(SortType.PRIXDECROISSANT).getResult();
        attendu = RecettesFactory.createAllOf(FruitType.CERISE, FruitType.FRAMBOISE, FruitType.ANANAS, FruitType.BANANE, FruitType.ORANGE, FruitType.KIWI);
        assertEquals(attendu, result);

    }

    @Test
    public void testFilter() {
        System.out.println("testFilterSansPepin");
        //Test filtre SANS PEPINS -> doit laisser que des fruits sans pépins
        ArrayList<Fruit> result = fe.filter(FilterType.SANSPEPINS).getResult();
        ArrayList<Fruit> attendu = RecettesFactory.createAllOf(FruitType.BANANE, FruitType.ORANGE, FruitType.ANANAS, FruitType.FRAMBOISE);
        assertEquals(attendu, result);

        System.out.println("testFilterAvecPepin");
        //Test filtre SANS PEPINS
        fe = new FilterExecutor(listeTest);
        result = fe.filter(FilterType.AVECPEPINS).getResult();
        attendu = RecettesFactory.createAllOf(FruitType.KIWI, FruitType.CERISE);
        assertEquals(attendu, result);
    }

    @Test
    public void testFilterExecutor() {
        System.out.println("testFilterExecutor");
        FilterExecutor fe = new FilterExecutor();
        assertEquals(fe.getResult().size(), FruitType.values().length);
    }
    
}
