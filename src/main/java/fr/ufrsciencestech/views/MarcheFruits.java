package fr.ufrsciencestech.views;
import java.net.URL;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author mgall
 */
public class MarcheFruits extends javax.swing.JDialog {
    
    private List<String> listeSansPepins = Arrays.asList("Ananas","Kiwi","Framboise","Cerise","Fraise","Banane","Peche","Litchi");
    private List<String> listeAvecNoyau = Arrays.asList("Cerise","Peche","Litchi");
    private List<String> listeAgrume = Arrays.asList("Orange","Citron");  
    private List<String> listeExotique = Arrays.asList("Ananas","Kiwi","Banane","Litchi"); 
    private List<String> listeTous = Arrays.asList("Ananas","Pomme","Kiwi","Orange","Citron","Framboise","Cerise","Fraise","Banane","Peche","Litchi");

    private List<String> listeOrdreAlphabtique = Arrays.asList("Ananas","Banane","Cerise","Citron","Fraise","Framboise","Kiwi","Litchi","Orange","Peche","Pomme"); 
    //private List<String> listePrixCroissant = Arrays.asList();
    //private List<String> listePrixDecroissant = Arrays.asList();
    

    /**
     * Creates new form MarcheFruits
     * @param parent
     * @param modal
     */
    public MarcheFruits(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initButtons();
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
                //bouton.setIcon(new javax.swing.ImageIcon(getClass().getResource(path))); 
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
                //bouton.setIcon(new javax.swing.ImageIcon(getClass().getResource(path))); 
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
        boutonQuitterMarche = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        labelCategorie = new javax.swing.JLabel();
        categorieSansPepins = new javax.swing.JRadioButton();
        categorieAvecNoyau = new javax.swing.JRadioButton();
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
        boutonAnanas = new javax.swing.JButton();
        boutonPomme = new javax.swing.JButton();
        boutonKiwi = new javax.swing.JButton();
        boutonOrange = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        labelAnanas = new javax.swing.JLabel();
        labelPomme = new javax.swing.JLabel();
        labelKiwi = new javax.swing.JLabel();
        labelOrange = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        boutonFramboise = new javax.swing.JButton();
        boutonCitron = new javax.swing.JButton();
        boutonCerise = new javax.swing.JButton();
        boutonFraise = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        labelFramboise = new javax.swing.JLabel();
        labelCitron = new javax.swing.JLabel();
        labelCerise = new javax.swing.JLabel();
        labelFraise = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        boutonBanane = new javax.swing.JButton();
        boutonPeche = new javax.swing.JButton();
        boutonLitchi = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        labelBanane = new javax.swing.JLabel();
        labelPeche = new javax.swing.JLabel();
        labelLitchi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(308, 192));

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

        boutonQuitterMarche.setBackground(new java.awt.Color(189, 98, 199));
        boutonQuitterMarche.setFont(new java.awt.Font("Eunjin Nakseo", 0, 18)); // NOI18N
        boutonQuitterMarche.setForeground(new java.awt.Color(255, 255, 255));
        boutonQuitterMarche.setText("Quitter le marché");
        boutonQuitterMarche.setAlignmentX(0.5F);
        boutonQuitterMarche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boutonQuitterMarche.setMargin(new java.awt.Insets(5, 14, 5, 14));
        boutonQuitterMarche.setMaximumSize(new java.awt.Dimension(200, 25));
        boutonQuitterMarche.setPreferredSize(new java.awt.Dimension(200, 40));
        boutonQuitterMarche.setRolloverEnabled(false);
        boutonQuitterMarche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonQuitterMarcheMouseClicked(evt);
            }
        });
        jPanel5.add(boutonQuitterMarche);

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

        categorieAvecNoyau.setBackground(new java.awt.Color(255, 255, 255));
        categorieGroupe.add(categorieAvecNoyau);
        categorieAvecNoyau.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        categorieAvecNoyau.setForeground(new java.awt.Color(189, 98, 199));
        categorieAvecNoyau.setText("Avec noyau");
        categorieAvecNoyau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieAvecNoyauActionPerformed(evt);
            }
        });
        jPanel11.add(categorieAvecNoyau);

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

        boutonAnanas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ananas.png"))); // NOI18N
        boutonAnanas.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonAnanas.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonAnanas.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel3.add(boutonAnanas);

        boutonPomme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pomme.png"))); // NOI18N
        boutonPomme.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonPomme.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonPomme.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel3.add(boutonPomme);

        boutonKiwi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Kiwi.png"))); // NOI18N
        boutonKiwi.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonKiwi.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonKiwi.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel3.add(boutonKiwi);

        boutonOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange.png"))); // NOI18N
        boutonOrange.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonOrange.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonOrange.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel3.add(boutonOrange);

        jPanel4.add(jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 5));

        labelAnanas.setBackground(new java.awt.Color(255, 255, 255));
        labelAnanas.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelAnanas.setForeground(new java.awt.Color(189, 98, 199));
        labelAnanas.setText("Ananas");
        jPanel6.add(labelAnanas);

        labelPomme.setBackground(new java.awt.Color(255, 255, 255));
        labelPomme.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelPomme.setForeground(new java.awt.Color(141, 126, 255));
        labelPomme.setText("Pomme");
        jPanel6.add(labelPomme);

        labelKiwi.setBackground(new java.awt.Color(255, 255, 255));
        labelKiwi.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelKiwi.setForeground(new java.awt.Color(189, 98, 199));
        labelKiwi.setText("Kiwi");
        jPanel6.add(labelKiwi);

        labelOrange.setBackground(new java.awt.Color(255, 255, 255));
        labelOrange.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelOrange.setForeground(new java.awt.Color(141, 126, 255));
        labelOrange.setText("Orange");
        jPanel6.add(labelOrange);

        jPanel4.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        boutonFramboise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Framboise.png"))); // NOI18N
        boutonFramboise.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonFramboise.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonFramboise.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel7.add(boutonFramboise);

        boutonCitron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Citron.png"))); // NOI18N
        boutonCitron.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonCitron.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonCitron.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel7.add(boutonCitron);

        boutonCerise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cerise.png"))); // NOI18N
        boutonCerise.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonCerise.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonCerise.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel7.add(boutonCerise);

        boutonFraise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fraise.png"))); // NOI18N
        boutonFraise.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonFraise.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonFraise.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel7.add(boutonFraise);

        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 5));

        labelFramboise.setBackground(new java.awt.Color(255, 255, 255));
        labelFramboise.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelFramboise.setForeground(new java.awt.Color(141, 126, 255));
        labelFramboise.setText("Framboise");
        jPanel8.add(labelFramboise);

        labelCitron.setBackground(new java.awt.Color(255, 255, 255));
        labelCitron.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelCitron.setForeground(new java.awt.Color(189, 98, 199));
        labelCitron.setText("Citron");
        jPanel8.add(labelCitron);

        labelCerise.setBackground(new java.awt.Color(255, 255, 255));
        labelCerise.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelCerise.setForeground(new java.awt.Color(141, 126, 255));
        labelCerise.setText("Cerise");
        jPanel8.add(labelCerise);

        labelFraise.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelFraise.setForeground(new java.awt.Color(189, 98, 199));
        labelFraise.setText("Fraise");
        jPanel8.add(labelFraise);

        jPanel4.add(jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        boutonBanane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Banane.png"))); // NOI18N
        boutonBanane.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonBanane.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonBanane.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel10.add(boutonBanane);

        boutonPeche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Peche.png"))); // NOI18N
        boutonPeche.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonPeche.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonPeche.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel10.add(boutonPeche);

        boutonLitchi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Litchi.png"))); // NOI18N
        boutonLitchi.setMaximumSize(new java.awt.Dimension(125, 125));
        boutonLitchi.setMinimumSize(new java.awt.Dimension(125, 125));
        boutonLitchi.setPreferredSize(new java.awt.Dimension(125, 125));
        jPanel10.add(boutonLitchi);

        jPanel4.add(jPanel10);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 80, 5));

        labelBanane.setBackground(new java.awt.Color(255, 255, 255));
        labelBanane.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelBanane.setForeground(new java.awt.Color(141, 126, 255));
        labelBanane.setText("Banane");
        jPanel9.add(labelBanane);

        labelPeche.setBackground(new java.awt.Color(255, 255, 255));
        labelPeche.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelPeche.setForeground(new java.awt.Color(189, 98, 199));
        labelPeche.setText("Pêche");
        jPanel9.add(labelPeche);

        labelLitchi.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelLitchi.setForeground(new java.awt.Color(141, 126, 255));
        labelLitchi.setText("Litchi");
        jPanel9.add(labelLitchi);

        jPanel4.add(jPanel9);

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
        // Fruits sans pépins -> Ananas, Kiwi, Framboise, Cerise, Fraise, Banane, Pêche,Litchi
        
        this.boutonAnanas.setVisible(true);
        this.labelAnanas.setVisible(true);
        
        this.boutonKiwi.setVisible(true);
        this.labelKiwi.setVisible(true);
        
        this.boutonFramboise.setVisible(true);
        this.labelFramboise.setVisible(true);
        
        this.boutonCerise.setVisible(true);
        this.labelCerise.setVisible(true);
        
        this.boutonFraise.setVisible(true);
        this.labelFraise.setVisible(true);
        
        this.boutonBanane.setVisible(true);
        this.labelBanane.setVisible(true);
        
        this.boutonPeche.setVisible(true);
        this.labelPeche.setVisible(true);
        
        this.boutonLitchi.setVisible(true);
        this.labelLitchi.setVisible(true);
        
        this.boutonOrange.setVisible(false);
        this.labelOrange.setVisible(false);
        
        this.boutonCitron.setVisible(false);
        this.labelCitron.setVisible(false);
        
        this.boutonPomme.setVisible(false);
        this.labelPomme.setVisible(false);
    }//GEN-LAST:event_categorieSansPepinsActionPerformed

    private void categorieAvecNoyauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieAvecNoyauActionPerformed
        // Fruits avec noyau -> Cerise, Pêche, Litchi
        
        this.boutonCerise.setVisible(true);
        this.labelCerise.setVisible(true);
        
        this.boutonPeche.setVisible(true);
        this.labelPeche.setVisible(true);
        
        this.boutonLitchi.setVisible(true);
        this.labelLitchi.setVisible(true);
        
        this.boutonAnanas.setVisible(false);
        this.labelAnanas.setVisible(false);
        
        this.boutonKiwi.setVisible(false);
        this.labelKiwi.setVisible(false);
        
        this.boutonBanane.setVisible(false);
        this.labelBanane.setVisible(false);
        
        this.boutonPomme.setVisible(false);
        this.labelPomme.setVisible(false);
        
        this.boutonOrange.setVisible(false);
        this.labelOrange.setVisible(false);
        
        this.boutonFramboise.setVisible(false);
        this.labelFramboise.setVisible(false);
        
        this.boutonCitron.setVisible(false);
        this.labelCitron.setVisible(false);
      
        this.boutonFraise.setVisible(false);
        this.labelFraise.setVisible(false);
        
    }//GEN-LAST:event_categorieAvecNoyauActionPerformed

    private void categorieAgrumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieAgrumeActionPerformed
        // Agrumes -> Orange, Citron
        
        this.boutonOrange.setVisible(true);
        this.labelOrange.setVisible(true);
        
        this.boutonCitron.setVisible(true);
        this.labelCitron.setVisible(true);
        
        this.boutonAnanas.setVisible(false);
        this.labelAnanas.setVisible(false);
        
        this.boutonKiwi.setVisible(false);
        this.labelKiwi.setVisible(false);
        
        this.boutonBanane.setVisible(false);
        this.labelBanane.setVisible(false);
        
        this.boutonLitchi.setVisible(false);
        this.labelLitchi.setVisible(false);
        
        this.boutonPomme.setVisible(false);
        this.labelPomme.setVisible(false);
        
        this.boutonFramboise.setVisible(false);
        this.labelFramboise.setVisible(false);
        
        this.boutonCerise.setVisible(false);
        this.labelCerise.setVisible(false);
        
        this.boutonFraise.setVisible(false);
        this.labelFraise.setVisible(false);
        
        this.boutonPeche.setVisible(false);
        this.labelPeche.setVisible(false);
    }//GEN-LAST:event_categorieAgrumeActionPerformed

    private void categorieExotiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieExotiqueActionPerformed
        // Fruits exotiques -> Ananas, Kiwi, Banane, Litchi
        
        this.boutonAnanas.setVisible(true);
        this.labelAnanas.setVisible(true);
        
        this.boutonKiwi.setVisible(true);
        this.labelKiwi.setVisible(true);
        
        this.boutonBanane.setVisible(true);
        this.labelBanane.setVisible(true);
        
        this.boutonLitchi.setVisible(true);
        this.labelLitchi.setVisible(true);
        
        this.boutonPomme.setVisible(false);
        this.labelPomme.setVisible(false);
        
        this.boutonOrange.setVisible(false);
        this.labelOrange.setVisible(false);
        
        this.boutonFramboise.setVisible(false);
        this.labelFramboise.setVisible(false);
        
        this.boutonCitron.setVisible(false);
        this.labelCitron.setVisible(false);
        
        this.boutonCerise.setVisible(false);
        this.labelCerise.setVisible(false);
        
        this.boutonFraise.setVisible(false);
        this.labelFraise.setVisible(false);
        
        this.boutonPeche.setVisible(false);
        this.labelPeche.setVisible(false);
        
    }//GEN-LAST:event_categorieExotiqueActionPerformed

    private void categorieTousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieTousActionPerformed
        // Tous les fruits du marché
        
        this.boutonAnanas.setVisible(true);
        this.labelAnanas.setVisible(true);
        
        this.boutonKiwi.setVisible(true);
        this.labelKiwi.setVisible(true);
        
        this.boutonFramboise.setVisible(true);
        this.labelFramboise.setVisible(true);
        
        this.boutonCerise.setVisible(true);
        this.labelCerise.setVisible(true);
        
        this.boutonFraise.setVisible(true);
        this.labelFraise.setVisible(true);
        
        this.boutonBanane.setVisible(true);
        this.labelBanane.setVisible(true);
        
        this.boutonPeche.setVisible(true);
        this.labelPeche.setVisible(true);
        
        this.boutonLitchi.setVisible(true);
        this.labelLitchi.setVisible(true);
        
        this.boutonOrange.setVisible(true);
        this.labelOrange.setVisible(true);
        
        this.boutonCitron.setVisible(true);
        this.labelCitron.setVisible(true);
        
        this.boutonPomme.setVisible(true);
        this.labelPomme.setVisible(true);
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

    private void boutonQuitterMarcheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonQuitterMarcheMouseClicked
        // Quitter le marché -> Récupérer les instances de fruits dans le récapitulatif panier JList this.listeRecap afin de les ajouter dans le panier en vérifiant que le MAX panier n'est pas atteint !
        
    }//GEN-LAST:event_boutonQuitterMarcheMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MarcheFruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcheFruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcheFruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcheFruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MarcheFruits dialog = new MarcheFruits(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAnanas;
    private javax.swing.JButton boutonBanane;
    private javax.swing.JButton boutonCerise;
    private javax.swing.JButton boutonCitron;
    private javax.swing.JButton boutonFraise;
    private javax.swing.JButton boutonFramboise;
    private javax.swing.JButton boutonKiwi;
    private javax.swing.JButton boutonLitchi;
    private javax.swing.JButton boutonOrange;
    private javax.swing.JButton boutonPeche;
    private javax.swing.JButton boutonPomme;
    private javax.swing.JButton boutonQuitterMarche;
    private javax.swing.JRadioButton categorieAgrume;
    private javax.swing.JRadioButton categorieAvecNoyau;
    private javax.swing.JRadioButton categorieExotique;
    private javax.swing.ButtonGroup categorieGroupe;
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
    private javax.swing.JLabel labelAnanas;
    private javax.swing.JLabel labelBanane;
    private javax.swing.JLabel labelCategorie;
    private javax.swing.JLabel labelCerise;
    private javax.swing.JLabel labelCitron;
    private javax.swing.JLabel labelFraise;
    private javax.swing.JLabel labelFramboise;
    private javax.swing.JLabel labelKiwi;
    private javax.swing.JLabel labelLitchi;
    private javax.swing.JLabel labelOrange;
    private javax.swing.JLabel labelPeche;
    private javax.swing.JLabel labelPomme;
    private javax.swing.JLabel labelPrixRecapPanier;
    private javax.swing.JLabel labelRecapPanier;
    private javax.swing.JLabel labelRecapTotalPanier;
    private javax.swing.JList<String> listeRecap;
    private javax.swing.JComboBox<String> trierPar;
    // End of variables declaration//GEN-END:variables
}
