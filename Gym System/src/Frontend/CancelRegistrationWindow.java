/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.TrainerRole;
import javax.swing.JOptionPane;

/**
 *
 * @author 20112
 */
public class CancelRegistrationWindow extends javax.swing.JFrame {
    private TrainerRole trainerRole;
    
    public CancelRegistrationWindow(TrainerRole trainerRole) {
        initComponents();
        this.trainerRole = trainerRole;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mmbrID = new java.awt.Label();
        mmbrIDText = new javax.swing.JTextField();
        classIDLbl = new java.awt.Label();
        classIDText = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mmbrID.setAlignment(java.awt.Label.CENTER);
        mmbrID.setBackground(new java.awt.Color(204, 255, 204));
        mmbrID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mmbrID.setText("Member ID");

        mmbrIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmbrIDTextActionPerformed(evt);
            }
        });

        classIDLbl.setAlignment(java.awt.Label.CENTER);
        classIDLbl.setBackground(new java.awt.Color(204, 255, 204));
        classIDLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        classIDLbl.setText("Class ID");

        classIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classIDTextActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(0, 0, 0));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        returnBtn.setBackground(new java.awt.Color(0, 0, 0));
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(classIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(classIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mmbrID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(mmbrIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mmbrID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mmbrIDText))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classIDLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classIDText))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmbrIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmbrIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmbrIDTextActionPerformed

    private void classIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classIDTextActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        String memberId = mmbrIDText.getText();
        String classID = classIDText.getText();
        
        if (memberId.isEmpty() || classID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            if (trainerRole.cancelRegistration(memberId, classID)) {
                JOptionPane.showMessageDialog(this, "The member with ID = " + memberId + " has been unregistered from class " + classID);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Couldn't cancel registration.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        TrainerRoleWindow win = new TrainerRoleWindow();
        win.setVisible(true);
    }//GEN-LAST:event_returnBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private java.awt.Label classIDLbl;
    private javax.swing.JTextField classIDText;
    private java.awt.Label mmbrID;
    private javax.swing.JTextField mmbrIDText;
    private javax.swing.JButton returnBtn;
    // End of variables declaration//GEN-END:variables
    private void clearFields() {
                classIDText.setText("");        
                mmbrIDText.setText("");
            }
}
