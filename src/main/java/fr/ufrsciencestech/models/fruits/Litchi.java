/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

/**
 *
 * @author jl336673
 */
public class Litchi implements Fruit {
    
    private double prix;
    private String origine;

    public Litchi() {
        setPrix(3.99);
        setOrigine("Madagascar");
    }

    public Litchi(double prix, String origine) {
        setPrix(prix);
        setOrigine(origine);
    }

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

    public String getOrigine() {
        return origine;
    }

    @Override
    public String getName() {
        return "Litchi";
    }

    @Override
    public void setOrigine(String origine) {
        
        if(origine != "") {
            this.origine = origine;
        }
        else {
            this.origine = "Madagascar";
        }
        
    }

    @Override
    public String toString() {
        return "Litchi de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Litchi li = (Litchi) o;
            return (prix == li.prix && origine.equals(li.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() {
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Litchi(this.prix, this.origine);
    }
}
