package fr.ufrsciencestech.controllers.factories;

import fr.ufrsciencestech.controllers.FilterExecutor;
import fr.ufrsciencestech.models.*;
import fr.ufrsciencestech.utils.*;
import fr.ufrsciencestech.models.fruits.Fruit;
import java.util.*;

public class PanierFactory {
     
    public static Panier createPanier(int contenance){
        return new Panier(contenance);
    }  
    
    public static Panier createPanier(PanierType type){
       
        Panier p;
        FilterExecutor fe;
        ArrayList<Fruit> list;
        
        switch(type){
            case EXOTIQUE :
                p = new Panier(5);
                list = FruitsFactory.createAllOf(FruitType.ANANAS,FruitType.BANANE,FruitType.LITCHI,FruitType.KIWI);
                p.setFruits(list);
                break;
            case AGRUME :
                p = new Panier(2);
                list = FruitsFactory.createAllOf(FruitType.ORANGE,FruitType.CITRON);
                p.setFruits(list);
                break;
            case SANSPEPINS :
                p = new Panier(5);
                list = FruitsFactory.createAll();
                fe = new FilterExecutor(list);
                list = fe.filter(FilterType.SANSPEPINS).getResult();
                p.setFruits(list);
                break;
            case AVECPEPINS :
                p = new Panier(5);
                list = FruitsFactory.createAll();
                fe = new FilterExecutor(list);
                list = fe.filter(FilterType.AVECPEPINS).getResult();
                p.setFruits(list);
                break;
            default:
                p = new Panier(2);
                list = FruitsFactory.createAll();
                p.setFruits(list);
                break;
        }
        
        return p;
    }
    
}