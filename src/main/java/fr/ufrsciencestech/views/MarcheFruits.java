package fr.ufrsciencestech.views;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.*;
import javax.swing.*;

import fr.ufrsciencestech.controllers.factories.FruitsFactory;
import fr.ufrsciencestech.exceptions.PanierPleinException;
import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.utils.FruitType;

/**
 *
 * @author mgall
 */
public class MarcheFruits extends javax.swing.JFrame implements PropertyChangeListener {
    
    private List<String> listeSansPepins = Arrays.asList("Ananas","Kiwi","Framboise","Fraise","Banane");
    private List<String> listeAgrume = Arrays.asList("Orange","Citron");  
    private List<String> listeExotique = Arrays.asList("Ananas","Kiwi","Banane","Litchi");
    private List<String> listeTous = Arrays.asList("Ananas","Pomme","Kiwi","Orange","Citron","Framboise","Cerise","Fraise","Banane","Peche","Litchi","Cake au citron","Jus de pomme","Jus multifruit","Tarte aux cerises","Banana split");
    private List<String> listeRecette = Arrays.asList("Cake au citron","Jus de pomme","Jus multifruit","Tarte aux cerises","Banana split");  

    
    private List<String> listeOrdreAlphabtique = Arrays.asList("Ananas","Banane","Cerise","Citron","Fraise","Framboise","Kiwi","Litchi","Orange","Peche","Pomme"); 
    //private List<String> listePrixCroissant = Arrays.asList();
    //private List<String> listePrixDecroissant = Arrays.asList();
    

    private Panier panier;
    /**
     * Creates new form MarcheFruits
     */
    public MarcheFruits() {
        panier = new Panier(20);
        //jeu de test
        try {
            panier.ajouterTout(FruitsFactory.createAllOf(FruitType.CERISE, FruitType.POMME, FruitType.FRAMBOISE));
        } catch (PanierPleinException e) {
            e.printStackTrace();
        };

        initComponents();
        initButtons();
        initListeFruit();
    }

    //TODO actualiser panier en fonction de son signal
    private void initListeFruit() {
        DefaultListModel liste = new DefaultListModel();
        for (Fruit fruit : panier.getFruits()) {
            liste.addElement(fruit.getName());
        }
        this.listeRecap.setModel(liste);
        //TODO limiter à deux chiffre après la virgules
        this.labelPrixRecapPanier.setText(Double.toString(panier.getPrix()));
    }
    
    //Créer dynamiquement tous les fruits avec la listeTous
    public void initButtons(){
        
        for(int i=0;i<listeTous.size();i++)
        {
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeTous.get(i) + ".png");
            
            //Couleur du texte pair/impair
            java.awt.Color mauve = new java.awt.Color(189, 98, 199);
            java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
            if(i<4) //Première ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path)); 
                jPanel3.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeTous.get(i));
                jPanel6.add(label);   
            }
            else if (i<8) //Deuxième ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));         
                jPanel7.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeTous.get(i));
                jPanel8.add(label); 
            }
            else if (i<12) { //Troisième ligne
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));                 
                jPanel10.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeTous.get(i));
                jPanel9.add(label); 
                
            } else {//Quatrième ligne
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));                 
                jPanel15.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeTous.get(i));
                jPanel16.add(label); 
            }
            
            
        }
        //TEST créer les fruits dans un gridlayout en fonction du nombre de fruits (c'est moche)
        /*
        int nb = this.listeTous.size(); //Récupère le nombre de fruits à afficher    
        int n = (int) Math.sqrt(nb) + 1;
        jPanel3.setLayout(new GridLayout(n, n + 1));    //création de la grille dans le JPanel

        //Couleur du texte pair/impair
        java.awt.Color mauve = new java.awt.Color(189, 98, 199);
        java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
        for(int i=0;i<nb;i++)
        {
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeTous.get(i) + ".png");
            
            JPanel pan = new javax.swing.JPanel();
            pan.setLayout(new javax.swing.BoxLayout(pan, javax.swing.BoxLayout.Y_AXIS));
            
            JButton bouton = new JButton();
            bouton.setMaximumSize(new java.awt.Dimension(125, 125));
            bouton.setMinimumSize(new java.awt.Dimension(125, 125));
            bouton.setPreferredSize(new java.awt.Dimension(125, 125));
            bouton.setIcon(new javax.swing.ImageIcon(path));
            pan.add(bouton);

            JLabel label = new JLabel("",SwingConstants.CENTER);
            label.setBackground(new java.awt.Color(255, 255, 255));
            label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16));
            if (i % 2 == 0) {
                label.setForeground(mauve);
            } else {
                label.setForeground(bleu);
            }
            label.setText(listeTous.get(i));
            pan.add(label);  
            
            jPanel3.add(pan); //ajout dans le grand panel
        }
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categorieGroupe = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        boutonVoirPanier = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        labelCategorie = new javax.swing.JLabel();
        categorieSansPepins = new javax.swing.JRadioButton();
        categorieRecette = new javax.swing.JRadioButton();
        categorieAgrume = new javax.swing.JRadioButton();
        categorieExotique = new javax.swing.JRadioButton();
        categorieTous = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        trierPar = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        labelRecapPanier = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeRecap = new javax.swing.JList<>();
        jPanel14 = new javax.swing.JPanel();
        labelRecapTotalPanier = new javax.swing.JLabel();
        labelPrixRecapPanier = new javax.swing.JLabel();
        euros = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 510));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(200, 500));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 515));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 1));
        jPanel5.add(jSeparator3);

        boutonVoirPanier.setBackground(new java.awt.Color(189, 98, 199));
        boutonVoirPanier.setFont(new java.awt.Font("Eunjin Nakseo", 0, 18)); // NOI18N
        boutonVoirPanier.setForeground(new java.awt.Color(255, 255, 255));
        boutonVoirPanier.setAlignmentX(0.5F);
        boutonVoirPanier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boutonVoirPanier.setLabel("Voir le panier");
        boutonVoirPanier.setMargin(new java.awt.Insets(5, 14, 5, 14));
        boutonVoirPanier.setMaximumSize(new java.awt.Dimension(200, 25));
        boutonVoirPanier.setPreferredSize(new java.awt.Dimension(200, 40));
        boutonVoirPanier.setRolloverEnabled(false);
        boutonVoirPanier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonVoirPanierMouseClicked(evt);
            }
        });
        jPanel5.add(boutonVoirPanier);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(200, 155));
        jPanel11.setMinimumSize(new java.awt.Dimension(108, 155));
        jPanel11.setPreferredSize(new java.awt.Dimension(108, 155));
        jPanel11.setLayout(new java.awt.GridLayout(6, 0, 1, 3));

        labelCategorie.setFont(new java.awt.Font("Eunjin Nakseo", 0, 17)); // NOI18N
        labelCategorie.setForeground(new java.awt.Color(141, 126, 255));
        labelCategorie.setText("Catégorie");
        labelCategorie.setAlignmentY(0.0F);
        jPanel11.add(labelCategorie);

        categorieSansPepins.setBackground(new java.awt.Color(255, 255, 255));
        categorieGroupe.add(categorieSansPepins);
        categorieSansPepins.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        categorieSansPepins.setForeground(new java.awt.Color(189, 98, 199));
        categorieSansPepins.setText("Sans pépins");
        categorieSansPepins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieSansPepinsActionPerformed(evt);
            }
        });
        jPanel11.add(categorieSansPepins);

        categorieRecette.setBackground(new java.awt.Color(255, 255, 255));
        categorieGroupe.add(categorieRecette);
        categorieRecette.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        categorieRecette.setForeground(new java.awt.Color(189, 98, 199));
        categorieRecette.setLabel("Recettes");
        categorieRecette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieRecetteActionPerformed(evt);
            }
        });
        jPanel11.add(categorieRecette);

        categorieAgrume.setBackground(new java.awt.Color(255, 255, 255));
        categorieGroupe.add(categorieAgrume);
        categorieAgrume.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        categorieAgrume.setForeground(new java.awt.Color(189, 98, 199));
        categorieAgrume.setText("Agrume");
        categorieAgrume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieAgrumeActionPerformed(evt);
            }
        });
        jPanel11.add(categorieAgrume);

        categorieExotique.setBackground(new java.awt.Color(255, 255, 255));
        categorieGroupe.add(categorieExotique);
        categorieExotique.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        categorieExotique.setForeground(new java.awt.Color(189, 98, 199));
        categorieExotique.setText("Exotique");
        categorieExotique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieExotiqueActionPerformed(evt);
            }
        });
        jPanel11.add(categorieExotique);

        categorieTous.setBackground(new java.awt.Color(255, 255, 255));
        categorieGroupe.add(categorieTous);
        categorieTous.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        categorieTous.setForeground(new java.awt.Color(189, 98, 199));
        categorieTous.setSelected(true);
        categorieTous.setText("Tous");
        categorieTous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieTousActionPerformed(evt);
            }
        });
        jPanel11.add(categorieTous);

        jPanel5.add(jPanel11);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(190, 20));

        trierPar.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        trierPar.setForeground(new java.awt.Color(141, 126, 255));
        trierPar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trier par", "Ordre Alphabétique", "Prix Croissant", "Prix Décroissant" }));
        trierPar.setAlignmentX(0.25F);
        trierPar.setMaximumSize(new java.awt.Dimension(170, 25));
        trierPar.setPreferredSize(new java.awt.Dimension(180, 25));
        trierPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trierParActionPerformed(evt);
            }
        });
        jPanel12.add(trierPar);

        jPanel5.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 15));

        labelRecapPanier.setBackground(new java.awt.Color(255, 255, 255));
        labelRecapPanier.setFont(new java.awt.Font("Eunjin Nakseo", 0, 17)); // NOI18N
        labelRecapPanier.setForeground(new java.awt.Color(141, 126, 255));
        labelRecapPanier.setText("Récapitulatif panier");
        jPanel13.add(labelRecapPanier);

        jPanel5.add(jPanel13);

        listeRecap.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        listeRecap.setForeground(new java.awt.Color(189, 98, 199));
        listeRecap.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listeRecap);

        jPanel5.add(jScrollPane1);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(200, 20));

        labelRecapTotalPanier.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelRecapTotalPanier.setForeground(new java.awt.Color(141, 126, 255));
        labelRecapTotalPanier.setText("Total panier : ");
        jPanel14.add(labelRecapTotalPanier);

        labelPrixRecapPanier.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelPrixRecapPanier.setForeground(new java.awt.Color(189, 98, 199));
        labelPrixRecapPanier.setText("00,00");
        jPanel14.add(labelPrixRecapPanier);

        euros.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        euros.setForeground(new java.awt.Color(189, 98, 199));
        euros.setText("€");
        jPanel14.add(euros);

        jPanel5.add(jPanel14);

        jPanel1.add(jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Eunjin Nakseo", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(141, 126, 255));
        jLabel1.setText("Bienvenue au Marché");
        jLabel1.setAlignmentX(0.5F);
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 5));
        jPanel4.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 5));
        jPanel4.add(jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jPanel10);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 5));
        jPanel4.add(jPanel9);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setMinimumSize(new java.awt.Dimension(160, 10));
        jPanel16.setPreferredSize(new java.awt.Dimension(160, 10));
        jPanel4.add(jPanel16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categorieSansPepinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieSansPepinsActionPerformed
        // Fruits sans pépins NI NOYAU -> Ananas, Kiwi, Framboise, Fraise, Banane
        
        //Vider les panels avant de remettre 
        for(int i=0;i<listeSansPepins.size();i++)
        {
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeSansPepins.get(i) + ".png");
            
            //Couleur du texte pair/impair
            java.awt.Color mauve = new java.awt.Color(189, 98, 199);
            java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
            if(i<4) //Première ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path)); 
                jPanel3.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeSansPepins.get(i));
                jPanel6.add(label);   
            }
            else if (i<8) //Deuxième ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));         
                jPanel7.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeSansPepins.get(i));
                jPanel8.add(label); 
            }
            else { //Troisième ligne
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));                 
                jPanel10.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeSansPepins.get(i));
                jPanel9.add(label); 
                
            }
        }
        
    }//GEN-LAST:event_categorieSansPepinsActionPerformed

    private void categorieRecetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieRecetteActionPerformed
        //Recettes
        
        for(int i=0;i<listeRecette.size();i++)
        {
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeRecette.get(i) + ".png");
            
            //Couleur du texte pair/impair
            java.awt.Color mauve = new java.awt.Color(189, 98, 199);
            java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
            if(i<4) //Première ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path)); 
                jPanel3.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeRecette.get(i));
                jPanel6.add(label);   
            }
            else if (i<8) //Deuxième ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));         
                jPanel7.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeRecette.get(i));
                jPanel8.add(label); 
            }
            else { //Troisième ligne
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));                 
                jPanel10.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeRecette.get(i));
                jPanel9.add(label); 
                
            }
        }
        
    }//GEN-LAST:event_categorieRecetteActionPerformed

    private void categorieAgrumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieAgrumeActionPerformed
        // Agrumes -> Orange, Citron
        
        
        for(int i=0;i<listeAgrume.size();i++)
        {
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeAgrume.get(i) + ".png");
            
            //Couleur du texte pair/impair
            java.awt.Color mauve = new java.awt.Color(189, 98, 199);
            java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
            if(i<4) //Première ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path)); 
                jPanel3.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeAgrume.get(i));
                jPanel6.add(label);   
            }
            else if (i<8) //Deuxième ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));         
                jPanel7.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeAgrume.get(i));
                jPanel8.add(label); 
            }
            else { //Troisième ligne
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));                 
                jPanel10.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeAgrume.get(i));
                jPanel9.add(label); 
                
            }
        }
    }//GEN-LAST:event_categorieAgrumeActionPerformed

    private void categorieExotiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieExotiqueActionPerformed
        // Fruits exotiques -> Ananas, Kiwi, Banane, Litchi
        
        for(int i=0;i<listeExotique.size();i++)
        {
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeExotique.get(i) + ".png");
            
            //Couleur du texte pair/impair
            java.awt.Color mauve = new java.awt.Color(189, 98, 199);
            java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
            if(i<4) //Première ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path)); 
                jPanel3.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeExotique.get(i));
                jPanel6.add(label);   
            }
            else if (i<8) //Deuxième ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));         
                jPanel7.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeExotique.get(i));
                jPanel8.add(label); 
            }
            else { //Troisième ligne
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));                 
                jPanel10.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeExotique.get(i));
                jPanel9.add(label); 
                
            }
        }
        
    }//GEN-LAST:event_categorieExotiqueActionPerformed

    private void categorieTousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieTousActionPerformed
        // Tous les fruits du marché
        for(int i=0;i<listeTous.size();i++)
        {
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeTous.get(i) + ".png");
            
            //Couleur du texte pair/impair
            java.awt.Color mauve = new java.awt.Color(189, 98, 199);
            java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
            if(i<4) //Première ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path)); 
                jPanel3.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeTous.get(i));
                jPanel6.add(label);   
            }
            else if (i<8) //Deuxième ligne
            {
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));         
                jPanel7.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeTous.get(i));
                jPanel8.add(label); 
            }
            else { //Troisième ligne
                JButton bouton = new JButton();
                bouton.setMaximumSize(new java.awt.Dimension(125, 125));
                bouton.setMinimumSize(new java.awt.Dimension(125, 125));
                bouton.setPreferredSize(new java.awt.Dimension(125, 125));
                bouton.setIcon(new javax.swing.ImageIcon(path));                 
                jPanel10.add(bouton);

                JLabel label = new JLabel();
                label.setBackground(new java.awt.Color(255, 255, 255));
                label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); 
                if(i%2==0)
                {
                    label.setForeground(mauve);
                }
                else
                {
                    label.setForeground(bleu);
                }
                label.setText(listeTous.get(i));
                jPanel9.add(label); 
                
            }
        }
        
    }//GEN-LAST:event_categorieTousActionPerformed

    private void trierParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trierParActionPerformed
        String choix = (String) this.trierPar.getSelectedItem(); //Récupère ce qui a été sélectionné

        //On réalise au cas par cas
        switch (choix) {
            case "Ordre Alphabétique":
                //Les trier dans cet ordre => Ananas, Banane, Cerise, Citron, Fraise, Framboise, Kiwi, Litchi, Orange, Pêche, Pomme
                break;
            case "Prix Croissant":
                //Les trier dans cet ordre (prix)=>
                break;
            case "Prix Décroissant":
                //Les trier dans cet ordre (prix inverse ci dessus) =>
                break;
            default:
                //Les trier comme on a initialisé
                break;
        }

     }//GEN-LAST:event_trierParActionPerformed

    private void boutonVoirPanierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonVoirPanierMouseClicked

        Interface validation = new Interface(this, true, panier);
        
        validation.setVisible(true);
        validation.setLocation(100,100);
        
    }//GEN-LAST:event_boutonVoirPanierMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonVoirPanier;
    private javax.swing.JRadioButton categorieAgrume;
    private javax.swing.JRadioButton categorieExotique;
    private javax.swing.ButtonGroup categorieGroupe;
    private javax.swing.JRadioButton categorieRecette;
    private javax.swing.JRadioButton categorieSansPepins;
    private javax.swing.JRadioButton categorieTous;
    private javax.swing.JLabel euros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCategorie;
    private javax.swing.JLabel labelPrixRecapPanier;
    private javax.swing.JLabel labelRecapPanier;
    private javax.swing.JLabel labelRecapTotalPanier;
    private javax.swing.JList<String> listeRecap;
    private javax.swing.JComboBox<String> trierPar;
    // End of variables declaration//GEN-END:variables
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("WESH");
    }
}
