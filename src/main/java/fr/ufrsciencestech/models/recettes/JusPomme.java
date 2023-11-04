package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.models.fruits.*;
import java.util.Arrays;

public class JusPomme implements Recette {

    private String name;
    private Pomme p1 = new Pomme();
    private Pomme p2 = new Pomme(); 
    private Pomme p3 = new Pomme(); 
    private Pomme p4 = new Pomme();
    private ArrayList<Fruit> listeFruit;

    @Override
    public String getName() {
        return "Jus de pomme";
    }
    
    @Override
    public double getPrix() {
        Pomme p = new Pomme();
        return 4*p.getPrix();
    }

    @Override
    public ArrayList<Fruit> getFruits() {
        listeFruit.clear();
        listeFruit.add(p1);
        listeFruit.add(p2);
        listeFruit.add(p3);
        listeFruit.add(p4);
        return listeFruit;
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder("Ingredients:").append("\n");

        for (Fruit fruit : listeFruit) {
            sb.append(fruit.getName()).append("\n");
        }

        return sb.toString();
    }
}
