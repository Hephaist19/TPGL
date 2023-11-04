package fr.ufrsciencestech.models.recettes;

import java.util.ArrayList;

import fr.ufrsciencestech.models.fruits.*;

public class BananaSplit implements Recette {
    
    private String name;
    private ArrayList<Fruit> listeFruit= new ArrayList<>();
    
    private Banane b1 = new Banane();
    private Banane b2 = new Banane();
    private Cerise c3 = new Cerise();
   
    
    @Override
    public String getName() {
        return "Banana split";
    }

    @Override
    public double getPrix() {
        Banane b = new Banane();
        Cerise c = new Cerise();
        return 2*b.getPrix()+1*c.getPrix();
    }
    
    @Override
    public ArrayList<Fruit> getFruits() {
        if(listeFruit!=null)
        {listeFruit.clear();}
        listeFruit.add(b1);
        listeFruit.add(b2);
        listeFruit.add(c3);
        return listeFruit;
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder("Ingrédients:").append("\n");

        for (Fruit fruit : getFruits()) {
            sb.append(fruit.getName()).append(" ");
        }
        
        return sb.toString();
    }
    
    @Override
    public String getEtapes() {
        StringBuilder sb = new StringBuilder("Étapes :").append("\n");

        sb.append("Allonger les deux bananes dans un plat, placer vos boules de glaces puis napper de chocolat fondu.\n Ajouter de la chantilly et la cerise sur le gâteau !");
        return sb.toString();
    }

}
