package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.models.fruits.Fruit;

public class Jus implements Recette {

    private String name;
    private ArrayList<Fruit> listeFruit;
    private ArrayList<String> listeAutre;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Fruit> getFruits() {
        return listeFruit;
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder("Ingredients:").append("\n");

        for (Fruit fruit : listeFruit) {
            sb.append(fruit.getName()).append("\n");
        }

        for (String string : listeAutre) {
            sb.append(string).append("\n");
        }

        return sb.toString();
    }
}
