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
public class TrainerDatabase {
    private final List<Trainer> records;
    private final String filename;

    public TrainerDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
        //readFromFile();
    }


    public void readFromFile() {
        records.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Trainer trainer = createRecordFrom(line);
                if (trainer != null) {
                    records.add(trainer);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
    }


    public Trainer createRecordFrom(String line) {
        String[] data = line.split(", ");
        if (data.length == 5) {
            String id = data[0];
            String name = data[1];
            String email = data[2];
            String speciality = data[3];
            String phoneNum = data[4];
            return new Trainer(id, name, email, speciality, phoneNum);
        }
        return null;
    }

    public List<Trainer> returnAllRecords() {
        return records;
    }


    public boolean contains(String key) {
        return records.stream().anyMatch(trainer -> trainer.getSearchKey().equals(key));
    }


    public Trainer getRecord(String key) {
        return records.stream()
                .filter(trainer -> trainer.getSearchKey().equals(key))
                .findFirst()
                .orElse(null);
    }

    public void insertRecord(Trainer record) {
        if (!contains(record.getSearchKey())) {
            records.add(record);
        } else {
            System.out.println("Trainer with that ID already exists.");
        }
    }


    public void deleteRecord(String key) {
        records.removeIf(trainer -> trainer.getSearchKey().equals(key));
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Trainer trainer : records) {
                writer.write(trainer.lineRepresentation());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file");
}
    }
}