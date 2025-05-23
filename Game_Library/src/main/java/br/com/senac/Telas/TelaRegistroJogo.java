/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.*;

/**
 *
 * @author lagad
 */
public class TelaRegistroJogo extends javax.swing.JFrame {
UsuarioConexao user = new UsuarioConexao();
    public TelaRegistroJogo(UsuarioConexao usuario) {
        user = usuario;
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

        jLabel1 = new javax.swing.JLabel();
        TextFieldJogo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxStatus = new javax.swing.JComboBox<>();
        CheckBoxFinalizado = new javax.swing.JCheckBox();
        TextFieldDataFinalizado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Registrar jogo ");

        jLabel2.setText("Nome do jogo:");

        jLabel3.setText("Status:");

        ComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iniciando", "Jogando", "Finalizado" }));
        ComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxStatusActionPerformed(evt);
            }
        });

        CheckBoxFinalizado.setVisible(false);
        CheckBoxFinalizado.setSelected(true);
        CheckBoxFinalizado.setText("Finalizado hoje?");
        CheckBoxFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxFinalizadoActionPerformed(evt);
            }
        });

        TextFieldDataFinalizado.setVisible(false);
        TextFieldDataFinalizado.setFont(new java.awt.Font("Segoe UI", 0, 14));
        TextFieldDataFinalizado.setText("Data finalizado");
        TextFieldDataFinalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDataFinalizadoActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextFieldDataFinalizado)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldJogo)
                    .addComponent(ComboBoxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBoxFinalizado))
                .addContainerGap(412, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(CheckBoxFinalizado)
                .addGap(18, 18, 18)
                .addComponent(TextFieldDataFinalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxStatusActionPerformed
       if(ComboBoxStatus.getSelectedItem().equals("Finalizado"));
       {
       CheckBoxFinalizado.setVisible(true);
       }
       if(!ComboBoxStatus.getSelectedItem().equals("Finalizado"))
       {
       CheckBoxFinalizado.setVisible(false);
       }
       
    }//GEN-LAST:event_ComboBoxStatusActionPerformed

    private void CheckBoxFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxFinalizadoActionPerformed
    if(CheckBoxFinalizado.isVisible())
    {
    TextFieldDataFinalizado.setVisible(true);
    }
    if(!CheckBoxFinalizado.isVisible())
    {
    TextFieldDataFinalizado.setVisible(false);
    }
    }//GEN-LAST:event_CheckBoxFinalizadoActionPerformed

    private void TextFieldDataFinalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDataFinalizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDataFinalizadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String dataString;
        if(CheckBoxFinalizado.isSelected()) {java.sql.Date data = new java.sql.Date(System.currentTimeMillis());
 dataString = data.toString();  }
      else
      {
     dataString = TextFieldDataFinalizado.getText();
      }
      
        user.registrarJogo(TextFieldJogo.getText(),ComboBoxStatus.getSelectedItem().toString(), dataString, user);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRegistroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegistroJogo(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxFinalizado;
    private javax.swing.JComboBox<String> ComboBoxStatus;
    private javax.swing.JTextField TextFieldDataFinalizado;
    private javax.swing.JTextField TextFieldJogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
