package Backend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageForTrainer extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPageForTrainer() {
        setTitle("Trainer Login Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(250, 200));
        setResizable(false);

        // Initialize components
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        button1 = new JButton("Login");

        // Add components to panel
        panel1.add(new JLabel("Username:"));
        panel1.add(usernameField);
        panel1.add(new JLabel("Password:"));
        panel1.add(passwordField);
        panel1.add(button1);

        // Action listener for login button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals(LoginCredentials.TRAINER_USERNAME) &&
                        password.equals(LoginCredentials.TRAINER_PASSWORD)) {
                    dispose();  // Close login frame
//                    openTrainerRoleWindow();
                } else {
                    JOptionPane.showMessageDialog(LoginPageForTrainer.this, "Invalid credentials. Please try again.",
                            "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add panel to frame
        add(panel1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

//    private void openTrainerRoleWindow() {
//        JFrame trainerFrame = new JFrame("Trainer Role");
//        trainerFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        trainerFrame.setSize(400, 300);
//        trainerFrame.setLocationRelativeTo(null);
//        trainerFrame.setVisible(true);
//    }

//    public static void main(String[] args) {
//        new LoginPageForTrainer(); // Run for testing purposes
//    }
}
