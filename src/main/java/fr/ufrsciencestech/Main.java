package fr.ufrsciencestech;

import fr.ufrsciencestech.views.*;

public class Main {

    public static void main(String[] args) {

        MarcheFruits dialog = new MarcheFruits();
        
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
        dialog.setVisible(true);
    }
}
