package fr.ufrsciencestech;

import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.models.fruits.Pomme;
import fr.ufrsciencestech.views.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        //TEST DE L'INTERFACE
        System.out.println("Test de l'affichage de l'interface!");
        
        //TEST DES CHEMINS DES IMAGES DYNAMIQUEMENT
        List<String> listeTous = Arrays.asList("Ananas","Pomme","Kiwi","Orange","Citron","Framboise","Cerise","Fraise","Banane","Pêche","Litchi");
        for(int i=0;i<listeTous.size();i++)
        {
            String path = "../src/main/resources/images/"+listeTous.get(i)+".png";
            System.out.println(path);
        }
        
        Fruit f = new Pomme();
        Panier p = new Panier(2);
        PageFruit dialog = new PageFruit(new javax.swing.JFrame(), true, f, p);
        
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
        dialog.setVisible(true);
    }
}
