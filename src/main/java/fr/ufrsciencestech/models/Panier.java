package fr.ufrsciencestech.models;

import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.exceptions.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;

public class Panier{
    
    PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    private ArrayList<Fruit> fruits = new ArrayList<>();  //attribut pour stocker les fruits
    private int contenanceMax = 10;        //nb maximum d'oranges que peut contenir le panier
    
    public Panier(int contenanceMax) {  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        this.contenanceMax = contenanceMax;
    }
    
    //Ajouter un listener pour les modifications du contenu du panier
    public void addObserver(PropertyChangeListener l){
        pcs.addPropertyChangeListener(l);
    }
    
        //Modificateurs pouvant émettre une notification\\
    
    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
        ArrayList<Fruit> old = this.fruits;
        this.fruits = fruits;
        //Emission de l'évênement de modification
        pcs.firePropertyChange("fruits", old, this.fruits);
    }
    
    public void ajout(Fruit o) throws PanierPleinException {  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
        if (fruits.size() < contenanceMax) {
            ArrayList<Fruit> old = this.fruits;
            fruits.add(o);
            pcs.firePropertyChange("fruits", old, this.fruits);
        } else {
            throw new PanierPleinException();
        }
    }

    public void retrait() throws PanierVideException { //retire le dernier fruit du panier si celui-ci n'est pas vide
        if (!fruits.isEmpty()) {
            ArrayList<Fruit> old = this.fruits;
            fruits.remove(fruits.size() - 1);
            pcs.firePropertyChange("fruits", old, this.fruits);
        } else {
            throw new PanierVideException();
        }
    }
    
    public void boycotteOrigine(String origine) {  //supprime du panier tous les fruits provenant du pays origine
        int nbModification = 0;
        ArrayList<Fruit> old = this.fruits;
        for (int i=0 ;i<this.contenanceMax;i++) {
            if(this.fruits.get(i).getOrigine().equals(origine)){
                this.fruits.remove(i);
                nbModification++;
            }
        }
        
        if(nbModification > 0)
            pcs.firePropertyChange("fruits", old, this.fruits);
    }
    
    public void setFruit(int i, Fruit f) {  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        if(this.fruits.size() > i)
        {
            ArrayList<Fruit> old = this.fruits;
            fruits.set(i, f);
            pcs.firePropertyChange("fruits", old, this.fruits);
        }
    }
    
        //-----------------------------------------------\\
    
    @Override
    public String toString() {  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        StringBuilder sb = new StringBuilder();
        sb.append("Taille: ").append(fruits.size());
        for(Fruit f: fruits)
            sb.append(f.toString());
        return sb.toString();
    }

    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
        return this.fruits;
    }

    public int getTaillePanier() {  //Accesseur retournant le nombre de fruit dans la panier
        return this.fruits.size();
    }

    public int getContenanceMax() {  //accesseur du second attribut
        return contenanceMax;
    }

    public Fruit getFruit(int index) {  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
        return this.fruits.get(index);
    }

    public boolean estVide() {  //predicat indiquant que le panier est vide
        return this.fruits.isEmpty();
    }

    public boolean estPlein() {  //predicat indiquant que le panier est plein
        return this.fruits.size() == this.contenanceMax;
    }

    public double getPrix() {  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
        double sum = 0;
        for (Fruit f : this.fruits) {
            sum += f.getPrix();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        if(o instanceof Panier){
            Panier p = (Panier) o;
            //Comparaison préliminaire
            if(this.contenanceMax != ((Panier)(o)).contenanceMax) return false;
            else {
                //On regarde si les deux panier ont les même fruits, indépendemment de l'ordre, et en conservant la cardinalité des différents fruits
                ArrayList<Fruit> tmp = this.getFruits();
                for(Fruit f : p.getFruits())
                    //Si on a pas pu enlever le fruit, c'est que les deux panier sont différents
                    if(!this.getFruits().remove(f)) return false;
            }
        }
        return true;
    }
}
