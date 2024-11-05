package Backend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FirstPage extends JFrame {
    private JButton adminRoleButton;
    private JPanel panel1;
    private JButton trainerRoleButton;
    private JFrame frame;

    public FirstPage() {
        frame = new JFrame("First Page");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250,200));
        frame.setResizable(false);


        //adminRoleButton = new JButton("Admin Role");
        //trainerRoleButton = new JButton("Trainer Role");
        //panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(adminRoleButton);
        panel1.add(trainerRoleButton);
        adminRoleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new LoginPageForAdmin();
            }
        });
        trainerRoleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new LoginPageForTrainer();

            }

        });

        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
