
package fr.ufrsciencestech.controllers.factories;

import fr.ufrsciencestech.models.*;

public class PanierFactory {
     
    public static Panier createPanier(int contenance){
        return new Panier(contenance);
    }
}