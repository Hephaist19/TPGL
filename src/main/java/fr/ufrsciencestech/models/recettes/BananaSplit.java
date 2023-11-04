package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.models.fruits.*;

public class BananaSplit implements Recette {
    
    private String name;
    private ArrayList<Fruit> listeFruit;
    
    private Banane b1 = new Banane();
    private Banane b2 = new Banane();
    private Cerise c3 = new Cerise();
   
    
    @Override
    public String getName() {
        return "Banana split";
    }

    @Override
    public double getPrix() {
        Banane b = new Banane();
        Cerise c = new Cerise();
        return 2*b.getPrix()+1*c.getPrix();
    }
    
    @Override
    public ArrayList<Fruit> getFruits() {
        listeFruit.clear();
        listeFruit.add(b1);
        listeFruit.add(b2);
        listeFruit.add(c3);
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
