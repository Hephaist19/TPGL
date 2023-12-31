package fr.ufrsciencestech.models.fruits;

public class Pomme implements Fruit {

    private double prix;
    private String origine;

    public Pomme() {
        setPrix(2.69);
        setOrigine("France");
    }

    public Pomme(double prix, String origine) {
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
        return "Pomme";
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
            this.origine = "France";
        }
        
    }

    @Override
    public String toString() {
        return "Pomme de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Pomme or = (Pomme) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() { 
        return false;
    }
    
    @Override
    public boolean isExotique() { 
        return false;
    }
    
    @Override
    public boolean isAgrume(){
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Pomme(this.prix, this.origine);
    }
}
