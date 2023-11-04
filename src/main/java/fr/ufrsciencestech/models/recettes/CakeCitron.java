package fr.ufrsciencestech.models.recettes;

import fr.ufrsciencestech.models.fruits.*;
import java.util.ArrayList;


public class CakeCitron implements Recette {

    private String name;
    private ArrayList<Fruit> listeFruit;
    private Citron ci1 = new Citron();
    private Citron ci2 = new Citron();
    private Citron ci3 = new Citron();
    
    @Override
    public String getName() {
        return "Cake au citron";
    }

    @Override
    public ArrayList<Fruit> getFruits() {
        listeFruit.clear();
        listeFruit.add(ci1);
        listeFruit.add(ci2);
        listeFruit.add(ci3);
        return listeFruit;
    }
    
    @Override
    public double getPrix() {
        Citron c = new Citron();
        return 3*c.getPrix();
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
