/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;

/**
 * Github: https://github.com/Omarfayed412/Gym_System
 * @author 20112
 */
public class AdminRole{
    private static final TrainerDatabase database = new TrainerDatabase("D:\\Software\\OOP_JAVA\\Gym_System\\Gym System\\TestData\\Trainers.txt");
      
    public AdminRole() {
        database.readFromFile();
    }
    
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
        if (database.returnAllRecords() == null) {
            System.out.println("Error: No members yet");
            return null;
        }
        ArrayList<Trainer> trainers = new ArrayList<Trainer>();
        for (Record i : database.returnAllRecords()) {
            trainers.add((Trainer)i);
        }
        return trainers;
    }
    
    public static boolean removeTrainer(String ID) {
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
