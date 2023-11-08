package fr.ufrsciencestech.controllers;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.utils.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;

public class FruitsFilterTest {

        ArrayList<Fruit> listeTest;
        FruitsFilter fe;

        public FruitsFilterTest() {
        }

        @Before
        public void setUp() {
                // Setup une liste dans cet ordre:
                // Kiwi - Banane - Orange - Cerise - Ananas - Framboise
                listeTest = FruitsFactory.createAllOf(FruitType.KIWI, FruitType.BANANE, FruitType.ORANGE,
                                FruitType.CERISE,
                                FruitType.ANANAS, FruitType.FRAMBOISE);
                fe = new FruitsFilter(listeTest);
        }

        @Test
        public void testSort() {
                System.out.println("testSortAlphabetique");
                ArrayList<Fruit> result = fe.sort(SortType.ALPHABETIQUE).getResult();
                ArrayList<Fruit> attendu = FruitsFactory.createAllOf(FruitType.ANANAS, FruitType.BANANE,
                                FruitType.CERISE,
                                FruitType.FRAMBOISE, FruitType.KIWI, FruitType.ORANGE);
                assertEquals(attendu, result);

                System.out.println("testSortAntiAlphabetique");
                fe = new FruitsFilter(listeTest);
                result = fe.sort(SortType.ANTIALPHABETIQUE).getResult();
                attendu = FruitsFactory.createAllOf(FruitType.ORANGE, FruitType.KIWI, FruitType.FRAMBOISE,
                                FruitType.CERISE,
                                FruitType.BANANE, FruitType.ANANAS);
                assertEquals(attendu, result);

                // Teste tri par prix
                // cf prix constructeur defaut des fruit en question
                System.out.println("testSortprixCroissant");
                result = fe.sort(SortType.PRIXCROISSANT).getResult();
                attendu = FruitsFactory.createAllOf(FruitType.KIWI, FruitType.ORANGE, FruitType.BANANE,
                                FruitType.ANANAS,
                                FruitType.FRAMBOISE, FruitType.CERISE);
                assertEquals(attendu, result);

                System.out.println("testSortprixDécroissant");
                fe = new FruitsFilter(listeTest);
                result = fe.sort(SortType.PRIXDECROISSANT).getResult();
                attendu = FruitsFactory.createAllOf(FruitType.CERISE, FruitType.FRAMBOISE, FruitType.ANANAS,
                                FruitType.BANANE,
                                FruitType.ORANGE, FruitType.KIWI);
                assertEquals(attendu, result);

        }

        @Test
        public void testFilter() {
                System.out.println("testFilterSansPepin");
                // Test filtre SANS PEPINS -> doit laisser que des fruits sans pépins
                ArrayList<Fruit> result = fe.filter(FilterType.NPEPINS).getResult();
                ArrayList<Fruit> attendu = FruitsFactory.createAllOf(FruitType.BANANE, FruitType.ORANGE,
                                FruitType.ANANAS,
                                FruitType.FRAMBOISE);
                assertEquals(attendu, result);

                System.out.println("testFilterAvecPepin");
                // Test filtre SANS PEPINS
                fe = new FruitsFilter(listeTest);
                result = fe.filter(FilterType.PEPINS).getResult();
                attendu = FruitsFactory.createAllOf(FruitType.KIWI, FruitType.CERISE);
                assertEquals(attendu, result);
        }

        @Test
        public void testFruitsFilter() {
                System.out.println("testFruitsFilter");
                FruitsFilter fe = new FruitsFilter();
                ArrayList<Fruit> result;
                result = fe.filter(FilterType.PEPINS).getResult();
                assertEquals(5 , result.size());
                fe = new FruitsFilter();
                result = fe.filter(FilterType.NPEPINS).getResult();
                assertEquals(6 ,  result.size());
                fe = new FruitsFilter();
                result = fe.filter(FilterType.EXOTIQUE).getResult();
                assertEquals(4,  result.size());
                fe = new FruitsFilter();
                result = fe.filter(FilterType.AGRUME).getResult();
                assertEquals(2 ,  result.size());
        }

}
