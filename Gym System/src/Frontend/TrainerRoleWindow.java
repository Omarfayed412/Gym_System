/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;
/**
 *
 * @author 20112
 */
import Backend.TrainerRole;

public class TrainerRoleWindow extends javax.swing.JFrame {
    private TrainerRole trainerRole = new TrainerRole();
    /**
     * Creates new form TrainerRoleWindow
     */
    public TrainerRoleWindow() {
        
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

        AddMemberBtn2 = new javax.swing.JButton();
        viewClassesBtn1 = new javax.swing.JButton();
        viewMembersBtn = new javax.swing.JButton();
        AddMemberBtn = new javax.swing.JButton();
        viewClassesBtn = new javax.swing.JButton();
        addClassBtn = new javax.swing.JButton();
        registerMemberClassBtn = new javax.swing.JButton();
        cancelRegistrationBtn = new javax.swing.JButton();
        viewRgistrationsBtn = new javax.swing.JButton();
        logaoutBtn = new javax.swing.JButton();

        AddMemberBtn2.setBackground(new java.awt.Color(0, 0, 0));
        AddMemberBtn2.setForeground(new java.awt.Color(255, 255, 255));
        AddMemberBtn2.setText("Add Member");
        AddMemberBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberBtn2ActionPerformed(evt);
            }
        });

        viewClassesBtn1.setBackground(new java.awt.Color(0, 0, 0));
        viewClassesBtn1.setForeground(new java.awt.Color(255, 255, 255));
        viewClassesBtn1.setText("View Classes");
        viewClassesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassesBtn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trainer Role");

        viewMembersBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewMembersBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewMembersBtn.setText("View Members");
        viewMembersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMembersBtnActionPerformed(evt);
            }
        });

        AddMemberBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddMemberBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddMemberBtn.setText("Add Member");
        AddMemberBtn.setBorder(null);
        AddMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberBtnActionPerformed(evt);
            }
        });

        viewClassesBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewClassesBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewClassesBtn.setText("View Classes");
        viewClassesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassesBtnActionPerformed(evt);
            }
        });

        addClassBtn.setBackground(new java.awt.Color(0, 0, 0));
        addClassBtn.setForeground(new java.awt.Color(255, 255, 255));
        addClassBtn.setText("Add Class");
        addClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassBtnActionPerformed(evt);
            }
        });

        registerMemberClassBtn.setBackground(new java.awt.Color(0, 0, 0));
        registerMemberClassBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerMemberClassBtn.setText("Register Member for Class");
        registerMemberClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMemberClassBtnActionPerformed(evt);
            }
        });

        cancelRegistrationBtn.setBackground(new java.awt.Color(0, 0, 0));
        cancelRegistrationBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelRegistrationBtn.setText("Cancel Regstration");
        cancelRegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegistrationBtnActionPerformed(evt);
            }
        });

        viewRgistrationsBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewRgistrationsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewRgistrationsBtn.setText("View Registrations");
        viewRgistrationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRgistrationsBtnActionPerformed(evt);
            }
        });

        logaoutBtn.setBackground(new java.awt.Color(0, 0, 0));
        logaoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logaoutBtn.setText("Logout");
        logaoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logaoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logaoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewRgistrationsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelRegistrationBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewMembersBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addClassBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewClassesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registerMemberClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddMemberBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AddMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewMembersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewClassesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerMemberClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelRegistrationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewRgistrationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logaoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewMembersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMembersBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewMembersWindow member = new ViewMembersWindow(trainerRole);
        member.setVisible(true);
    }//GEN-LAST:event_viewMembersBtnActionPerformed

    private void AddMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        addMemberWindow addmember = new addMemberWindow(trainerRole);
        addmember.setVisible(true);
    }//GEN-LAST:event_AddMemberBtnActionPerformed

    private void AddMemberBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberBtn2ActionPerformed

    private void viewClassesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewClassesWindow classs = new ViewClassesWindow(trainerRole);
        classs.setVisible(true);
    }//GEN-LAST:event_viewClassesBtnActionPerformed

    private void addClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        AddClassWindow classs = new AddClassWindow(trainerRole);
        classs.setVisible(true);
    }//GEN-LAST:event_addClassBtnActionPerformed

    private void viewClassesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassesBtn1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewClassesBtn1ActionPerformed

    private void registerMemberClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMemberClassBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        AddRegistrationWindow reg = new AddRegistrationWindow(trainerRole);
        reg.setVisible(true);
    }//GEN-LAST:event_registerMemberClassBtnActionPerformed

    private void cancelRegistrationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegistrationBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        CancelRegistrationWindow cancel = new CancelRegistrationWindow(trainerRole);
        cancel.setVisible(true);
    }//GEN-LAST:event_cancelRegistrationBtnActionPerformed

    private void viewRgistrationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRgistrationsBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewRegistrations reg = new ViewRegistrations(trainerRole);
        reg.setVisible(true);
    }//GEN-LAST:event_viewRgistrationsBtnActionPerformed

    private void logaoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logaoutBtnActionPerformed
        // TODO add your handling code here:
        trainerRole.logout();
        dispose();
    }//GEN-LAST:event_logaoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMemberBtn;
    private javax.swing.JButton AddMemberBtn2;
    private javax.swing.JButton addClassBtn;
    private javax.swing.JButton cancelRegistrationBtn;
    private javax.swing.JButton logaoutBtn;
    private javax.swing.JButton registerMemberClassBtn;
    private javax.swing.JButton viewClassesBtn;
    private javax.swing.JButton viewClassesBtn1;
    private javax.swing.JButton viewMembersBtn;
    private javax.swing.JButton viewRgistrationsBtn;
    // End of variables declaration//GEN-END:variables
}
