/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import Classes.TxtHandler;
import java.util.ArrayList;

/**
 *
 * @author fernandocardoce
 */
public class csvCalculator extends javax.swing.JFrame {

    /**
     * Creates new form csvCalculator
     */
    public csvCalculator() {
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

        jPanel1 = new javax.swing.JPanel();
        bttnLoad = new javax.swing.JButton();
        bttnPros = new javax.swing.JButton();
        bttnSave = new javax.swing.JButton();
        lblExamn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttnLoad.setText("Cargar");
        bttnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLoadActionPerformed(evt);
            }
        });

        bttnPros.setText("Procesar");
        bttnPros.setEnabled(false);
        bttnPros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnProsActionPerformed(evt);
            }
        });

        bttnSave.setText("Guardar");
        bttnSave.setEnabled(false);
        bttnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSaveActionPerformed(evt);
            }
        });

        lblExamn.setText("Examen 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExamn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttnLoad)
                        .addGap(18, 18, 18)
                        .addComponent(bttnPros)
                        .addGap(18, 18, 18)
                        .addComponent(bttnSave)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExamn)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnLoad)
                    .addComponent(bttnPros)
                    .addComponent(bttnSave))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLoadActionPerformed
        txtHandler.cargar(list);
        bttnPros.setEnabled(true);
    }//GEN-LAST:event_bttnLoadActionPerformed

    private void bttnProsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnProsActionPerformed
        granTotal = txtHandler.procesar(list);
        bttnSave.setEnabled(true);
    }//GEN-LAST:event_bttnProsActionPerformed

    private void bttnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSaveActionPerformed
        txtHandler.guardar(granTotal);
    }//GEN-LAST:event_bttnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(csvCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(csvCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(csvCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(csvCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new csvCalculator().setVisible(true);
            }
        });
    }
    ArrayList<String> list = new ArrayList<String>();
    float granTotal =0 ;
    TxtHandler txtHandler = new TxtHandler();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnLoad;
    private javax.swing.JButton bttnPros;
    private javax.swing.JButton bttnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExamn;
    // End of variables declaration//GEN-END:variables
}
