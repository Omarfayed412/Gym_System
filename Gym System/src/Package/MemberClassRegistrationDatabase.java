/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
import java.io.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.lang.System;
public class MemberClassRegistrationDatabase {

    private ArrayList<MemberClassRegistration> records;
    private String filename;

    public MemberClassRegistrationDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
        readFromFile(); // Load data from file upon initialization
    }

    // Reads all records from the file and loads them into the records list
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

    // Converts a line from the file into a MemberClassRegistration object
    public MemberClassRegistration createRecordFrom(String line) {
        String[] parts = line.split(", ");
        String memberID = parts[0];
        String classID = parts[1];
        LocalDate registrationDate = LocalDate.parse(parts[2]);
        String status = parts[3];

        return new MemberClassRegistration(memberID, classID, status, registrationDate);
    }

    // Returns all registration records in the database
    public ArrayList<MemberClassRegistration> returnAllRecords() {
        return new ArrayList<>(records);
    }

    // Checks if a registration with the given key exists in the records list
    public boolean contains(String key) {
        for (MemberClassRegistration record : records) {
            if (getKey(record).equals(key)) {
                return true;
            }
        }
        return false;
    }

    // Retrieves a MemberClassRegistration by its unique search key (memberID + classID)
    public MemberClassRegistration getRecord(String key) {
        for (MemberClassRegistration record : records) {
            if (getKey(record).equals(key)) {
                return record;
            }
        }
        return null;
    }

    // Inserts a new MemberClassRegistration into records if it doesn't already exist
    public void insertRecord(MemberClassRegistration record) {
        if (!contains(getKey(record))) {
            records.add(record);
        } else {
            System.out.println("Record already exists for member ID and class ID combination: " + getKey(record));
        }
    }

    // Deletes a record based on memberID + classID key
    public void deleteRecord(String key) {
        records.removeIf(record -> getKey(record).equals(key));
    }

    // Saves the current records list to the file
    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (MemberClassRegistration record : records) {
                bw.write(record.lineRepresentation());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Retrieves the unique key for a MemberClassRegistration object
    private String getKey(MemberClassRegistration record) {
        return record.getSearchKey();
    }
}