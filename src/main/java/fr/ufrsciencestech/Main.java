package fr.ufrsciencestech;

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
        
        MarcheFruits dialog = new MarcheFruits(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
        dialog.setVisible(true);
        
        
    }
}
