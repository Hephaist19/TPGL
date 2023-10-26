
package fr.ufrsciencestech.controllers.factories;

import fr.ufrsciencestech.models.*;

public class PanierFactory {
     
    public void PanierFactory(){
        
    }
    
    public Panier createPanier(int contenance){
        return new Panier(contenance);
    }
}