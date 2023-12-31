/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

/**
 *
 * @author jl336673
 */
public class Citron implements Fruit{
    
    private double prix;
    private String origine;

    public Citron() {
        setPrix(1.99);
        setOrigine("Espagne");
    }

    public Citron(double prix, String origine) {
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
    public String getName() {
        return "Citron";
    }

    @Override
    public String toString() {
        return "Citron de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  
        if (o != null && getClass() == o.getClass()) {
            Citron ci = (Citron) o;
            return (prix == ci.prix && origine.equals(ci.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() { 
        return true;
    }
    
    @Override
    public boolean isExotique() { 
        return false;
    }
    
    @Override
    public boolean isAgrume(){
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Citron(this.prix, this.origine);
    }
}
