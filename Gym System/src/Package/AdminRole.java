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
 * @author 20112
 */
public class AdminRole{
    private TrainerDatabase database;

    public AdminRole() {
        this.database = new TrainerDatabase("Trainers.txt");
        database.readFromFile();
    }
    
    
    public void addTrainer(String trainerID, String name, String email, String speciality, String phoneNum) {
        if (!database.contains(trainerID)) {
            Trainer newTrainer = new Trainer(trainerID, name, email, speciality, phoneNum);
            database.insertRecord(newTrainer);
            System.out.println("Trainer added successfully.");
        } else {
            System.out.println("Trainer already exists.");
        }
      
    
    }
    
    public List<Trainer> getListOfTrainers() {
        return database.returnAllRecords();
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
        System.out.println("Saved and logged out.");
    }
}
