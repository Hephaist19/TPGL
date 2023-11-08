package fr.ufrsciencestech.views;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.*;
import javax.swing.*;

import fr.ufrsciencestech.controllers.FruitsFilter;
import fr.ufrsciencestech.controllers.factories.*;
import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.models.fruits.Fruit;
import fr.ufrsciencestech.models.recettes.Recette;
import fr.ufrsciencestech.utils.FilterType;
import fr.ufrsciencestech.utils.SortType;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

/**
 *
 * @author mgall
 */
public class MarcheFruits extends javax.swing.JFrame implements PropertyChangeListener {

    //Instance de panier final important:
    //this s'enregistre en tant que listener pour les event que l'instance panier peut envoyer
    //En l'occurence lorsque le contenu du panier a changé (cf propertyChange())
    private final Panier panier;
    private final MarcheFruits instance;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private ArrayList<Fruit> listeFruitAffiche;

    boolean recetteAffiche = false;
    private ArrayList<Recette> listeRecetteAffiche;

    /**
     * Creates new form MarcheFruits
     */
    public MarcheFruits() {
        panier = new Panier(20);
        panier.addObserver(this);
        instance = this;
        initComponents();
        initButtons();
        initListePanier();
    }

    private void initListePanier() {
        DefaultListModel liste = new DefaultListModel();
        for (Fruit fruit : panier.getFruits()) {
            liste.addElement(fruit.getName());
        }
        this.listeRecap.setModel(liste);
        this.labelPrixRecapPanier.setText(df.format(panier.getPrix()));
    }
    
    
    
    //Créer dynamiquement tous les fruits avec la listeTous
    public void initButtons(){
       listeFruitAffiche = FruitsFactory.createAll();
       afficheFruits();
       listeRecetteAffiche = RecettesFactory.createAll();
       afficheRecettes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categorieGroupe = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        boutonVoirPanier = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        labelCategorie = new javax.swing.JLabel();
        categorieSansPepins = new javax.swing.JRadioButton();
        categorieRecette = new javax.swing.JRadioButton();
        categorieAgrume = new javax.swing.JRadioButton();
        categorieExotique = new javax.swing.JRadioButton();
        categorieTous = new javax.swing.JRadioButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        labelCategorie2 = new javax.swing.JLabel();
        trierPar = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        labelRecapPanier = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeRecap = new javax.swing.JList<>();
        jPanel14 = new javax.swing.JPanel();
        labelRecapTotalPanier = new javax.swing.JLabel();
        labelPrixRecapPanier = new javax.swing.JLabel();
        euros = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        labelCategorie1 = new javax.swing.JLabel();
        boycott = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 750));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 700));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(200, 500));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 700));
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

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setMaximumSize(new java.awt.Dimension(0, 5));
        jSeparator6.setPreferredSize(new java.awt.Dimension(0, 5));
        jPanel5.add(jSeparator6);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMaximumSize(new java.awt.Dimension(200, 155));
        jPanel11.setMinimumSize(new java.awt.Dimension(108, 155));
        jPanel11.setPreferredSize(new java.awt.Dimension(108, 155));
        jPanel11.setLayout(new java.awt.GridLayout(6, 0, 1, 3));

        labelCategorie.setFont(new java.awt.Font("Eunjin Nakseo", 0, 17)); // NOI18N
        labelCategorie.setForeground(new java.awt.Color(141, 126, 255));
        labelCategorie.setText("Catégorie :");
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

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setMaximumSize(new java.awt.Dimension(0, 5));
        jSeparator5.setPreferredSize(new java.awt.Dimension(0, 5));
        jPanel5.add(jSeparator5);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setMaximumSize(new java.awt.Dimension(0, 5));
        jSeparator4.setPreferredSize(new java.awt.Dimension(0, 5));
        jPanel5.add(jSeparator4);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(190, 20));

        labelCategorie2.setFont(new java.awt.Font("Eunjin Nakseo", 0, 17)); // NOI18N
        labelCategorie2.setForeground(new java.awt.Color(141, 126, 255));
        labelCategorie2.setText("Trier par :");
        labelCategorie2.setAlignmentY(0.0F);
        labelCategorie2.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel12.add(labelCategorie2);

        trierPar.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        trierPar.setForeground(new java.awt.Color(141, 126, 255));
        trierPar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionnez un tri", "Ordre Alphabétique", "Prix Croissant", "Prix Décroissant" }));
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
        jPanel13.setMaximumSize(new java.awt.Dimension(200, 30));
        jPanel13.setPreferredSize(new java.awt.Dimension(200, 30));

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
        jPanel14.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel14.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel14.setRequestFocusEnabled(false);

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

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(190, 20));

        labelCategorie1.setFont(new java.awt.Font("Eunjin Nakseo", 0, 17)); // NOI18N
        labelCategorie1.setForeground(new java.awt.Color(141, 126, 255));
        labelCategorie1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCategorie1.setText("Boycott :");
        labelCategorie1.setAlignmentY(0.0F);
        labelCategorie1.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel15.add(labelCategorie1);

        boycott.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        boycott.setForeground(new java.awt.Color(141, 126, 255));
        boycott.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionnez un pays", "Brésil", "Costa Rica", "Espagne", "France", "Madagascar", "Nouvelle-Zélande", "Portugal" }));
        boycott.setAlignmentX(0.25F);
        boycott.setMaximumSize(new java.awt.Dimension(170, 25));
        boycott.setPreferredSize(new java.awt.Dimension(180, 25));
        boycott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boycottActionPerformed(evt);
            }
        });
        jPanel15.add(boycott);

        jPanel5.add(jPanel15);

        jPanel1.add(jPanel5);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Eunjin Nakseo", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(141, 126, 255));
        jLabel1.setText("Bienvenue au Marché");
        jLabel1.setAlignmentX(0.5F);
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Affiche tous les fruits contenu dans la liste listeFruitAffiche, dans le
     * jPanel prévu
     */
    private void afficheFruits() {

        final ArrayList<Fruit> listeFruit = listeFruitAffiche;

        int taille = listeFruit.size();

        JPanel contenu = new JPanel();
        contenu.setLayout(new GridLayout(0, 5)); // création de la grille dans le JPanel
        contenu.setBackground(new Color(255, 255, 255));
        jPanel4.setBackground(new Color(255, 255, 255));

        // Couleur du texte pair/impair
        java.awt.Color mauve = new java.awt.Color(189, 98, 199);
        java.awt.Color bleu = new java.awt.Color(141, 126, 255);

        for (int i = 0; i < taille; i++) {
            final Fruit fruit = listeFruit.get(i);
            // Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeFruit.get(i).getName() + ".png");

            JPanel pan = new javax.swing.JPanel();
            pan.setLayout(new javax.swing.BoxLayout(pan, javax.swing.BoxLayout.Y_AXIS));

            JButton bouton = new JButton();
            bouton.setMaximumSize(new java.awt.Dimension(125, 125));
            bouton.setMinimumSize(new java.awt.Dimension(125, 125));
            bouton.setPreferredSize(new java.awt.Dimension(125, 125));
            bouton.setIcon(new javax.swing.ImageIcon(path));
            pan.add(bouton);

            JLabel label = new JLabel(listeFruit.get(i).getName() + " " + listeFruit.get(i).getPrix() + "€",SwingConstants.CENTER);

            label.setBackground(new java.awt.Color(255, 255, 255));
            label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16));
            if (i % 2 == 0) {
                label.setForeground(mauve);
            } else {
                label.setForeground(bleu);
            }
            pan.add(label);
            bouton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    PageFruit affichageFruit = new PageFruit(instance, false, fruit, panier);
                    affichageFruit.setLocation(100, 100);
                    affichageFruit.setVisible(true);
                }
            });

            contenu.add(pan); // ajout dans le grand panel
        }

        jPanel4.add(contenu);
    }
    
    private void afficheRecettes(){
        final ArrayList<Recette> listeRecette = listeRecetteAffiche;
        
        int taille = listeRecette.size();
        
        JPanel contenu = new JPanel();
        contenu.setLayout(new GridLayout(0, 5));    //création de la grille dans le JPanel
        contenu.setBackground(new Color(255, 255, 255));
        jPanel4.setBackground(new Color(255, 255, 255));

        //Couleur du texte pair/impair
        java.awt.Color mauve = new java.awt.Color(189, 98, 199);
        java.awt.Color bleu = new java.awt.Color(141, 126, 255);
            
        for(int i=0;i<taille;i++)
        {
            final Recette recette = listeRecette.get(i);
            //Chemin d'accès à l'image
            URL path = this.getClass().getClassLoader().getResource("./images/" + listeRecette.get(i).getName() + ".png");
            
            JPanel pan = new javax.swing.JPanel();
            pan.setLayout(new javax.swing.BoxLayout(pan, javax.swing.BoxLayout.Y_AXIS));
            
            JButton bouton = new JButton();
            bouton.setMaximumSize(new java.awt.Dimension(125, 125));
            bouton.setMinimumSize(new java.awt.Dimension(125, 125));
            bouton.setPreferredSize(new java.awt.Dimension(125, 125));
            bouton.setIcon(new javax.swing.ImageIcon(path));
            pan.add(bouton);

            JLabel label = new JLabel(listeRecette.get(i).getName() + " " + listeRecette.get(i).getPrix() + "€",SwingConstants.CENTER);

            label.setBackground(new java.awt.Color(255, 255, 255));
            label.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16));
            if (i % 2 == 0) {
                label.setForeground(mauve);
            } else {
                label.setForeground(bleu);
            }
            pan.add(label);
            bouton.addActionListener(new ActionListener() {
                @Override
                    public void actionPerformed(ActionEvent ae) {
                        PageRecette affichageFruit = new PageRecette(instance, false, recette, panier);
                        affichageFruit.setLocation(100,100);
                        affichageFruit.setVisible(true);
                    }
            });

            
            contenu.add(pan); //ajout dans le grand panel
        }

        jPanel4.add(contenu);
    }
    
    private void remiseAZero(){
        jPanel4.removeAll();
        jPanel4.revalidate();
        jPanel4.repaint();
    }

    private void categorieSansPepinsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_categorieSansPepinsActionPerformed
        // Vider les panels avant de remettre
        remiseAZero();

        // Fruits sans pépins
        ArrayList<Fruit> tout = FruitsFactory.createAll();
        listeFruitAffiche = new FruitsFilter(tout).filter(FilterType.NPEPINS).getResult();
        
        //Remplir des fruits types
        afficheFruits();
    }

    private void categorieRecetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieRecetteActionPerformed
        //Vider les panels avant de remettre 
        remiseAZero();
        
        //Recettes
        listeRecetteAffiche = RecettesFactory.createAll();
        
       //Remplir des fruits types
        afficheRecettes();
        
    }//GEN-LAST:event_categorieRecetteActionPerformed

    private void categorieAgrumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieAgrumeActionPerformed
        //Vider les panels avant de remettre 
        remiseAZero();
        
        // Agrumes 
        ArrayList<Fruit> tout = FruitsFactory.createAll();
        listeFruitAffiche = new FruitsFilter(tout).filter(FilterType.AGRUME).getResult();
        
       //Remplir des fruits types
        afficheFruits();
        
    }//GEN-LAST:event_categorieAgrumeActionPerformed

    private void categorieExotiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieExotiqueActionPerformed
       //Vider les panels avant de remettre 
        remiseAZero();
        
        // Agrumes 
        ArrayList<Fruit> tout = FruitsFactory.createAll();
        listeFruitAffiche = new FruitsFilter(tout).filter(FilterType.EXOTIQUE).getResult();
        
       //Remplir des fruits types
        afficheFruits();
    }//GEN-LAST:event_categorieExotiqueActionPerformed

    
    private void categorieTousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieTousActionPerformed
        //Vider les panels avant de remettre 
        remiseAZero();
        
        // Tous
        ArrayList<Fruit> tout = FruitsFactory.createAll();
        listeFruitAffiche = new FruitsFilter(tout).getResult();
        listeRecetteAffiche = RecettesFactory.createAll();
        
       //Remplir tous
        afficheFruits();
        afficheRecettes();
    }//GEN-LAST:event_categorieTousActionPerformed

    private void boycottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boycottActionPerformed
        String choix = (String) this.boycott.getSelectedItem(); // Récupère ce qui a été sélectionné

        if (!recetteAffiche) {
            
            FruitsFilter fe = new FruitsFilter(listeFruitAffiche);
            // On réalise au cas par cas
            switch (choix) {
                case "Brésil":
                    //listeFruitAffiche = fe.sort(SortType.ALPHABETIQUE).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "Costa Rica":
                    //listeFruitAffiche = fe.sort(SortType.PRIXCROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "Espagne":
                    //listeFruitAffiche = fe.sort(SortType.PRIXDECROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "France":
                    //listeFruitAffiche = fe.sort(SortType.PRIXDECROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "Madagascar":
                    //listeFruitAffiche = fe.sort(SortType.PRIXDECROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "Nouvelle-Zélande":
                    //listeFruitAffiche = fe.sort(SortType.PRIXDECROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "Portugal":
                    //listeFruitAffiche = fe.sort(SortType.PRIXDECROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                default:
                    remiseAZero();
                    afficheFruits();
                    break;
            }
        }
    }//GEN-LAST:event_boycottActionPerformed

    private void trierParActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_trierParActionPerformed
        // récupérer la catégorie qu'on est dedans

        String choix = (String) this.trierPar.getSelectedItem(); // Récupère ce qui a été sélectionné

        if (!recetteAffiche) {

            FruitsFilter fe = new FruitsFilter(listeFruitAffiche);
            // On réalise au cas par cas
            switch (choix) {
                case "Ordre Alphabétique":
                    listeFruitAffiche = fe.sort(SortType.ALPHABETIQUE).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "Prix Croissant":
                    listeFruitAffiche = fe.sort(SortType.PRIXCROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                case "Prix Décroissant":
                    listeFruitAffiche = fe.sort(SortType.PRIXDECROISSANT).getResult();
                    remiseAZero();
                    afficheFruits();
                    break;
                default:
                    break;
            }
        }

    }// GEN-LAST:event_trierParActionPerformed

    private void boutonVoirPanierMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_boutonVoirPanierMouseClicked
        final ValidationPanier validation = new ValidationPanier(this, false, panier);

        //On ajout un event de fermeture de validation panier, pour éviter de notifier des instances détruites
        validation.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                panier.removeObserver(validation);
            }
        });

        panier.addObserver(validation);

        validation.setVisible(true);
        validation.setLocation(100,100);
    }                                             

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("fruits"))
            initListePanier();
    }

    public final Panier getPanier() {
        return panier;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonVoirPanier;
    private javax.swing.JComboBox<String> boycott;
    private javax.swing.JRadioButton categorieAgrume;
    private javax.swing.JRadioButton categorieExotique;
    private javax.swing.ButtonGroup categorieGroupe;
    private javax.swing.JRadioButton categorieRecette;
    private javax.swing.JRadioButton categorieSansPepins;
    private javax.swing.JRadioButton categorieTous;
    private javax.swing.JLabel euros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelCategorie;
    private javax.swing.JLabel labelCategorie1;
    private javax.swing.JLabel labelCategorie2;
    private javax.swing.JLabel labelPrixRecapPanier;
    private javax.swing.JLabel labelRecapPanier;
    private javax.swing.JLabel labelRecapTotalPanier;
    private javax.swing.JList<String> listeRecap;
    private javax.swing.JComboBox<String> trierPar;
    // End of variables declaration//GEN-END:variables

}
