package fr.ufrsciencestech.models.fruits;

public class Orange implements Fruit {

    private double prix;
    private String origine;

    public Orange() {
        setPrix(0.99);
        setOrigine("Espagne");;
    }

    public Orange(double prix, String origine) {
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
    public String getName() {
        return "Orange";
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
        return "Orange de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Orange(this.prix, this.origine);
    }
}
