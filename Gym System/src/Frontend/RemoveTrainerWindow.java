package Frontend;

import Backend.AdminRole;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveTrainerWindow extends JFrame {
    private JPanel panel1;
    private JTextField idField;
    private JButton removeButton;
    private AdminRole adminRole;

    public RemoveTrainerWindow(AdminRole adminRole) {
        this.adminRole = adminRole;

        setTitle("Remove Trainer");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));

        panel1.add(new JLabel("Trainer ID:"));
        idField = new JTextField();
        panel1.add(idField);

        removeButton = new JButton("Remove Trainer");
        panel1.add(removeButton);
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTrainer();
            }
        });

        add(panel1);
        setVisible(true);
    }

    private void removeTrainer() {
        String trainerID = idField.getText();
        if (AdminRole.removeTrainer(trainerID)) {
            JOptionPane.showMessageDialog(this, "Trainer removed successfully.");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Trainer not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        idField.setText("");
    }
}
