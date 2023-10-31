package fr.ufrsciencestech.models.fruits;

public class Framboise implements Fruit {

    private double prix;
    private String origine;

    public Framboise() {
        this.prix = 0.5;  //prix en euros
        this.origine = "Espagne";
    }

    public Framboise(double prix, String origine) {
        setPrix(prix);
        setOrigine(origine);
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
        
        if(origine != "") {
            this.origine = origine;
        }
        else {
            this.origine = "Espagne";
        }
        
    }

    @Override
    public String toString() {
        return "Framboise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Framboise fr = (Framboise) o;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Framboise(this.prix, this.origine);
    }
}
