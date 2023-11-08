
package fr.ufrsciencestech.controllers.factories;

import java.util.ArrayList;

import fr.ufrsciencestech.models.recettes.*;
import fr.ufrsciencestech.utils.RecetteType;

/**
 *
 * @author nj123548
 */
public class RecettesFactory {

    public static Recette createRecette(RecetteType type) {
        switch (type) {
            case JUSPOMME:
                return new JusPomme();
                    
            case BANANASPLIT:
                return new BananaSplit();
                    
            case CAKECITRON:
                return new CakeCitron();
    
            default: //TARTECERISE
                return new TarteCerise();
        }
    }

    /**
     * Crée une liste contenant toutes les recettes disponibles
     * @return ArrayList de Recette
     */
    public static ArrayList<Recette> createAll() {

        ArrayList<Recette> result = new ArrayList<>();

        for(RecetteType t : RecetteType.values()) {
            result.add(createRecette(t));
        }

        return result;
    }

    public static ArrayList<Recette> createAllOf(RecetteType... all) {
        ArrayList<Recette> result = new ArrayList<>();

        for(RecetteType ft : all) {
            result.add(createRecette(ft));
        }

        return result;
    }
}
