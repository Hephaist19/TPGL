package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.models.fruits.*;

public class TarteCerise implements Recette {

    private String name;
    private ArrayList<Fruit> listeFruit;
    private Cerise c1 = new Cerise();
    private Cerise c2 = new Cerise();

    
    @Override
    public String getName() {
        return "Tarte aux cerises";
    }

    @Override
    public ArrayList<Fruit> getFruits() {
        listeFruit.clear();
        listeFruit.add(c1);
        listeFruit.add(c2);
        return listeFruit;
    }
    
    @Override
    public double getPrix() {
        Cerise c = new Cerise();
        return 2*c.getPrix();
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
