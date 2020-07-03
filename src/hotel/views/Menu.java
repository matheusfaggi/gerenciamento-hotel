/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.views;

import hotel.database.Database;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author matheusfaggi
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        btnCriarReserva = new javax.swing.JButton();
        btnAlterarReserva = new javax.swing.JButton();
        btnCriarReserva1 = new javax.swing.JButton();
        btnCriarReserva2 = new javax.swing.JButton();
        btnAlterarReserva1 = new javax.swing.JButton();
        btnCriarReserva3 = new javax.swing.JButton();
        btnCriarReserva4 = new javax.swing.JButton();
        btnCriarReserva5 = new javax.swing.JButton();
        btnCriarReserva6 = new javax.swing.JButton();
        btnCriarReserva7 = new javax.swing.JButton();
        btnCriarReserva8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnCriarReserva.setText("Entrada veículo");
        btnCriarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReservaActionPerformed(evt);
            }
        });

        btnAlterarReserva.setText("Alterar reserva (UD)");
        btnAlterarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarReservaActionPerformed(evt);
            }
        });

        btnCriarReserva1.setText("Nova reserva (C)");
        btnCriarReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva1ActionPerformed(evt);
            }
        });

        btnCriarReserva2.setText("Realizar hospedagem (C)");
        btnCriarReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva2ActionPerformed(evt);
            }
        });

        btnAlterarReserva1.setText("Listar reservas (R)");
        btnAlterarReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarReserva1ActionPerformed(evt);
            }
        });

        btnCriarReserva3.setText("Novo cliente (C)");
        btnCriarReserva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva3ActionPerformed(evt);
            }
        });

        btnCriarReserva4.setText("Alterar cliente (UD)");
        btnCriarReserva4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva4ActionPerformed(evt);
            }
        });

        btnCriarReserva5.setText("Listar clientes (R)");
        btnCriarReserva5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva5ActionPerformed(evt);
            }
        });

        btnCriarReserva6.setText("Saída veículo");
        btnCriarReserva6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva6ActionPerformed(evt);
            }
        });

        btnCriarReserva7.setText("Cadastrar veículo (C)");
        btnCriarReserva7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva7ActionPerformed(evt);
            }
        });

        btnCriarReserva8.setText("Listar veículos (R)");
        btnCriarReserva8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReserva8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAlterarReserva1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCriarReserva1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCriarReserva2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(btnAlterarReserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCriarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriarReserva6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriarReserva7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriarReserva8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCriarReserva4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(btnCriarReserva3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCriarReserva5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriarReserva3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriarReserva7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriarReserva5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterarReserva1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCriarReserva8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCriarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCriarReserva4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCriarReserva2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCriarReserva6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarReservaActionPerformed
        String x = JOptionPane.showInputDialog("Digite o id da reserva");
        if((x != null) && (x.length() > 0)){
            new Reserva(x).setVisible(true);
        }else{
            System.out.println("Erro ao pegar reservaID");
        }
        
    }//GEN-LAST:event_btnAlterarReservaActionPerformed

    private void btnCriarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReservaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCriarReservaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            Database.open();
            System.out.println("sucesso");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btnCriarReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva1ActionPerformed
        new Reserva().setVisible(true);
    }//GEN-LAST:event_btnCriarReserva1ActionPerformed

    private void btnCriarReserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReserva2ActionPerformed

    private void btnAlterarReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarReserva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarReserva1ActionPerformed

    private void btnCriarReserva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReserva3ActionPerformed

    private void btnCriarReserva4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReserva4ActionPerformed

    private void btnCriarReserva5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReserva5ActionPerformed

    private void btnCriarReserva6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReserva6ActionPerformed

    private void btnCriarReserva7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReserva7ActionPerformed

    private void btnCriarReserva8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReserva8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarReserva8ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarReserva;
    private javax.swing.JButton btnAlterarReserva1;
    private javax.swing.JButton btnCriarReserva;
    private javax.swing.JButton btnCriarReserva1;
    private javax.swing.JButton btnCriarReserva2;
    private javax.swing.JButton btnCriarReserva3;
    private javax.swing.JButton btnCriarReserva4;
    private javax.swing.JButton btnCriarReserva5;
    private javax.swing.JButton btnCriarReserva6;
    private javax.swing.JButton btnCriarReserva7;
    private javax.swing.JButton btnCriarReserva8;
    // End of variables declaration//GEN-END:variables
}
