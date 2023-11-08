package fr.ufrsciencestech.views;

import javax.swing.*;

import fr.ufrsciencestech.models.Panier;
import fr.ufrsciencestech.models.fruits.Fruit;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;

/**
 *
 * @author mgall
 */
public class ValidationPanier extends javax.swing.JDialog implements PropertyChangeListener {

    final private Panier panier;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Creates new form Interface
     */
    public ValidationPanier(java.awt.Frame parent, boolean modal, Panier p) {
        super(parent, modal);
        this.panier = p;
        // Affecter l'observer this au panier
        initComponents();
        initListeFruit();
    }

    private void initListeFruit() {
        DefaultListModel liste = new DefaultListModel();
        for (Fruit fruit : panier.getFruits()) {
            liste.addElement(fruit.toString());
        }
        this.affichePanier.setModel(liste);

        this.LabelPrixTotal.setText(df.format(panier.getPrix()) + "€");
    }

    public final Panier getPanier() {
        return panier;
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

        InterfacePanier = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 200), new java.awt.Dimension(20, 200), new java.awt.Dimension(20, 200));
        Colonne1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 200), new java.awt.Dimension(30, 200), new java.awt.Dimension(30, 200));
        Colonne2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelVotrePanier = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ScrollPanier = new javax.swing.JScrollPane();
        affichePanier = new javax.swing.JList<>();
        LigneTotalPanier = new javax.swing.JPanel();
        LabelTotalPanier = new javax.swing.JLabel();
        LabelPrixTotal = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 200), new java.awt.Dimension(30, 200), new java.awt.Dimension(30, 200));
        Colonne3 = new javax.swing.JPanel();
        BoutonRetour = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        BoutonRetirerFruit = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        BoutonViderPanier = new javax.swing.JButton();
        spaceButton = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(0, 200), new java.awt.Dimension(250, 200));
        BoutonValiderPanier = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 200), new java.awt.Dimension(30, 200), new java.awt.Dimension(30, 200));

        InterfacePanier.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout InterfacePanierLayout = new java.awt.GridBagLayout();
        InterfacePanierLayout.columnWidths = new int[] {0};
        InterfacePanierLayout.rowHeights = new int[] {0};
        InterfacePanierLayout.columnWeights = new double[] {0.0};
        InterfacePanierLayout.rowWeights = new double[] {0.0};
        InterfacePanier.setLayout(InterfacePanierLayout);
        InterfacePanier.add(filler6, new java.awt.GridBagConstraints());

        Colonne1.setLayout(new javax.swing.BoxLayout(Colonne1, javax.swing.BoxLayout.Y_AXIS));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Colonne1.add(jSeparator1);

        InterfacePanier.add(Colonne1, new java.awt.GridBagConstraints());
        InterfacePanier.add(filler3, new java.awt.GridBagConstraints());

        Colonne2.setBackground(new java.awt.Color(255, 255, 255));
        Colonne2.setMaximumSize(new java.awt.Dimension(300, 400));
        Colonne2.setMinimumSize(new java.awt.Dimension(300, 400));
        Colonne2.setPreferredSize(new java.awt.Dimension(500, 416));
        Colonne2.setLayout(new javax.swing.BoxLayout(Colonne2, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 21));

        labelVotrePanier.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        labelVotrePanier.setForeground(new java.awt.Color(189, 98, 199));
        labelVotrePanier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelVotrePanier.setText("Votre panier :");
        labelVotrePanier.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(labelVotrePanier);

        Colonne2.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 150));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        ScrollPanier.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanier.setHorizontalScrollBar(null);
        ScrollPanier.setMaximumSize(new java.awt.Dimension(30000, 30000));
        ScrollPanier.setMinimumSize(new java.awt.Dimension(0, 0));
        ScrollPanier.setPreferredSize(new java.awt.Dimension(0, 0));
        ScrollPanier.setViewportView(null);

        affichePanier.setFont(new java.awt.Font("Constantia", 0, 15)); // NOI18N
        affichePanier.setForeground(new java.awt.Color(141, 126, 255));
        affichePanier.setAutoscrolls(false);
        affichePanier.setInheritsPopupMenu(true);
        affichePanier.setMaximumSize(new java.awt.Dimension(30000, 30000));
        affichePanier.setValueIsAdjusting(true);
        affichePanier.setVisibleRowCount(0);
        ScrollPanier.setViewportView(affichePanier);

        jPanel2.add(ScrollPanier);

        Colonne2.add(jPanel2);

        LigneTotalPanier.setBackground(new java.awt.Color(255, 255, 255));
        LigneTotalPanier.setMaximumSize(new java.awt.Dimension(200, 30));
        LigneTotalPanier.setMinimumSize(new java.awt.Dimension(200, 30));
        LigneTotalPanier.setPreferredSize(new java.awt.Dimension(104, 30));
        LigneTotalPanier.setLayout(new java.awt.GridLayout(1, 2));

        LabelTotalPanier.setForeground(new java.awt.Color(141, 126, 255));
        LabelTotalPanier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelTotalPanier.setText("Total :");
        LabelTotalPanier.setMaximumSize(new java.awt.Dimension(40, 30));
        LabelTotalPanier.setMinimumSize(new java.awt.Dimension(40, 30));
        LabelTotalPanier.setPreferredSize(new java.awt.Dimension(40, 30));
        LigneTotalPanier.add(LabelTotalPanier);

        LabelPrixTotal.setBackground(new java.awt.Color(255, 255, 255));
        LabelPrixTotal.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        LabelPrixTotal.setForeground(new java.awt.Color(189, 98, 199));
        LabelPrixTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPrixTotal.setText("00,00 €");
        LabelPrixTotal.setMaximumSize(new java.awt.Dimension(52, 30));
        LabelPrixTotal.setMinimumSize(new java.awt.Dimension(52, 30));
        LabelPrixTotal.setPreferredSize(new java.awt.Dimension(52, 30));
        LigneTotalPanier.add(LabelPrixTotal);

        Colonne2.add(LigneTotalPanier);

        InterfacePanier.add(Colonne2, new java.awt.GridBagConstraints());
        InterfacePanier.add(filler4, new java.awt.GridBagConstraints());

        Colonne3.setBackground(new java.awt.Color(255, 255, 255));
        Colonne3.setLayout(new javax.swing.BoxLayout(Colonne3, javax.swing.BoxLayout.Y_AXIS));

        BoutonRetour.setBackground(new java.awt.Color(141, 126, 255));
        BoutonRetour.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        BoutonRetour.setForeground(new java.awt.Color(255, 255, 255));
        BoutonRetour.setText("Retour au marché");
        BoutonRetour.setMaximumSize(new java.awt.Dimension(155, 22));
        BoutonRetour.setMinimumSize(new java.awt.Dimension(155, 22));
        BoutonRetour.setPreferredSize(new java.awt.Dimension(137, 22));
        BoutonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourActionPerformed(evt);
            }
        });
        Colonne3.add(BoutonRetour);
        Colonne3.add(filler1);

        BoutonRetirerFruit.setBackground(new java.awt.Color(141, 126, 255));
        BoutonRetirerFruit.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        BoutonRetirerFruit.setForeground(new java.awt.Color(255, 255, 255));
        BoutonRetirerFruit.setText("Retirer un fruit");
        BoutonRetirerFruit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoutonRetirerFruit.setMaximumSize(new java.awt.Dimension(155, 22));
        BoutonRetirerFruit.setMinimumSize(new java.awt.Dimension(137, 22));
        BoutonRetirerFruit.setPreferredSize(new java.awt.Dimension(155, 22));
        BoutonRetirerFruit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetirerFruitActionPerformed(evt);
            }
        });
        Colonne3.add(BoutonRetirerFruit);
        Colonne3.add(filler2);

        BoutonViderPanier.setBackground(new java.awt.Color(141, 126, 255));
        BoutonViderPanier.setFont(new java.awt.Font("Eunjin Nakseo", 0, 15)); // NOI18N
        BoutonViderPanier.setForeground(new java.awt.Color(255, 255, 255));
        BoutonViderPanier.setText("Vider le panier");
        BoutonViderPanier.setMaximumSize(new java.awt.Dimension(155, 22));
        BoutonViderPanier.setMinimumSize(new java.awt.Dimension(137, 22));
        BoutonViderPanier.setPreferredSize(new java.awt.Dimension(155, 22));
        BoutonViderPanier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonViderPanierActionPerformed(evt);
            }
        });
        Colonne3.add(BoutonViderPanier);
        Colonne3.add(spaceButton);

        BoutonValiderPanier.setBackground(new java.awt.Color(189, 98, 199));
        BoutonValiderPanier.setFont(new java.awt.Font("Eunjin Nakseo", 0, 16)); // NOI18N
        BoutonValiderPanier.setForeground(new java.awt.Color(255, 255, 255));
        BoutonValiderPanier.setText("Valider le panier");
        BoutonValiderPanier.setMaximumSize(new java.awt.Dimension(155, 32));
        BoutonValiderPanier.setMinimumSize(new java.awt.Dimension(155, 32));
        BoutonValiderPanier.setPreferredSize(new java.awt.Dimension(155, 32));
        BoutonValiderPanier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonValiderPanierActionPerformed(evt);
            }
        });
        Colonne3.add(BoutonValiderPanier);

        InterfacePanier.add(Colonne3, new java.awt.GridBagConstraints());
        InterfacePanier.add(filler5, new java.awt.GridBagConstraints());

        getContentPane().add(InterfacePanier, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonRetirerFruitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetirerFruitActionPerformed

        int index = this.affichePanier.getSelectedIndex();
        panier.retirer(index);
        initListeFruit();
    }//GEN-LAST:event_BoutonRetirerFruitActionPerformed

    private void BoutonViderPanierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonViderPanierActionPerformed

        panier.vider();
        initListeFruit();
    }//GEN-LAST:event_BoutonViderPanierActionPerformed

    private void BoutonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetourActionPerformed

        this.dispose();
    }//GEN-LAST:event_BoutonRetourActionPerformed

    public void BoutonValiderPanierActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BoutonValiderPanierActionPerformed

        if (panier.getPrix() > 0) {
            JOptionPane.showMessageDialog(this,
                    "Merci pour votre commande d'une valeur de " + panier.getPrix() + "€!\nBonne cuisine et à bientôt!",
                    "Validation du paiement", JOptionPane.INFORMATION_MESSAGE);
            panier.vider();
        }
        this.dispose();
    }// GEN-LAST:event_BoutonValiderPanierActionPerformed

    public JButton getButtonValider() {
        return BoutonValiderPanier;
    }

    public JButton getButtonRetirerFruit() {
        return BoutonRetirerFruit;
    }

    public JButton getButtonRetour() {
        return BoutonRetour;
    }

    public JButton getButtonViderPanier() {
        return BoutonViderPanier;
    }
    
    public JList getAffichePanier() {
        return affichePanier;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonRetirerFruit;
    private javax.swing.JButton BoutonRetour;
    private javax.swing.JButton BoutonValiderPanier;
    private javax.swing.JButton BoutonViderPanier;
    private javax.swing.JPanel Colonne1;
    private javax.swing.JPanel Colonne2;
    private javax.swing.JPanel Colonne3;
    private javax.swing.JPanel InterfacePanier;
    private javax.swing.JLabel LabelPrixTotal;
    private javax.swing.JLabel LabelTotalPanier;
    private javax.swing.JPanel LigneTotalPanier;
    private javax.swing.JScrollPane ScrollPanier;
    private javax.swing.JList<String> affichePanier;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelVotrePanier;
    private javax.swing.Box.Filler spaceButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("fruits"))
            initListeFruit();
    }
}
