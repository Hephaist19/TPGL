/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

/**
 *
 * @author jl336673
 */
public class Banane implements Fruit{
    
    private double prix;
    private String origine;

    public Banane() {
        setPrix(2.0);
        setOrigine("Costa Rica");
    }

    public Banane(double prix, String origine) {
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
            this.origine = "Costa Rica";
        }
        
    }

    @Override
    public String getName() {
        return "Banane";
    }

    @Override
    public boolean isSeedless() {  //predicat indiquant qu'une kiwi a des pepins
        return false;
    }

    @Override
    public String toString() {
        return "Banane de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Banane ba = (Banane) o;
            return (prix == ba.prix && origine.equals(ba.origine));
        }
        return false;
    }

    

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Banane(this.prix, this.origine);
    }
}
