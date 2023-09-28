package fr.ufrsciencestech;

import fr.ufrsciencestech.fruits.*;
import fr.ufrsciencestech.panier.Panier;

public class Main {

    public static void main(String[] args) {

        //Ecrire ici vos tests
        System.out.println("premier test Panier");

        /////// DEBUT TEST GROUPE 4 /////// 
        System.out.println("TEST GROUPE 4 : AJOUT FRUIT");
        Panier panierTestG4 = new Panier(1);
        Fruit kiwi1 = new Kiwi();
        Fruit kiwi2 = new Kiwi();
        try {
            
            System.out.println("Panier de base : " + panierTestG4.toString());
            panierTestG4.ajout(kiwi1);
            System.out.println("Panier avec ajout kiwi : " + panierTestG4.toString());
            //panierTestG4.ajout(kiwi2);
            //System.out.println("Panier rempli avec deuxième ajout kiwi : " + panierTestG4.toString());
        
            Panier p = new Panier(10);
            Fruit c = new Ananas(40,"south-africa");
            Fruit c1 = new Ananas(30,"colombia");
            p.ajout(c);
            p.ajout(c1);
            
            for(Fruit f : p.getFruits())
            {
                System.out.println(f + " \n");
            } 

            p.retrait();

            System.out.println("test fonction retrait() ---------  groupe 5 --------\n");

            for(Fruit f : p.getFruits())
            {
                System.out.println(f + " \n");
            } 
                
        }   
        catch (Exception e)
        {
            e.printStackTrace ();
        }

    }
}
