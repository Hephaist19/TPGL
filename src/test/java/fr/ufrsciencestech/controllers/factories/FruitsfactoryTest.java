package fr.ufrsciencestech.controllers.factories;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.utils.FruitType;

public class FruitsfactoryTest {
    

    public FruitsfactoryTest() {}

    @Test
    public void testCreateFruit() {
        FruitsFactory instance = new FruitsFactory();
        System.out.println("testCreateFruit");
        for(FruitType ft : FruitType.values()) {
            //Tester que la creation d'un fruit est possible pour tous les cas
            Fruit tmp = FruitsFactory.createFruit(ft);
        }
        for(FruitType ft : FruitType.values()) {
            Fruit tmp = FruitsFactory.createFruit(ft, 8.5, "France");
            if(null != tmp) {
                assertTrue(8.5 == tmp.getPrix());
                assertTrue(tmp.getOrigine().equals("France"));
            }
        }
    }

    @Test
    public void testCreateAll() {
        ArrayList<Fruit> all = FruitsFactory.createAll();
        //Est-ce que cette methods renvoit bien une liste avec tous les fruit dedans
        //Sachant que la valeur null produit un fruit valide aussi (Cf FruitFactory)
        assertTrue(all.size() == FruitType.values().length);
    }

}
