/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.TrainerRole;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 20112
 */
public class AddRegistrationWindow extends javax.swing.JFrame {
    private TrainerRole trainerRole;

    /**
     * Creates new form AddRegistrationWindow
     */
    public AddRegistrationWindow(TrainerRole trainerRole) {
        initComponents();
        this.trainerRole = trainerRole;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mmbrIDLbl = new java.awt.Label();
        memberIDText = new javax.swing.JTextField();
        classIDLbl1 = new java.awt.Label();
        classIDText = new javax.swing.JTextField();
        dateLbl = new java.awt.Label();
        addBtn = new javax.swing.JButton();
        dateText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mmbrIDLbl.setAlignment(java.awt.Label.CENTER);
        mmbrIDLbl.setBackground(new java.awt.Color(204, 255, 204));
        mmbrIDLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mmbrIDLbl.setText("Member ID");

        memberIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberIDTextActionPerformed(evt);
            }
        });

        classIDLbl1.setAlignment(java.awt.Label.CENTER);
        classIDLbl1.setBackground(new java.awt.Color(204, 255, 204));
        classIDLbl1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        classIDLbl1.setText("Class ID");

        classIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classIDTextActionPerformed(evt);
            }
        });

        dateLbl.setAlignment(java.awt.Label.CENTER);
        dateLbl.setBackground(new java.awt.Color(204, 255, 204));
        dateLbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dateLbl.setText("Date");

        addBtn.setBackground(new java.awt.Color(0, 0, 0));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        dateText.setText("(YYYY-MM-DD)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(classIDLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(classIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mmbrIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(memberIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateText))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memberIDText)
                    .addComponent(mmbrIDLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classIDText)
                    .addComponent(classIDLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(dateText))
                .addGap(34, 34, 34)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberIDTextActionPerformed

    private void classIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classIDTextActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String memberId = memberIDText.getText();
        String classID = classIDText.getText();
        String date = dateText.getText();
     
        if (memberId.isEmpty() || classID.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            String[] datearr = date.split("-");
            if (Integer.parseInt(datearr[1]) > 12 ||  Integer.parseInt(datearr[1]) < 1) {
                JOptionPane.showMessageDialog(this, "Please enter a valid month date.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return ;
            }
            
            if (Integer.parseInt(datearr[2]) > 31 ||  Integer.parseInt(datearr[2]) < 1) {
                JOptionPane.showMessageDialog(this, "Please enter a valid day date.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return ;
            }
            
            if (trainerRole.registerMemberForClass(memberId, classID, LocalDate.parse(date))) {
                JOptionPane.showMessageDialog(this, "Member successfully registered.");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Class has no available seats", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private java.awt.Label classIDLbl1;
    private javax.swing.JTextField classIDText;
    private java.awt.Label dateLbl;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField memberIDText;
    private java.awt.Label mmbrIDLbl;
    // End of variables declaration//GEN-END:variables
    private void clearFields() {
            classIDText.setText("");        
            dateText.setText("");
            memberIDText.setText("");
        }
}
