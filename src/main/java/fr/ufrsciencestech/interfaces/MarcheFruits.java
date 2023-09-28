package fr.ufrsciencestech.interfaces;

/**
 *
 * @author mgall
 */
public class MarcheFruits extends javax.swing.JDialog {

    /**
     * Creates new form MarcheFruits
     */
    public MarcheFruits(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Colonne1 = new javax.swing.JPanel();
        BoutonQuitter = new javax.swing.JButton();
        Catégories = new javax.swing.JPanel();
        ComboBoxTrierPar = new javax.swing.JComboBox<>();
        LabelRecap = new javax.swing.JLabel();
        ScrollPaneRecap = new javax.swing.JScrollPane();
        ListePanier = new javax.swing.JList<>();
        Colonne2 = new javax.swing.JPanel();
        LabelTitre = new javax.swing.JLabel();
        PanelFruits = new javax.swing.JPanel();
        PanelExempleFruit = new javax.swing.JPanel();
        BoutonExempleFruit = new javax.swing.JButton();
        LabelExempleFruit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(308, 192));
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        Colonne1.setMaximumSize(new java.awt.Dimension(327, 400));
        Colonne1.setPreferredSize(new java.awt.Dimension(200, 400));
        Colonne1.setLayout(new java.awt.GridLayout(5, 1));

        BoutonQuitter.setText("jButton1");
        Colonne1.add(BoutonQuitter);

        javax.swing.GroupLayout CatégoriesLayout = new javax.swing.GroupLayout(Catégories);
        Catégories.setLayout(CatégoriesLayout);
        CatégoriesLayout.setHorizontalGroup(
            CatégoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
        CatégoriesLayout.setVerticalGroup(
            CatégoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        Colonne1.add(Catégories);

        ComboBoxTrierPar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trier par", "Ordre alphabétique", "Prix croissant", "Prix décroissant" }));
        Colonne1.add(ComboBoxTrierPar);

        LabelRecap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelRecap.setText("Récapitulatif de votre panier :");
        LabelRecap.setToolTipText("");
        LabelRecap.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Colonne1.add(LabelRecap);

        ListePanier.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPaneRecap.setViewportView(ListePanier);

        Colonne1.add(ScrollPaneRecap);

        getContentPane().add(Colonne1);

        Colonne2.setLayout(new java.awt.GridLayout(2, 1));

        LabelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitre.setText("Bienvenue sur le marché !");
        Colonne2.add(LabelTitre);

        PanelFruits.setLayout(new java.awt.GridLayout(3, 4));

        PanelExempleFruit.setLayout(new java.awt.GridLayout(2, 1));

        BoutonExempleFruit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banane_verte.jpg"))); // NOI18N
        BoutonExempleFruit.setMaximumSize(new java.awt.Dimension(10, 10));
        BoutonExempleFruit.setMinimumSize(new java.awt.Dimension(10, 10));
        BoutonExempleFruit.setPreferredSize(new java.awt.Dimension(10, 10));
        PanelExempleFruit.add(BoutonExempleFruit);

        LabelExempleFruit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelExempleFruit.setText("Banane Verte");
        PanelExempleFruit.add(LabelExempleFruit);

        PanelFruits.add(PanelExempleFruit);

        Colonne2.add(PanelFruits);

        getContentPane().add(Colonne2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton BoutonExempleFruit;
    private javax.swing.JButton BoutonQuitter;
    private javax.swing.JPanel Catégories;
    private javax.swing.JPanel Colonne1;
    private javax.swing.JPanel Colonne2;
    private javax.swing.JComboBox<String> ComboBoxTrierPar;
    private javax.swing.JLabel LabelExempleFruit;
    private javax.swing.JLabel LabelRecap;
    private javax.swing.JLabel LabelTitre;
    private javax.swing.JList<String> ListePanier;
    private javax.swing.JPanel PanelExempleFruit;
    private javax.swing.JPanel PanelFruits;
    private javax.swing.JScrollPane ScrollPaneRecap;
    // End of variables declaration//GEN-END:variables
}
