/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;

/**
 *
 * @author 20112
 */
public class AdminRole{
    private TrainerDatabase database;

    public boolean addTrainer(String trainerID, String name, String email, String speciality, String phoneNum) {
        if (!database.contains(trainerID)) {
            Trainer newTrainer = new Trainer(trainerID, name, email, speciality, phoneNum);
            database.insertRecord((Trainer) newTrainer);
            System.out.println("Trainer added successfully.");
            return true;
        } else {
            System.out.println("Trainer already exists.");
        }
        return false;
    }
    
    public ArrayList<Trainer> getListOfTrainers() {
        ArrayList<Record> records = database.returnAllRecords();
        ArrayList<Trainer> trainers = null;
        for (Record i : records) {
            trainers.add((Trainer)i);
        }
        return trainers;
    }
    
    public boolean removeTrainer(String ID) {
        if (database.contains(ID)) {
            database.deleteRecord(ID);
            System.out.println("Trainer has been removed.");
            return true;
        } else {
            System.out.println("Trainer not found.");
            return false;
        }
    }
    
    public void logout() {
        database.saveToFile();
        System.out.println("Data saved successfully.\nLogged out.");
    }
}
