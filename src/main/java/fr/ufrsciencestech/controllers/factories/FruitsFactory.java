
package fr.ufrsciencestech.controllers.factories;

import java.util.ArrayList;

import fr.ufrsciencestech.models.fruits.*;

enum FruitType {
    ANANAS,
    BANANE,
    CERISE,
    CITRON,
    FRAISE,
    FRAMBOISE,
    KIWI,
    LITCHI,
    ORANGE,
    PECHE,
    POMME
}

/**
 *
 * @author nj123548
 */
public class FruitsFactory {

    public static Fruit createFruit(FruitType type) {
        switch (type) {
            case ANANAS:
                return new Ananas();
            case BANANE:
                return new Banane();
            case CERISE:
                return new Cerise();
            case CITRON:
                return new Citron();
            case FRAISE:
                return new Fraise();
            case FRAMBOISE:
                return new Framboise();
            case KIWI:
                return new Kiwi();
            case LITCHI:
                return new Litchi();
            case ORANGE:
                return new Orange();
            case PECHE:
                return new Peche();
            case POMME:
                return new Pomme();
            default: //normalement ce cas ne se déclanchera jamais car nous utilisons une enumeration pour lister tous les fruits disponible
                return null;
        }
    }

    public static Fruit createFruit(FruitType type, double prix, String origine) {
        switch (type) {
            case ANANAS:
                return new Ananas(prix, origine);
            case BANANE:
                return new Banane(prix, origine);
            case CERISE:
                return new Cerise(prix, origine);
            case CITRON:
                return new Citron(prix, origine);
            case FRAISE:
                return new Fraise(prix, origine);
            case FRAMBOISE:
                return new Framboise(prix, origine);
            case KIWI:
                return new Kiwi(prix, origine);
            case LITCHI:
                return new Litchi(prix, origine);
            case ORANGE:
                return new Orange(prix, origine);
            case PECHE:
                return new Peche(prix, origine);
            case POMME:
                return new Pomme(prix, origine);
            default: //normalement ce cas ne se déclanchera jamais car nous utilisons une enumeration pour lister tous les fruits disponible
                return null;
        }
    }

    /**
     * Crée une liste contenant tous les fruits disponible
     * @return ArrayList de Fruit
     */
    public static ArrayList<Fruit> createAll() {

        ArrayList<Fruit> result = new ArrayList<>();

        for(FruitType t : FruitType.values()) {
            result.add(createFruit(t));
        }

        return result;
    }
}
