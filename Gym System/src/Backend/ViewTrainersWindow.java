package Backend;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewTrainersWindow extends JFrame {
    private JPanel panel1;
    private JList<String> trainersList; // A list to display trainers
    private DefaultListModel<String> listModel; // Model for the JList
    private JButton closeButton; // Button to close the window
    private AdminRole adminRole; // Reference to AdminRole for fetching trainers

    public ViewTrainersWindow(AdminRole adminRole) {
        this.adminRole = adminRole; // Assign the AdminRole instance
        setTitle("View Trainers");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Initialize components
        panel1 = new JPanel();
        listModel = new DefaultListModel<>();
        trainersList = new JList<>(listModel);
        closeButton = new JButton("Close");

        // Fetch the list of trainers and populate the JList
        populateTrainersList();

        // Set layout and add components to the panel
        panel1.setLayout(new BorderLayout());
        panel1.add(new JScrollPane(trainersList), BorderLayout.CENTER); // Scroll pane for the list
        panel1.add(closeButton, BorderLayout.SOUTH); // Close button at the bottom

        // Add action listener to the close button
        closeButton.addActionListener(e -> dispose()); // Close the window on button click

        // Add the panel to the frame
        add(panel1);
        setVisible(true); // Make the window visible
    }

    // Method to populate the list of trainers from the AdminRole
    private void populateTrainersList() {
        ArrayList<Trainer> trainers = adminRole.getListOfTrainers();
        if (trainers != null) {
            for (Trainer trainer : trainers) {
                listModel.addElement(trainer.lineRepresentation()); // Add each trainer's representation to the model
            }
        } else {
            listModel.addElement("No trainers available."); // Message if no trainers exist
        }
    }

}
