/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.Member;
import Backend.TrainerRole;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author 20112
 */
public class ViewMembersWindow extends javax.swing.JFrame {
    private TrainerRole trainerRole;
    ArrayList<Member> members = new ArrayList<Member>();
    
    public ViewMembersWindow(TrainerRole trainerRole) {        
        this.trainerRole = trainerRole;
        members = trainerRole.getListOfMembers(); 
        String[] column = {"ID", "Name", "Email", "Membership Type", "Phone Number", "Status"};
        String[][] data = new String[100][column.length];
        String lineRep;
        int count = 0;
        for(Member i : members) {
            lineRep = i.lineRepresentation();
            String[] array = lineRep.split(",");
            for (int k = 0; k < column.length; k++) {
                data[count][k] = array[k];
            }
            count++;
        }
        JTable table=new JTable(data,column);    
        table.setBounds(30,40,800,500);
        JScrollPane scrollpane=new JScrollPane(table); 
        JFrame frame = new JFrame();
        frame.setName("Members");
        frame.add(scrollpane);
        frame.setSize(800,500);    
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
