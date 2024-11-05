/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.MemberClassRegistration;
import Backend.TrainerRole;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author 20112
 */
public class ViewRegistrations extends javax.swing.JFrame {
private TrainerRole trainerRole;
    ArrayList<MemberClassRegistration> members = new ArrayList<MemberClassRegistration>();
    
    public ViewRegistrations(TrainerRole trainerRole) {        
        this.trainerRole = trainerRole;
        members = trainerRole.getListOfRegistration(); 
        String[] column = {"Member ID", "Class ID", "Registration Date"};
        String[][] data = new String[100][column.length];
        String lineRep;
        int count = 0;
        for(MemberClassRegistration i : members) {
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
        frame.setName("Member Registrations");
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
            .addGap(0, 400, Short.MAX_VALUE)
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
