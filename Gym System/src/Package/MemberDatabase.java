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

import java.io.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.lang.reflect.Method;
import java.lang.System;

public class MemberDatabase  {
    private ArrayList<Member> records;
    private String filename;

    // Constructor initializing the database with a filename
    public MemberDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
        readFromFile(); // Load data from file upon initialization
    }

    // Reads all records from the file and loads them into the records list
    private void readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                Member record = createRecordFrom(line);
                if (record != null) {
                    records.add(record);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    // Creates a Member object from a line in the file
    private Member createRecordFrom(String line) {
        try {
            String[] parts = line.split(", ");
            if (parts.length != 6) return null; // Assuming 6 fields for Member

            String membershipType = parts[0];
            String phoneNumber = parts[1];
            String status = parts[2];
            String ID = parts[3];
            String name = parts[4];
            String email = parts[5];

            return new Member(membershipType, phoneNumber, status, ID, name, email);
        } catch (Exception e) {
            System.out.println("Error parsing line: " + line);
            return null;
        }
    }

    // Returns all records in the database
    public ArrayList<Member> returnAllRecords() {
        return new ArrayList<>(records);
    }

    // Checks if a member with the given memberID exists in the records list
    public boolean contains(String memberID) {
        for (Member record : records) {
            if (getKey(record).equals(memberID)) {
                return true;
            }
        }
        return false;
    }

    // Retrieves a Member by its ID
    public Member getRecord(String memberID) {
        for (Member record : records) {
            if (getKey(record).equals(memberID)) {
                return record;
            }
        }
        return null;
    }

    // Inserts a new Member into records if it doesn't already exist
    public void insertRecord(Member record) {
        if (!contains(getKey(record))) {
            records.add(record);
        } else {
            System.out.println("Record already exists for memberID: " + getKey(record));
        }
    }

    // Deletes a record based on memberID
    public void deleteRecord(String memberID) {
        records.removeIf(record -> getKey(record).equals(memberID));
    }

    // Writes the records list to the file
    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Member record : records) {
                bw.write(record.lineRepresentation());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Retrieves the unique key for a Member object
    protected String getKey(Member record) {
        try {
            Method method = record.getClass().getDeclaredMethod("getMemberID");
            method.setAccessible(true); // Allow access to the protected method
            return (String) method.invoke(record);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Handle the case where reflection fails
        }
    }
}