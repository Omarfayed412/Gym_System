/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author DELL-G3
 */
import java.io.*;
import java.util.ArrayList;
import java.io.*;
import java.lang.System;
public abstract class Database<T> implements DatabaseOperations<T> {
    protected ArrayList<T> records;
    protected String filename;

    public Database(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
        readFromFile();
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
    public ArrayList<T> returnAllRecords() {
        return records;
    }

    @Override
    public boolean contains(String key) {
        return records.stream().anyMatch(record -> getKey(record).equals(key));
    }

    @Override
    public void insertRecord(T record) {
        if (!contains(getKey(record))) {
            records.add(record);
        }
    }

    @Override
    public void deleteRecord(String key) {
        records.removeIf(record -> getKey(record).equals(key));
    }

    @Override
    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (T record : records) {
                bw.write(record.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    
    @Override
    public T getRecord(String key) {
        return records.stream().filter(record -> getKey(record).equals(key)).findFirst().orElse(null);
    }

    // Abstract methods to be implemented by subclasses
    protected abstract String getKey(T record);
    //protected abstract String recordToLine(T record);
}
