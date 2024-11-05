package Package;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminRoleWindow extends JFrame {

    private JButton AddTrainer;
    private JPanel panel1;
    private JButton RemoveTrainer;
    private JButton ViewTrainers;
    private JButton Logout;

    private AdminRole adminRole; // Reference to AdminRole for database operations

    public AdminRoleWindow(AdminRole adminRole) { // Pass AdminRole to constructor
        this.adminRole = adminRole; // Initialize adminRole

        setContentPane(panel1);
        setTitle("Admin Role Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Action listener for Add Trainer button
        AddTrainer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddTrainerWindow();
            }
        });

        // Action listener for Remove Trainer button
        RemoveTrainer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRemoveTrainerWindow();
            }
        });

        // Action listener for View Trainers button
        ViewTrainers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openViewTrainersWindow();
            }
        });

        // Action listener for Logout button
        Logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openLogoutWindow();
            }
        });

        setVisible(true);
    }

    private void openAddTrainerWindow() {
        new AddTrainerWindow(adminRole); // Pass adminRole to AddTrainerWindow
    }

    private void openRemoveTrainerWindow() {
        JOptionPane.showMessageDialog(this, "Remove Trainer functionality");
    }

    private void openViewTrainersWindow() {
        JOptionPane.showMessageDialog(this, "View Trainers functionality");
    }

    private void openLogoutWindow() {
        JOptionPane.showMessageDialog(this, "Logout functionality");
        dispose(); // Close the window
    }

    // Uncomment the main method for testing
    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> new AdminRoleWindow(new AdminRole()));
    // }
}
