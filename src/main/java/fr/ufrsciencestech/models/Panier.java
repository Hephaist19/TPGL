package fr.ufrsciencestech.models;

import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.exceptions.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;

public class Panier {

    final private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private ArrayList<Fruit> fruits = new ArrayList<>();  //attribut pour stocker les fruits
    private int contenanceMax = 10;        //nb maximum d'oranges que peut contenir le panier

    /**
     * Construit un panier vide ayant une certaine contenance maximale
     * @param contenanceMax int
     */
    public Panier(int contenanceMax) {  
        this.contenanceMax = contenanceMax;
    }

    /**
     * Ajouter un listener pour les modifications du contenu du panier
     * @param l PropertyChangeListener à attacher
     */
    public void addObserver(PropertyChangeListener l) {
        pcs.addPropertyChangeListener("fruits", l);
    }
    
    /**
     * Supprime un listener associé au modification du Panier
     * @param l PropertyChangeListener
     */
    public void removeObserver(PropertyChangeListener l) {
        pcs.removePropertyChangeListener("fruits", l);
    }
    
    /**
     * Getter de l'attribut PropertyChangeSupport du Panier
     * @return l'instance de PropertyChangeSupport associé au Panier
     */
    public PropertyChangeSupport getPropertyChangeSupport() {
        return this.pcs;
    }

    /// Tous les modificateurs pouvant émettrent une notification \\\


    /**
     * Set la liste de fruit associé au Panier
     * @param fruits ArrayList<<>Fruit>
     */
    public void setFruits(ArrayList<Fruit> fruits) {
        int oldsize = this.fruits.size();
        this.fruits = fruits;
        //Emission de l'évênement de modification à tous les listeners
        pcs.firePropertyChange("fruits", oldsize, this.fruits.size());
    }

    /**
     * Ajoute un fruit dans le panier
     * @param o Fruit à ajouter
     * @throws PanierPleinException Si le panier est plein avant ajout du fruit
     */
    public void ajout(Fruit o) throws PanierPleinException {
        if (fruits.size() < contenanceMax) {
            int oldsize = this.fruits.size();
            fruits.add(o);
            pcs.firePropertyChange("fruits", oldsize, this.fruits.size());
        } else {
            throw new PanierPleinException();
        }
    }

    /**
     * Ajoute une liste entière de fruits au panier
     * @param liste
     * @throws PanierPleinException si le panier est plein
     */
    public void ajouterTout(ArrayList<Fruit> liste) throws PanierPleinException {
        int oldsize = this.fruits.size();
        for(Fruit f : liste) {
            try {
                ajout(f);
            } catch (PanierPleinException e) {
                throw new PanierPleinException();
            } finally {
                //On emet quand même le signal après capture de l'erreur au niveau plus haut
                pcs.firePropertyChange("fruits", oldsize, this.fruits.size());
            }
        }
    }

    /**
     * Vide entièrement le panier
     */
    public void vider() {
        int oldsize = this.fruits.size();
        this.fruits.clear();
        pcs.firePropertyChange("fruits", oldsize, fruits.size());
    }

    /**
     * Retire le dernier fruit du panier si celui-ci n'est pas vide
     * @throws PanierVideException Si le panier est vide avant de retirer le fruit
     */
    public void retrait() throws PanierVideException {
        if (!fruits.isEmpty()) {
            int oldsize = this.fruits.size();
            fruits.remove(fruits.size() - 1);
            pcs.firePropertyChange("fruits", oldsize, this.fruits.size());
        } else {
            throw new PanierVideException();
        }
    }

    public void retirer(int indice) {
        if(!(indice < 0 || indice > fruits.size())) {
            int oldsize = this.fruits.size();
            fruits.remove(indice);
            pcs.firePropertyChange("fruits", oldsize, this.fruits.size());
        }
    }

    /**
     * Supprime du panier tous les fruits provenant du pays origine
     * @param origine Le pays d'origine à boycotter 
     */
    public void boycotteOrigine(String origine) {
        int nbModification = 0;
        int oldsize = this.fruits.size();
        for (int i = 0; i < this.fruits.size(); i++) {
            if (this.fruits.get(i).getOrigine().equals(origine)) {
                this.fruits.remove(i);
                i--;
                nbModification++;
            }
        }

        if (nbModification > 0) {
            pcs.firePropertyChange("fruits", oldsize, this.fruits.size());
        }
    }

    /**
     * Modifie le fruit contenu dans le panier à l'emplacement i par f.
     * S'il n'y a pas de fruit à cet emplacement, rien ne se passe.
     * @param i L'index du fruit à remplacer
     * @param f Le fruit à remplacer
     */
    public void setFruit(int i, Fruit f) {
        if (i >= 0 && this.fruits.size() > i) {
            int oldsize = this.fruits.size();
            fruits.set(i, f);
            pcs.firePropertyChange("fruits", oldsize, this.fruits.size());
        }
    }

    /// ----------------------------------------------- \\\
    
    @Override
    public String toString() {  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        StringBuilder sb = new StringBuilder();
        sb.append("Taille: ").append(fruits.size()).append(System.getProperty("line.separator"));
        for (Fruit f : fruits) {
            sb.append(f.toString()).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }

    /**
     * Renvoie la liste des fruits du panier dans une 
     * @return ArrayList<Fruit>
     */
    public ArrayList<Fruit> getFruits() {  //
        return this.fruits;
    }

    /**
     * Accesseur retournant le nombre de fruit dans la panier
     * @return le nombre de fruit dans le panier
     */
    public int getTaillePanier() {
        return this.fruits.size();
    }

    /**
     * La taille maximale du panier
     * @return La nombre maximum de fruit que le panier peut contenir
     */
    public int getContenanceMax() {
        return contenanceMax;
    }

    /**
     * Accesseur retournant le fruit contenu dans le panier a l'emplacement i ou null s'il n'y a rien a cet emplacement
     * @param index Indice du fruit du panier à récupérer
     * @return 
     */
    public Fruit getFruit(int index) {
        if(index < 0 || index > this.fruits.size()) {
            return null;
        }
        return this.fruits.get(index);
    }

    /**
     * @return si le panier est vide
     */
    public boolean estVide() {  //
        return this.fruits.isEmpty();
    }

    /**
     * @return Si le panier est plein
     */
    public boolean estPlein() {  //
        return this.fruits.size() == this.contenanceMax;
    }

    /**
     * @return La veleur total du contenu du panier
     */
    public double getPrix() {
        double sum = 0;
        for (Fruit f : this.fruits) {
            sum += f.getPrix();
        }
        return sum;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Panier copie = new Panier(this.contenanceMax);
        //Un clone d'une arrayList est un shallow copie (copie les reférences, et non les instances)
        //On va donc le faire à la main
        for(Fruit f : this.fruits) {
            try {
                copie.ajout((Fruit) f.clone());
            } catch (PanierPleinException e) {
                System.err.println("Le panier this possède plus de fruit que le permet ContenanceMax!");
                throw new CloneNotSupportedException();
            }
        }
        return copie;
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        if (o instanceof Panier) {
            Panier p = (Panier) o;
            //Comparaison préliminaire
            if (this.contenanceMax != p.contenanceMax) {
                return false;
            } else {
                //S'ils n'ont pas le même nombre de fruit, forcément différent
                if(p.getTaillePanier() != this.getTaillePanier()) {
                    return false;
                }

                //On regarde si les deux panier ont les même fruits, indépendemment de l'ordre, et en conservant la cardinalité des différents fruits
                //On copie tous les fruits dans une liste
                ArrayList<Fruit> copie = new ArrayList<>();
                for (Fruit fruit : p.fruits) {
                    copie.add(fruit);
                }
                
                //Pour chaque fruit contenu dans le panier this
                for (Fruit fruit : this.getFruits()) {
                    //Si on a pas pu enlever le fruit dans la copie, c'est que les deux panier sont différents
                    if (!copie.remove(fruit)) {
                        return false;
                    }
                }
            }
            //Ils sont égaux
            return true;
        }
        return false;
    }
}
