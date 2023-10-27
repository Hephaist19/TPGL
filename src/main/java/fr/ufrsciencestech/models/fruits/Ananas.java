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
        
        setPrix(prix);  //une solution possible pour interdire les prix negatifs


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
    
    @Override
    public void setPrix(double prix) {
        if(prix < 0)
            this.prix = -prix;
        else
            this.prix = prix;
        
    }

    @Override
    public String getOrigine() {
        return origine;
    }
    
    @Override
    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Ananas de " + origine + " à " + prix + " euros";
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
