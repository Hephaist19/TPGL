package fr.ufrsciencestech.controllers;

import java.util.ArrayList;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.utils.Filtertype;
import fr.ufrsciencestech.utils.SortType;

public class FilterExecutor {

    private ArrayList<Fruit> liste;

    /**
     * Constructeur pas defaut (Tous les fruits)
     */
    public FilterExecutor() {
        this.liste = FruitsFactory.createAll();
    }

    /**
     * Constructeur standard
     * @param fruits Liste de fruit 
     */
    public FilterExecutor(ArrayList<Fruit> fruits) {
        this.liste = fruits;
    }

    /**
     * tri la liste des fruits par le type de tri spécifié.
     * @param type
     * @return
     */
    public FilterExecutor sort(SortType type) {

        Fruit tmp;
        switch (type) {
            case ALPHABETIQUE:
                for(int i = 0; i < liste.size(); i++) {
                    for(int j = i+1; i < liste.size(); i++) {
                        if(liste.get(i).getName().compareTo(liste.get(j).getName()) > 0) {
                            //On échange les deux fruit
                            tmp = liste.get(i);

                            liste.set(i, liste.get(j));
                            liste.set(j, tmp);
                        }
                    }
                }
                break;
            case ANTIALPHABETIQUE:
                for(int i = 0; i < liste.size(); i++) {
                    for(int j = i+1; i < liste.size(); i++) {
                        if(liste.get(i).getName().compareTo(liste.get(j).getName()) < 0) {
                            //On échange les deux fruit
                            tmp = liste.get(i);

                            liste.set(i, liste.get(j));
                            liste.set(j, tmp);
                        }
                    }
                }
                break;
            case PRIXCROISSANT:
                for(int i = 0; i < liste.size(); i++) {
                    for(int j = i+1; i < liste.size(); i++) {
                        if(liste.get(i).getPrix() > liste.get(j).getPrix()) {
                            //On échange les deux fruit
                            tmp = liste.get(i);

                            liste.set(i, liste.get(j));
                            liste.set(j, tmp);
                        }
                    }
                }
                break;
            case PRIXDECROISSANT:
                for(int i = 0; i < liste.size(); i++) {
                    for(int j = i+1; i < liste.size(); i++) {
                        if(liste.get(i).getPrix() < liste.get(j).getPrix()) {
                            //On échange les deux fruit
                            tmp = liste.get(i);

                            liste.set(i, liste.get(j));
                            liste.set(j, tmp);
                        }
                    }
                }
                break;
            default:
                break;
        }
        return this;
    }

    /**
     * Filtre la liste de fruit en fonction du filtre spécifié
     * @param type Type de filtre
     * @return FilterExecutor instance
     */
    public FilterExecutor filter(Filtertype type) {
        switch (type) {
            case SANSPEPINS:
                for (int i = 0; i < liste.size(); i++) {
                    if(!liste.get(i).isSeedless()) liste.remove(i);
                }
                break;

            case AVECPEPINS:
                for (int i = 0; i < liste.size(); i++) {
                    if(liste.get(i).isSeedless()) liste.remove(i);
                }
                break;
            default:
                break;
        }
        return this;
    }

    public ArrayList<Fruit> getResult() {
        return liste;
    }
}
