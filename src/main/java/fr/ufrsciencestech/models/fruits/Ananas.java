package fr.ufrsciencestech.models.fruits;

public class Ananas implements Fruit {

    private double prix;
    private String origine;

    public Ananas() {
        super();
        this.prix = 0.5;  //prix en euros
        this.origine = "Espagne";
    }

    public Ananas(double prix, String origine) {
        if (prix < 0) {
            this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        } else {
            this.prix = prix;
        }

        if (origine.equals("")) {
            this.origine = "Espagne";  //Espagne par défaut
        } else {
            this.origine = origine;
        }
    }

    @Override
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Ananas de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Ananas or = (Ananas) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return true;
    }
}
