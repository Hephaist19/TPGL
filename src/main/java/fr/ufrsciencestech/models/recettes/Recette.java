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
     * Renvoie le prix de la recette
     * @return
     */
    public double getPrix();

    /**
     * Renvoie la liste des fruit associé à la recette
     * @return
     */
    public ArrayList<Fruit> getFruits();

    /**
     * Renvoie les ingrédients de la recette sous format String
     * @return
     */
    public String getDescription();
    
    /**
     * Renvoie les étapes de la recette sous format String
     * @return
     */
    public String getEtapes();
}
