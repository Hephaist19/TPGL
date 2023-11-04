package fr.ufrsciencestech.controllers.factories;

import fr.ufrsciencestech.controllers.FruitsFilter;
import fr.ufrsciencestech.models.*;
import fr.ufrsciencestech.utils.*;
import fr.ufrsciencestech.models.fruits.Fruit;
import java.util.*;

public class PanierFactory {

    public static Panier createPanier(int contenance) {
        return new Panier(contenance);
    }

    public static Panier createPanier(PanierType type) {

        Panier p;
        FruitsFilter fe;
        ArrayList<Fruit> list;

        switch (type) {
            case EXOTIQUE:
                list = FruitsFactory.createAllOf(FruitType.ANANAS, FruitType.BANANE, FruitType.LITCHI, FruitType.KIWI);
                p = new Panier(list.size());
                p.setFruits(list);
                break;
            case AGRUME:
                list = FruitsFactory.createAllOf(FruitType.ORANGE, FruitType.CITRON);
                p = new Panier(list.size());
                p.setFruits(list);
                break;
            case SANSPEPINS:
                list = FruitsFactory.createAll();
                fe = new FruitsFilter(list);
                list = fe.filter(FilterType.NPEPINS).getResult();
                p = new Panier(list.size());
                p.setFruits(list);
                break;
            case AVECPEPINS:
                list = FruitsFactory.createAll();
                fe = new FruitsFilter(list);
                list = fe.filter(FilterType.PEPINS).getResult();
                p = new Panier(list.size());
                p.setFruits(list);
                break;
            default:
                list = FruitsFactory.createAll();
                p = new Panier(list.size());
                p.setFruits(list);
                break;
        }

        return p;
    }

}