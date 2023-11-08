package fr.ufrsciencestech;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import fr.ufrsciencestech.views.MarcheFruits;

public class Main {

    public static void main(String[] args) {

        MarcheFruits page = new MarcheFruits();
        
        page.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
        page.setVisible(true);
    }
}