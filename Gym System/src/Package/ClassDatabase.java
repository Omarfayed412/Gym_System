/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
import java.lang.System;
import java.io.*;
import java.util.ArrayList;

public class ClassDatabase  extends Database<Class>{

    private ArrayList<Class> records;
    private String filename;

    public ClassDatabase(String filename) {
        super(filename);
        this.filename = filename;
        this.records = new ArrayList<>();
        readFromFile(); // Load data from file on initialization
    }

    @Override
    public void readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(createRecordFrom(line));
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    @Override
    public Class createRecordFrom(String line) {
        String[] parts = line.split(",");
        String classID = parts[0];
        String className = parts[1];
        String trainerID = parts[2];
        int duration = Integer.parseInt(parts[3]);
        int availableSeats = Integer.parseInt(parts[4]);

        // Set static available seats based on data
        Class.setAvialableSeats(availableSeats);

        return new Class(classID, className, trainerID, duration);
    }

    @Override
    public ArrayList<Class> returnAllRecords() {
        return new ArrayList<>(records);
    }

    @Override
    public boolean contains(String key) {
        for (Class record : records) {
            if (getKey(record).equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Class getRecord(String key) {
        for (Class record : records) {
            if (getKey(record).equals(key)) {
                return record;
            }
        }
        return null;
    }

    @Override
    public void insertRecord(Class record) {
        if (!contains(record.getSearchKey())) {
            records.add(record);
        } else {
            System.out.println("Record with ID " + record.getSearchKey() + " already exists.");
        }
    }

    @Override
    public void deleteRecord(String key) {
        records.removeIf(record -> getKey(record).equals(key));
    }

    @Override
    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Class record : records) {
                bw.write(record.lineRepresentation());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    @Override
    protected String getKey(Class record) {
        return record.getSearchKey();
    }
}
