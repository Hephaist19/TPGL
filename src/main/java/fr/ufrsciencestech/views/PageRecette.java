/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fr.ufrsciencestech.views;

import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import fr.ufrsciencestech.exceptions.PanierPleinException;
import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.models.fruits.*;
import fr.ufrsciencestech.models.recettes.Recette;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author hg186648
 */
public class PageRecette extends javax.swing.JDialog {

    private Panier panier;
    private Recette recette;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    private ArrayList<Fruit> listeFruit; //Fruits nécessaires de la recette
    private URL iR; //chemin pour accéder à l'image de la recette
    private double prix =0;
    
    /**
     * Creates new PageFruit
     * @param parent
     * @param modal
     */
    
    public PageRecette(java.awt.Frame parent, boolean modal, Recette r, Panier p) {
        super(parent, modal);
        this.panier = p;
        this.recette = r;
        
        this.listeFruit=r.getFruits();
        this.iR= this.getClass().getClassLoader().getResource("./images/" + recette.getName() + ".png");
        initComponents();
        initRecetteIHM();
        
    }

    private void initRecetteIHM(){
        this.ImageRecette.setIcon(new ImageIcon(iR));
        this.NomRecette.setText(recette.getName());
        this.NbRecette.setText(Integer.toString(1));
        
        affichageIngredients();
       // this.IngredientsRecette.setText(recette.getDescription());
        this.Etapes.setText(recette.getEtapes());
        calculPrix();
        this.TotalFruit.setText(df.format(Double.parseDouble(this.NbRecette.getText()) * prix ));
    }
    
    private void actualiserPrixTotal() {
        double total = Double.parseDouble(this.NbRecette.getText()) * prix;
        this.TotalFruit.setText(df.format(total));
    }
     
    private void calculPrix(){
        
        int taille = recette.getFruits().size();
        
        for(int i=0; i<taille; i++)
        {
            prix += recette.getFruits().get(i).getPrix();
        }
        
    }
    
    private void affichageIngredients(){
        
        int taille = recette.getFruits().size();
        String label = "";
        
        for(int i=0; i<taille; i++)
        {
            if(i==0)
            {
                label += recette.getFruits().get(i).getName();
            }
            else if(recette.getFruits().get(i).getName().equals(recette.getFruits().get(i-1).getName())){}
            else 
            {
                label += ", "+recette.getFruits().get(i).getName();
            }
            
        }
        //recette.getDescription()
        
        this.IngredientsRecette.setText(label);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ligne1 = new javax.swing.JPanel();
        ImagePanel = new javax.swing.JPanel();
        ImageRecette = new javax.swing.JButton();
        PanelInfoRecette = new javax.swing.JPanel();
        Ligne1Infos = new javax.swing.JPanel();
        NomRecette = new javax.swing.JLabel();
        Ligne2Infos = new javax.swing.JPanel();
        LabelIngred = new javax.swing.JLabel();
        IngredientsRecette = new javax.swing.JLabel();
        Ligne2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Etapes = new javax.swing.JTextArea();
        Ligne3 = new javax.swing.JPanel();
        PanelNombreFruit = new javax.swing.JPanel();
        MoinsRecette = new javax.swing.JButton();
        NbRecette = new javax.swing.JTextField();
        PlusRecette = new javax.swing.JButton();
        PanelTotalFruit = new javax.swing.JPanel();
        TotalFruit = new javax.swing.JLabel();
        EuroTotal = new javax.swing.JLabel();
        AjoutRecette = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(620, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        Ligne1.setLayout(new java.awt.GridLayout(1, 2));

        ImagePanel.setBackground(new java.awt.Color(255, 255, 255));
        ImagePanel.setPreferredSize(new java.awt.Dimension(100, 125));

        ImageRecette.setForeground(new java.awt.Color(255, 255, 255));
        ImageRecette.setPreferredSize(new java.awt.Dimension(125, 125));
        ImagePanel.add(ImageRecette);

        Ligne1.add(ImagePanel);

        PanelInfoRecette.setLayout(new javax.swing.BoxLayout(PanelInfoRecette, javax.swing.BoxLayout.Y_AXIS));

        Ligne1Infos.setBackground(new java.awt.Color(255, 255, 255));
        Ligne1Infos.setPreferredSize(new java.awt.Dimension(100, 25));

        NomRecette.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        NomRecette.setForeground(new java.awt.Color(141, 126, 255));
        NomRecette.setText("Recette");
        Ligne1Infos.add(NomRecette);

        PanelInfoRecette.add(Ligne1Infos);

        Ligne2Infos.setBackground(new java.awt.Color(255, 255, 255));

        LabelIngred.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        LabelIngred.setForeground(new java.awt.Color(189, 98, 199));
        LabelIngred.setText("Fruits nécessaires :");
        Ligne2Infos.add(LabelIngred);

        IngredientsRecette.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        IngredientsRecette.setForeground(new java.awt.Color(189, 98, 199));
        IngredientsRecette.setText("Les ingrédients");
        Ligne2Infos.add(IngredientsRecette);

        PanelInfoRecette.add(Ligne2Infos);

        Ligne1.add(PanelInfoRecette);

        getContentPane().add(Ligne1);

        Ligne2.setPreferredSize(new java.awt.Dimension(100, 70));
        Ligne2.setLayout(new javax.swing.BoxLayout(Ligne2, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(378, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 25));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 100));

        Etapes.setEditable(false);
        Etapes.setColumns(20);
        Etapes.setFont(new java.awt.Font("Century", 0, 15)); // NOI18N
        Etapes.setForeground(new java.awt.Color(141, 126, 255));
        Etapes.setLineWrap(true);
        Etapes.setRows(5);
        Etapes.setMaximumSize(new java.awt.Dimension(30000, 80000));
        Etapes.setMinimumSize(new java.awt.Dimension(300, 80));
        Etapes.setPreferredSize(new java.awt.Dimension(450, 100));
        jScrollPane1.setViewportView(Etapes);

        jPanel3.add(jScrollPane1);

        Ligne2.add(jPanel3);

        getContentPane().add(Ligne2);

        Ligne3.setPreferredSize(new java.awt.Dimension(350, 40));
        Ligne3.setLayout(new java.awt.GridLayout(1, 2));

        PanelNombreFruit.setBackground(new java.awt.Color(255, 255, 255));
        PanelNombreFruit.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        MoinsRecette.setBackground(new java.awt.Color(141, 126, 255));
        MoinsRecette.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        MoinsRecette.setForeground(new java.awt.Color(255, 255, 255));
        MoinsRecette.setText("-");
        MoinsRecette.setMaximumSize(new java.awt.Dimension(37, 37));
        MoinsRecette.setMinimumSize(new java.awt.Dimension(37, 37));
        MoinsRecette.setPreferredSize(new java.awt.Dimension(43, 43));
        MoinsRecette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoinsRecette(evt);
            }
        });
        PanelNombreFruit.add(MoinsRecette);

        NbRecette.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        NbRecette.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NbRecette.setText("0");
        NbRecette.setMaximumSize(new java.awt.Dimension(30, 37));
        NbRecette.setMinimumSize(new java.awt.Dimension(64, 37));
        NbRecette.setPreferredSize(new java.awt.Dimension(64, 43));
        PanelNombreFruit.add(NbRecette);

        PlusRecette.setBackground(new java.awt.Color(141, 126, 255));
        PlusRecette.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        PlusRecette.setForeground(new java.awt.Color(255, 255, 255));
        PlusRecette.setText("+");
        PlusRecette.setMaximumSize(new java.awt.Dimension(370, 370));
        PlusRecette.setMinimumSize(new java.awt.Dimension(37, 37));
        PlusRecette.setPreferredSize(new java.awt.Dimension(43, 43));
        PlusRecette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusRecetteActionPerformed(evt);
            }
        });
        PanelNombreFruit.add(PlusRecette);

        Ligne3.add(PanelNombreFruit);

        PanelTotalFruit.setBackground(new java.awt.Color(255, 255, 255));
        PanelTotalFruit.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        TotalFruit.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        TotalFruit.setForeground(new java.awt.Color(189, 98, 199));
        TotalFruit.setText("00,00");
        PanelTotalFruit.add(TotalFruit);

        EuroTotal.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        EuroTotal.setForeground(new java.awt.Color(189, 98, 199));
        EuroTotal.setText(" € ");
        PanelTotalFruit.add(EuroTotal);

        AjoutRecette.setBackground(new java.awt.Color(189, 98, 199));
        AjoutRecette.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        AjoutRecette.setForeground(new java.awt.Color(255, 255, 255));
        AjoutRecette.setText("Ajouter");
        AjoutRecette.setPreferredSize(new java.awt.Dimension(89, 43));
        AjoutRecette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutRecette(evt);
            }
        });
        PanelTotalFruit.add(AjoutRecette);

        Ligne3.add(PanelTotalFruit);

        getContentPane().add(Ligne3);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public JButton getPlusFruit() {
        return PlusRecette;
    }
    
    public JButton getMoinsFruit() {
        return MoinsRecette;
    }
        
    public JButton getAjoutFruit() {
        return AjoutRecette;
    }
    
    public JTextField getNbRecette() {
        return NbRecette;
    }
    
    private void MoinsRecette(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoinsRecette
        int nombre = Integer.parseInt(this.NbRecette.getText());
        if(nombre == 1) //Vérification qu'on ne peut avoir un chiffre négatif
        {
            this.NbRecette.setText(Integer.toString(nombre));
        }
        else 
        {            
            nombre--;
            this.NbRecette.setText(Integer.toString(nombre));
        }
        
        //Mise à jour du prix total
        actualiserPrixTotal();
    }//GEN-LAST:event_MoinsRecette

    private void AjoutRecette(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutRecette
        int taille = recette.getFruits().size();
        int nombre = Integer.parseInt(this.NbRecette.getText());
        
        try {
            for (int i=0; i < nombre; i++) {
                for (int j=0; j < taille; j++) 
                {
                    Fruit fruit = recette.getFruits().get(j);
                    panier.ajout(fruit);
                }
                
            }
        } catch (PanierPleinException e) {
            JOptionPane.showMessageDialog(Ligne2, "Il n'y a pas assez de place dans votre panier.", "Faites du tri !", JOptionPane.ERROR_MESSAGE);

        }finally {
            this.dispose();
        }
    }//GEN-LAST:event_AjoutRecette

    private void PlusRecetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusRecetteActionPerformed
        int nombre = Integer.parseInt(this.NbRecette.getText());
        nombre++;
        this.NbRecette.setText(Integer.toString(nombre));
        
        //Mise à jour du prix total
        actualiserPrixTotal();
    }//GEN-LAST:event_PlusRecetteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutRecette;
    private javax.swing.JTextArea Etapes;
    private javax.swing.JLabel EuroTotal;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JButton ImageRecette;
    private javax.swing.JLabel IngredientsRecette;
    private javax.swing.JLabel LabelIngred;
    private javax.swing.JPanel Ligne1;
    private javax.swing.JPanel Ligne1Infos;
    private javax.swing.JPanel Ligne2;
    private javax.swing.JPanel Ligne2Infos;
    private javax.swing.JPanel Ligne3;
    private javax.swing.JButton MoinsRecette;
    private javax.swing.JTextField NbRecette;
    private javax.swing.JLabel NomRecette;
    private javax.swing.JPanel PanelInfoRecette;
    private javax.swing.JPanel PanelNombreFruit;
    private javax.swing.JPanel PanelTotalFruit;
    private javax.swing.JButton PlusRecette;
    private javax.swing.JLabel TotalFruit;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
