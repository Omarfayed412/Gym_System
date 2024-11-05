package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageForAdmin extends JFrame {
    private JPasswordField passwordField;

    // Initialize panel and components
    private JPanel panel1;
    private JTextField usernameField; // Change to JTextField for standard username input
    private JButton button1;

    public LoginPageForAdmin() {
        // Initialize frame
        setTitle("Login Frame For Admin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 200));
        setResizable(false);

        panel1.setLayout(new GridLayout(3, 2)); // Use grid layout for better organization

        // Add components
        panel1.add(new JLabel("Username:"));
        panel1.add(usernameField);

        panel1.add(new JLabel("Password:"));
        panel1.add(passwordField);

        panel1.add(button1);

        // Add action listener for the login button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals(LoginCredentials.ADMIN_USERNAME) &&
                        password.equals(LoginCredentials.ADMIN_PASSWORD)) {
                    dispose(); // Close the login frame
                    new AdminRoleWindow(new AdminRole()); // Pass AdminRole to AdminRoleWindow
                } else {
                    JOptionPane.showMessageDialog(LoginPageForAdmin.this,
                            "Invalid credentials. Please try again.",
                            "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Finalize frame setup
        add(panel1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginPageForAdmin::new);
    }
}
