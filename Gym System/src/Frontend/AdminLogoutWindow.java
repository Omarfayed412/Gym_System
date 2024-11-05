package Frontend;

import Backend.AdminRole;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogoutWindow extends JFrame {
    private JPanel panel1;
    private JButton confirmLogoutButton;
    private JButton cancelButton;
    private AdminRole adminRole; // Reference to AdminRole for logout

    public AdminLogoutWindow(AdminRole adminRole) {
        this.adminRole = adminRole; // Assign the AdminRole instance

        setTitle("Logout");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Initialize components
        panel1 = new JPanel();
        confirmLogoutButton = new JButton("Confirm Logout");
        cancelButton = new JButton("Cancel");

        // Add components to the panel
        panel1.add(new JLabel("Are you sure you want to logout?"));
        panel1.add(confirmLogoutButton);
        panel1.add(cancelButton);

        // Action listener for the confirm logout button
        confirmLogoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminRole.logout(); // Call logout method from AdminRole
                JOptionPane.showMessageDialog(AdminLogoutWindow.this, "Logged out successfully.");
                dispose(); // Close the logout window
            }
        });

        // Action listener for the cancel button
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the window without logging out
            }
        });

        // Add panel to the frame and make it visible
        add(panel1);
        setVisible(true);
    }
}
