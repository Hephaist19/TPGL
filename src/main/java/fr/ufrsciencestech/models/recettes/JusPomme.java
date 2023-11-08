package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.fruits.*;
import fr.ufrsciencestech.utils.FruitType;

public class JusPomme implements Recette {

    final private String name;
    final private ArrayList<Fruit> listeFruit;

    public JusPomme() {
        name = "Jus de pomme";
        listeFruit = FruitsFactory.createAllOf(FruitType.POMME, FruitType.POMME, FruitType.POMME, FruitType.POMME);
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrix() {
        double prix = 0;
        for(Fruit f : listeFruit){
            prix += f.getPrix();
        }
        return prix;
    }

    @Override
    public ArrayList<Fruit> getFruits() {
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
