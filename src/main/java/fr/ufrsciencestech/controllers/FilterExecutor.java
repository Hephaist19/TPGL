package fr.ufrsciencestech.controllers;

import java.util.ArrayList;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.utils.FilterType;
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
        deepCopie(fruits);
    }

    public ArrayList<Fruit> getResult() {
        return liste;
    }

    private void deepCopie(ArrayList<Fruit> toCopie) {
        liste = new ArrayList<>();

        for(Fruit f : toCopie) {
            liste.add(f);
        }
    }

    /**
     * tri la liste des fruits par le type de tri spécifié.
     * @param type
     * @return
     */
    public FilterExecutor sort(SortType type) {

        Fruit tmp;
        //Tri à bulle classique
        switch (type) {
            case ALPHABETIQUE:
                for(int i = liste.size() - 1; i >= 0; i--) {
                    for(int j = 0; j < i; j++) {
                        if(liste.get(j).getName().compareTo(liste.get(j+1).getName()) > 0) {
                            //On échange les deux fruit
                            tmp = liste.get(j);

                            liste.set(j, liste.get(j+1));
                            liste.set(j+1, tmp);
                        }
                    }
                }
                break;
            case ANTIALPHABETIQUE:
                for(int i = liste.size() - 1; i >= 0; i--) {
                    for(int j = 0; j < i; j++) {
                        if(liste.get(j).getName().compareTo(liste.get(j+1).getName()) < 0) {
                            //On échange les deux fruit
                            tmp = liste.get(j);

                            liste.set(j, liste.get(j+1));
                            liste.set(j+1, tmp);
                        }
                    }
                }
                break;
            case PRIXCROISSANT:
                for(int i = liste.size() - 1; i >= 0; i--) {
                    for(int j = 0; j < i; j++) {
                        if(liste.get(j).getPrix() > liste.get(j+1).getPrix()) {
                            //On échange les deux fruit
                            tmp = liste.get(j);

                            liste.set(j, liste.get(j+1));
                            liste.set(j+1, tmp);
                        }
                    }
                }
                break;
            case PRIXDECROISSANT:
                for(int i = liste.size() - 1; i >= 0; i--) {
                    for(int j = 0; j < i; j++) {
                        if(liste.get(j).getPrix() < liste.get(j+1).getPrix()) {
                            //On échange les deux fruit
                            tmp = liste.get(j);

                            liste.set(j, liste.get(j+1));
                            liste.set(j+1, tmp);
                        }
                    }
                }
                break;
            default: //AUCUN
                return this;
        }
        return this;
    }

    /**
     * Filtre la liste de fruit en fonction du filtre spécifié
     * @param type Type de filtre
     * @return FilterExecutor instance
     */
    public FilterExecutor filter(FilterType type) {
        switch (type) {
            case SANSPEPINS:
                for (int i = 0; i < liste.size(); i++) {
                    //On enlève tous les fruit avec pépins
                    if(!liste.get(i).isSeedless()) {
                        liste.remove(i);
                        i--;
                    }
                }
                break;
            case AVECPEPINS:
                for (int i = 0; i < liste.size(); i++) {
                    //On enlève tous les fruit sans pépins
                    if(liste.get(i).isSeedless()) {
                        liste.remove(i);
                        i--;
                    }
                }
                break;
            default:
            return this;
        }
        return this;
    }

    
}
