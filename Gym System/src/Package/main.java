/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;
import java.util.*;
import java.io.*;
import java.lang.System;
/**
 *
 * @author DELL-G3
 */
public class main {
    public static void main(String[] args) {
        TrainerDatabase trainerDatabase = new TrainerDatabase("Trainers.txt");

        // Read existing records from file (if any)
        trainerDatabase.readFromFile();

        // Test inserting new Trainer records
        Trainer trainer1 = new Trainer("T1001", "John Smith", "john@example.com", "Yoga", "0123456789");
        Trainer trainer2 = new Trainer("T1002", "Jane Doe", "jane@example.com", "Strength Training", "0987654321");

        trainerDatabase.insertRecord(trainer1);
        trainerDatabase.insertRecord(trainer2);

        // Retrieve all records and print them
        List<Trainer> allRecords = trainerDatabase.returnAllRecords();  // Changed to List<Trainer>
        System.out.println("All trainers after insertion:");
        for (Trainer trainer : allRecords) {
            System.out.println(trainer.lineRepresentation());
        }
        


        // Check if a trainer with ID T1001 exists
        System.out.println("\nContains T1001: " + trainerDatabase.contains("T1001"));

        // Fetch and print details of trainer with ID T1001
        Trainer fetchedTrainer = trainerDatabase.getRecord("T1001");
        System.out.println("\nFetched Trainer (T1001):");
        System.out.println(fetchedTrainer != null ? fetchedTrainer.lineRepresentation() : "Trainer not found");

        // Delete a trainer and verify deletion
        trainerDatabase.deleteRecord("T1001");
        System.out.println("\nAll trainers after deletion of T1001:");
        allRecords = trainerDatabase.returnAllRecords();
        for (Trainer trainer : allRecords) {
            System.out.println(trainer.lineRepresentation());
        }

        // Save changes back to file
        trainerDatabase.saveToFile();

        // Verify file writing by clearing current records and reloading from file
        System.out.println("\nReloading trainers from file:");
        trainerDatabase.readFromFile();
        allRecords = trainerDatabase.returnAllRecords();
        for (Trainer trainer : allRecords) {
            System.out.println(trainer.lineRepresentation());
        }
    }
}

