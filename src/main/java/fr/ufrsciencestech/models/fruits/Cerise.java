/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

/**
 *
 * @author jl336673
 */
public class Cerise implements Fruit {
    
    private double prix;
    private String origine;

    public Cerise() {
        setPrix(11.99);
        setOrigine("France");
    }

    public Cerise(double prix, String origine) {
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
        return "Cerise";
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
        return "Cerise de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  
        if (o != null && getClass() == o.getClass()) {
            Cerise ce = (Cerise) o;
            return (prix == ce.prix && origine.equals(ce.origine));
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
        return new Cerise(this.prix, this.origine);
    }
}
