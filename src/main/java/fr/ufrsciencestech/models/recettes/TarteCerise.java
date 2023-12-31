package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.fruits.*;
import fr.ufrsciencestech.utils.FruitType;

public class TarteCerise implements Recette {

    final private String name;
    final private ArrayList<Fruit> listeFruit;

    public TarteCerise() {
        name = "Tarte aux cerises";
        listeFruit = FruitsFactory.createAllOf(FruitType.CERISE, FruitType.CERISE);
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

        sb.append("Dans un saladier, versez 250g de farine avec une pincée sel et creusez un puits. Ajoutez 100g de beurre coupé en dés, et mélangez du bout des doigts. \n"
                + "Versez petit à petit le demi verre d'eau. Arrêtez vous avant que la pâte ne soit collante surtout ! \n"
                + "Formez une boule avec la pâte obtenue, et placez là au réfrigérateur au moins 30 minutes. "
                + "Mélangez 2 œufs avec 60g de cassonade, et ajoutez 15cL de crème fraîche. Réservez. \n"
                + "Étalez la pâte brisée sur un plan de travail fariné, et garnissez en votre cercle à tarte (Déjà disposez sur une plaque de four, recouverte de papier sulfurisé ! \n) "
                + "Disposez les cerises sur la pâte, versez l'appareil à crème au dessus. Enfournez à 180°C pendant 30 minutes. Bon courage !");
        
        sb.append("\n");
        return sb.toString();
    }
}
