package fr.ufrsciencestech.models.recettes;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.fruits.*;
import fr.ufrsciencestech.utils.FruitType;

import java.util.ArrayList;


public class CakeCitron implements Recette {

    final private String name;
    final private  ArrayList<Fruit> listeFruit;

    public CakeCitron() {
        name = "Cake au citron";
        listeFruit = FruitsFactory.createAllOf(FruitType.CITRON, FruitType.CITRON, FruitType.CITRON);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Fruit> getFruits() {
        return listeFruit;
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

        sb.append("Préchauffer le four à 180°C puis beurrer et fariner votre moule. "
                + "Faites fondre 100g de beurre et laver vos jolis citrons. \n"
                + "Couper le citron en deux et presser-le pour en recueillir le jus. ");
        
         sb.append("\n");
        
         sb.append("Mélanger 200g farine, 150g de sucre et 1/2 sachet de levure. \n"
                 + "Ajouter les 4 œufs un à un, puis le beurre fondu et enfin le zeste râpé et le jus du citron. \n"
                 + "Verser dans le moule et enfourner le tout pendant environ 40min. À déguster chaudement !");
        
         sb.append("\n");
        
        return sb.toString();
    }
}
