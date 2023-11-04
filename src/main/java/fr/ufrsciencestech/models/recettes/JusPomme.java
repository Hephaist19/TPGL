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
    private ArrayList<Fruit> listeFruit = new ArrayList<>();

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
        if(listeFruit!=null)
        {listeFruit.clear();}
        listeFruit.add(p1);
        listeFruit.add(p2);
        listeFruit.add(p3);
        listeFruit.add(p4);
        return listeFruit;
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder("Ingredients:").append("\n");

        for (Fruit fruit : getFruits()) {
            sb.append(fruit.getName()).append(" ");
        }

        return sb.toString();
    }
    
    @Override
    public String getEtapes() {
        StringBuilder sb = new StringBuilder("Étapes :").append("\n");

        sb.append("Découpez votre kilo de pommes en morceaux et ajoutez 5 cuillère à soupe de sucre semoule. \n"
                + "Versez 80cL d'eau et mixez le tout. Bonne dégustation !");
        
        sb.append("\n");
        
        return sb.toString();
    }
}
