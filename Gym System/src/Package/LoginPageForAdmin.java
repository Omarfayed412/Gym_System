package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageForAdmin extends JFrame{
    private JPasswordField passwordField;
    private JPanel panel1;
    private JFormattedTextField usernameField;
    private JButton button1;
    private JFrame frame2;


    public LoginPageForAdmin(){
        frame2 = new JFrame("login Frame For Admin");
        frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame2.setPreferredSize(new Dimension(250,200));
        frame2.setResizable(false);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals(LoginCredentials.ADMIN_USERNAME) &&
                        password.equals(LoginCredentials.ADMIN_PASSWORD)) {
                    frame2.setVisible(false);
                } else {

                    JOptionPane.showMessageDialog(frame2, "Invalid credentials. Please try again.",
                            "Login Failed", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        frame2.add(panel1);
        frame2.pack();
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    }
//    private void openAdminRoleWindow() {
//        JFrame adminFrame = new JFrame("Admin Role");
//        adminFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        adminFrame.setSize(400, 300);
//        adminFrame.setLocationRelativeTo(null);
//        adminFrame.setVisible(true);
//    }


}
