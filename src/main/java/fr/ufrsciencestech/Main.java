package fr.ufrsciencestech;

import fr.ufrsciencestech.views.*;

public class Main {

    public static void main(String[] args) {
        
        //TEST DE L'INTERFACE
        System.out.println("Test de l'affichage de l'interface!");
        
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
