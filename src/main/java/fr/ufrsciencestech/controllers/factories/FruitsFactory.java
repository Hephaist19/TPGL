
package fr.ufrsciencestech.controllers.factories;

import fr.ufrsciencestech.models.fruits.*;

enum FruitType {
    ANANAS,
    FRAMBOISE,
    KIWI,
    ORANGE,
    POMME
}

/**
 *
 * @author nj123548
 */
public class FruitsFactory {
    
    public void FruitsFactory(){
        
    }

    Fruit createFruit(FruitType type) {
        switch (type) {
            case ANANAS:
                return new Ananas();
            case FRAMBOISE:
                return new Framboise();
            case KIWI:
                return new Kiwi();
            case ORANGE:
                return new Orange();
            case POMME:
                return new Pomme();
            default: //normalement ce cas ne se déclanchera jamais car nous utilisons une enumeration pour lister tous les fruits disponible
                return null;
        }
    }

    Fruit createFruit(FruitType type, double prix, String origine) {
        switch (type) {
            case ANANAS:
                return new Ananas(prix, origine);
            case FRAMBOISE:
                return new Framboise(prix, origine);
            case KIWI:
                return new Kiwi(prix, origine);
            case ORANGE:
                return new Orange(prix, origine);
            case POMME:
                return new Pomme(prix, origine);
            default: //normalement ce cas ne se déclanchera jamais car nous utilisons une enumeration pour lister tous les fruits disponible
                return null;
        }
    }
}
