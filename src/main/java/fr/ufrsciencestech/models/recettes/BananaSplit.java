package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.fruits.*;
import fr.ufrsciencestech.utils.FruitType;

public class BananaSplit implements Recette {
    
    final private String name;
    final private ArrayList<Fruit> listeFruit;
    

    public BananaSplit() {
        name = "Banana Split";
        listeFruit = FruitsFactory.createAllOf(FruitType.BANANE, FruitType.BANANE, FruitType.CERISE);
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
        StringBuilder sb = new StringBuilder("Ingrédients:").append("\n");

        for (Fruit fruit : getFruits()) {
            sb.append(fruit.getName()).append(" ");
        }
        
        return sb.toString();
    }
    
    @Override
    public String getEtapes() {
        StringBuilder sb = new StringBuilder("Étapes :").append("\n");

        sb.append("Allonger les deux bananes dans un plat, placer vos boules de glaces puis napper de chocolat fondu.\n Ajouter de la chantilly et la cerise sur le gâteau !");
        return sb.toString();
    }

}
