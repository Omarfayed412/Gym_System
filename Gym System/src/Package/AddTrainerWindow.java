package Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTrainerWindow extends JFrame {
    private JPanel panel1 = new JPanel();

    // Initialize fields
    private JTextField idField = new JTextField();
    private JTextField nameField = new JTextField();
    private JTextField emailField = new JTextField();
    private JTextField specialityField = new JTextField();
    private JTextField phoneField = new JTextField();
    private JButton saveButton = new JButton("Save");

    private final AdminRole adminRole; // Reference to AdminRole for adding trainers

    public AddTrainerWindow(AdminRole adminRole) {
        this.adminRole = adminRole; // Initialize adminRole

        panel1.setLayout(new GridLayout(6, 2)); // Use a grid layout for form appearance

        setTitle("Add Trainer");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Add components to panel
        panel1.add(new JLabel("Trainer ID:"));
        panel1.add(idField);

        panel1.add(new JLabel("Name:"));
        panel1.add(nameField);

        panel1.add(new JLabel("Email:"));
        panel1.add(emailField);

        panel1.add(new JLabel("Speciality:"));
        panel1.add(specialityField);

        panel1.add(new JLabel("Phone Number:"));
        panel1.add(phoneField);

        panel1.add(saveButton);

        // Add action listener for save button
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTrainer();
            }
        });

        add(panel1);
        setVisible(true);
    }

    private void addTrainer() {
        String trainerID = idField.getText();
        String name = nameField.getText();
        String email = emailField.getText();
        String speciality = specialityField.getText();
        String phoneNum = phoneField.getText();

        // Use adminRole to add trainer
        if (adminRole.addTrainer(trainerID, name, email, speciality, phoneNum)) {
            JOptionPane.showMessageDialog(this, "Trainer added successfully.");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Trainer already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        emailField.setText("");
        specialityField.setText("");
        phoneField.setText("");
    }
}
