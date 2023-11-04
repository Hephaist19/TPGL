package fr.ufrsciencestech.models.fruits;

public class Ananas implements Fruit {

    private double prix;
    private String origine;

    public Ananas() {
        super();
        setPrix(3.5);
        setOrigine("Brésil");
    }

    public Ananas(double prix, String origine) {
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
            this.origine = "Brésil";
        }
        
    }

    @Override
    public String getName() {
        return "Ananas";
    }
    
    @Override
    public boolean isSeedless() {
        return true;
    }
    
    @Override
    public boolean isExotique() { 
        return true;
    }
    
    @Override
    public boolean isAgrume(){
        return false;
    }

    @Override
    public String toString() {
        return "Ananas de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && getClass() == o.getClass()) {
            Ananas or = (Ananas) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Ananas(this.prix, this.origine);
    }
}
