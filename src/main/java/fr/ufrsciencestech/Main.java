package fr.ufrsciencestech;

import java.awt.Color;

import fr.ufrsciencestech.views.*;

public class Main {

    public static void main(String[] args) {

        MarcheFruits page = new MarcheFruits();
        
        page.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
        page.setVisible(true);
    }
}
