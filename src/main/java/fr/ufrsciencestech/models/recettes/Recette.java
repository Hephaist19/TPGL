package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.models.fruits.Fruit;

public interface Recette {
    
    /**
     * Renvoie le nom de la recette
     * @return
     */
    public String getName();

    /**
     * Renvoie la liste des fruit associé à la recette
     * @return
     */
    public ArrayList<Fruit> getIngredients();

    public String getDescription();
}
