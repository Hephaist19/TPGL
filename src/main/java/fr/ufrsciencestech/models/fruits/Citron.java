/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.models.fruits;

/**
 *
 * @author jl336673
 */
public class Citron {
        private double prix;
    private String origine;

    public Citron() {
        this.prix = 0.5;  //prix en euros
        this.origine = "Espagne";
    }

    public Citron(double prix, String origine) {
        if (prix < 0) {
            this.prix = -prix;  //une solution possible pour interdire les prix negatifs
        } else {
            this.prix = prix;
        }

        if (origine.equals("")) {
            this.origine = "Espagne";  //Espagne par défaut
        } else {
            this.origine = origine;
        }
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Citron de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {  //predicat pour tester si 2 oranges sont equivalentes
        if (o != null && getClass() == o.getClass()) {
            Citron ci = (Citron) o;
            return (prix == ci.prix && origine.equals(ci.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une kiwi a des pepins
        return false;
    }
}
