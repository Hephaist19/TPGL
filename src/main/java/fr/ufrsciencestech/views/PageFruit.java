/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fr.ufrsciencestech.views;

/**
 *
 * @author hg186648
 */
public class PageFruit extends javax.swing.JFrame {

    private int noFruit = 0;
    
            
    
    /**
     * Creates new form PageFruit
     */
    public PageFruit() {
        initComponents();
        setNbFruit(noFruit);
    }

    public void setNbFruit(int noFruit){
        this.NbFruit.setText(Integer.toString(noFruit));
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
        ImageFruit = new javax.swing.JButton();
        PanelInfoFruit = new javax.swing.JPanel();
        NomFruit = new javax.swing.JLabel();
        Ligne2Infos = new javax.swing.JPanel();
        LabelOrigine = new javax.swing.JLabel();
        OrigineFruit = new javax.swing.JLabel();
        Ligne3Infos = new javax.swing.JPanel();
        LabelPrix = new javax.swing.JLabel();
        PrixFruit = new javax.swing.JLabel();
        EuroFruit = new javax.swing.JLabel();
        Ligne2 = new javax.swing.JPanel();
        LabelExempleRecettes = new javax.swing.JLabel();
        ExempleRecette = new javax.swing.JLabel();
        Ligne3 = new javax.swing.JPanel();
        PanelNombreFruit = new javax.swing.JPanel();
        MoinsFruit = new javax.swing.JButton();
        NbFruit = new javax.swing.JTextField();
        PlusFruit = new javax.swing.JButton();
        PanelTotalFruit = new javax.swing.JPanel();
        TotalFruit = new javax.swing.JLabel();
        EuroTotal = new javax.swing.JLabel();
        AjoutFruit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        Ligne1.setLayout(new java.awt.GridLayout(1, 2));

        ImageFruit.setEnabled(false);
        Ligne1.add(ImageFruit);

        PanelInfoFruit.setLayout(new javax.swing.BoxLayout(PanelInfoFruit, javax.swing.BoxLayout.Y_AXIS));

        NomFruit.setText("Fruit");
        PanelInfoFruit.add(NomFruit);

        Ligne2Infos.setLayout(new javax.swing.BoxLayout(Ligne2Infos, javax.swing.BoxLayout.X_AXIS));

        LabelOrigine.setText("Origine : ");
        Ligne2Infos.add(LabelOrigine);

        OrigineFruit.setText("Pays");
        Ligne2Infos.add(OrigineFruit);

        PanelInfoFruit.add(Ligne2Infos);

        Ligne3Infos.setLayout(new javax.swing.BoxLayout(Ligne3Infos, javax.swing.BoxLayout.X_AXIS));

        LabelPrix.setText("Prix : ");
        Ligne3Infos.add(LabelPrix);

        PrixFruit.setText("00,00");
        Ligne3Infos.add(PrixFruit);

        EuroFruit.setText(" €");
        Ligne3Infos.add(EuroFruit);

        PanelInfoFruit.add(Ligne3Infos);

        Ligne1.add(PanelInfoFruit);

        getContentPane().add(Ligne1);

        Ligne2.setLayout(new javax.swing.BoxLayout(Ligne2, javax.swing.BoxLayout.LINE_AXIS));

        LabelExempleRecettes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelExempleRecettes.setText("Exemples de recettes :");
        Ligne2.add(LabelExempleRecettes);

        ExempleRecette.setText("recette, recette, recette");
        ExempleRecette.setToolTipText("");
        Ligne2.add(ExempleRecette);

        getContentPane().add(Ligne2);

        Ligne3.setLayout(new java.awt.GridLayout(1, 2));

        PanelNombreFruit.setLayout(new javax.swing.BoxLayout(PanelNombreFruit, javax.swing.BoxLayout.LINE_AXIS));

        MoinsFruit.setText("-");
        MoinsFruit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoinsFruitMouseClicked(evt);
            }
        });
        PanelNombreFruit.add(MoinsFruit);

        NbFruit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NbFruit.setText("0");
        NbFruit.setMaximumSize(new java.awt.Dimension(30, 25));
        PanelNombreFruit.add(NbFruit);

        PlusFruit.setText("+");
        PlusFruit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlusFruitMouseClicked(evt);
            }
        });
        PanelNombreFruit.add(PlusFruit);

        Ligne3.add(PanelNombreFruit);

        PanelTotalFruit.setLayout(new javax.swing.BoxLayout(PanelTotalFruit, javax.swing.BoxLayout.X_AXIS));

        TotalFruit.setText("00,00");
        PanelTotalFruit.add(TotalFruit);

        EuroTotal.setText(" € ");
        PanelTotalFruit.add(EuroTotal);

        AjoutFruit.setText("Ajouter");
        PanelTotalFruit.add(AjoutFruit);

        Ligne3.add(PanelTotalFruit);

        getContentPane().add(Ligne3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void MoinsFruitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoinsFruitMouseClicked
        int nombre = Integer.parseInt(this.NbFruit.getText());
        if(nombre==0)
        {
            this.NbFruit.setText(Integer.toString(nombre));
        }
        else 
        {            
            nombre--;
            this.NbFruit.setText(Integer.toString(nombre));
        }
    }//GEN-LAST:event_MoinsFruitMouseClicked

    private void PlusFruitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlusFruitMouseClicked
        int nombre = Integer.parseInt(this.NbFruit.getText());
        nombre++;
        this.NbFruit.setText(Integer.toString(nombre));
    }//GEN-LAST:event_PlusFruitMouseClicked

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
            java.util.logging.Logger.getLogger(PageFruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageFruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageFruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageFruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageFruit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutFruit;
    private javax.swing.JLabel EuroFruit;
    private javax.swing.JLabel EuroTotal;
    private javax.swing.JLabel ExempleRecette;
    private javax.swing.JButton ImageFruit;
    private javax.swing.JLabel LabelExempleRecettes;
    private javax.swing.JLabel LabelOrigine;
    private javax.swing.JLabel LabelPrix;
    private javax.swing.JPanel Ligne1;
    private javax.swing.JPanel Ligne2;
    private javax.swing.JPanel Ligne2Infos;
    private javax.swing.JPanel Ligne3;
    private javax.swing.JPanel Ligne3Infos;
    private javax.swing.JButton MoinsFruit;
    private javax.swing.JTextField NbFruit;
    private javax.swing.JLabel NomFruit;
    private javax.swing.JLabel OrigineFruit;
    private javax.swing.JPanel PanelInfoFruit;
    private javax.swing.JPanel PanelNombreFruit;
    private javax.swing.JPanel PanelTotalFruit;
    private javax.swing.JButton PlusFruit;
    private javax.swing.JLabel PrixFruit;
    private javax.swing.JLabel TotalFruit;
    // End of variables declaration//GEN-END:variables
}
