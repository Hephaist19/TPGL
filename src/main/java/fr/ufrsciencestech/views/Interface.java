package fr.ufrsciencestech.views;

/**
 *
 * @author mgall
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
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

        InterfacePanier = new javax.swing.JPanel();
        Colonne1 = new javax.swing.JPanel();
        ComboBoxRecettes = new javax.swing.JComboBox<>();
        ScrollPaneRecettes = new javax.swing.JScrollPane();
        TextAreaRecettes = new javax.swing.JTextArea();
        Colonne2 = new javax.swing.JPanel();
        LabelPanier = new javax.swing.JLabel();
        ScrollPanePanier = new javax.swing.JScrollPane();
        TextAreaPanier = new javax.swing.JTextArea();
        LigneTotalPanier = new javax.swing.JPanel();
        LabelTotalPanier = new javax.swing.JLabel();
        LabelPrixTotal = new javax.swing.JLabel();
        Colonne3 = new javax.swing.JPanel();
        BoutonAjouterFruit = new javax.swing.JButton();
        BoutonRetirerFruit = new javax.swing.JButton();
        BoutonViderPanier = new javax.swing.JButton();
        PanelVide1 = new javax.swing.JPanel();
        PanelVide2 = new javax.swing.JPanel();
        BoutonValiderPanier = new javax.swing.JButton();
        BarreDeMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        InterfacePanier.setLayout(new java.awt.GridLayout(1, 3));

        Colonne1.setLayout(new java.awt.GridLayout(2, 1));

        ComboBoxRecettes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recettes", "Cake au citron", "Ganache à l'amande", "Délice parfait", "Tarte aux pommes", "Chausson aux cerises griottes", " " }));
        ComboBoxRecettes.setMaximumSize(new java.awt.Dimension(189, 50));
        Colonne1.add(ComboBoxRecettes);

        TextAreaRecettes.setColumns(20);
        TextAreaRecettes.setRows(5);
        ScrollPaneRecettes.setViewportView(TextAreaRecettes);

        Colonne1.add(ScrollPaneRecettes);

        InterfacePanier.add(Colonne1);

        Colonne2.setLayout(new java.awt.GridLayout(3, 1));

        LabelPanier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelPanier.setText("Votre panier :");
        LabelPanier.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Colonne2.add(LabelPanier);

        TextAreaPanier.setColumns(20);
        TextAreaPanier.setRows(5);
        TextAreaPanier.setMaximumSize(new java.awt.Dimension(13, 20));
        ScrollPanePanier.setViewportView(TextAreaPanier);

        Colonne2.add(ScrollPanePanier);

        LigneTotalPanier.setLayout(new java.awt.GridLayout(1, 2));

        LabelTotalPanier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelTotalPanier.setText("Total :");
        LigneTotalPanier.add(LabelTotalPanier);

        LabelPrixTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPrixTotal.setText("00,00 €");
        LigneTotalPanier.add(LabelPrixTotal);

        Colonne2.add(LigneTotalPanier);

        InterfacePanier.add(Colonne2);

        Colonne3.setLayout(new java.awt.GridLayout(6, 1));

        BoutonAjouterFruit.setText("Ajouter un fruit");
        Colonne3.add(BoutonAjouterFruit);

        BoutonRetirerFruit.setText("Retirer un fruit");
        Colonne3.add(BoutonRetirerFruit);

        BoutonViderPanier.setText("Vider le panier");
        Colonne3.add(BoutonViderPanier);

        javax.swing.GroupLayout PanelVide1Layout = new javax.swing.GroupLayout(PanelVide1);
        PanelVide1.setLayout(PanelVide1Layout);
        PanelVide1Layout.setHorizontalGroup(
            PanelVide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        PanelVide1Layout.setVerticalGroup(
            PanelVide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        Colonne3.add(PanelVide1);

        javax.swing.GroupLayout PanelVide2Layout = new javax.swing.GroupLayout(PanelVide2);
        PanelVide2.setLayout(PanelVide2Layout);
        PanelVide2Layout.setHorizontalGroup(
            PanelVide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        PanelVide2Layout.setVerticalGroup(
            PanelVide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        Colonne3.add(PanelVide2);

        BoutonValiderPanier.setText("Valider le panier");
        BoutonValiderPanier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonValiderPanierActionPerformed(evt);
            }
        });
        Colonne3.add(BoutonValiderPanier);

        InterfacePanier.add(Colonne3);

        getContentPane().add(InterfacePanier);

        jMenu1.setText("File");
        BarreDeMenu.add(jMenu1);

        jMenu2.setText("Edit");
        BarreDeMenu.add(jMenu2);

        setJMenuBar(BarreDeMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonValiderPanierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonValiderPanierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonValiderPanierActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarreDeMenu;
    private javax.swing.JButton BoutonAjouterFruit;
    private javax.swing.JButton BoutonRetirerFruit;
    private javax.swing.JButton BoutonValiderPanier;
    private javax.swing.JButton BoutonViderPanier;
    private javax.swing.JPanel Colonne1;
    private javax.swing.JPanel Colonne2;
    private javax.swing.JPanel Colonne3;
    private javax.swing.JComboBox<String> ComboBoxRecettes;
    private javax.swing.JPanel InterfacePanier;
    private javax.swing.JLabel LabelPanier;
    private javax.swing.JLabel LabelPrixTotal;
    private javax.swing.JLabel LabelTotalPanier;
    private javax.swing.JPanel LigneTotalPanier;
    private javax.swing.JPanel PanelVide1;
    private javax.swing.JPanel PanelVide2;
    private javax.swing.JScrollPane ScrollPanePanier;
    private javax.swing.JScrollPane ScrollPaneRecettes;
    private javax.swing.JTextArea TextAreaPanier;
    private javax.swing.JTextArea TextAreaRecettes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
