/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

/**
 *
 * @author jl336673
 */
public class Fraise implements Fruit{
    
    private double prix;
    private String origine;

    public Fraise() {
        setPrix(4.58);
        setOrigine("France");
    }

    public Fraise(double prix, String origine) {
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
            this.origine = "France";
        }
        
    }

    @Override
    public String getName() {
        return "Fraise";
    }

    @Override
    public String toString() {
        return "Fraise de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Fraise fr = (Fraise) o;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

    @Override
    public boolean isSeedless() {  //predicat indiquant qu'une kiwi a des pepins
        return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Fraise(this.prix, this.origine);
    }
}
