/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
  * Github: https://github.com/Omarfayed412/Gym_System
 * @author 20112
 */
public abstract class Database {
    private final String fileName;
    private ArrayList<Record> records;
    
    public Database(String fileName) {
        this.fileName = fileName;
        this.records = new ArrayList<>();
    }
    
    public boolean readFromFile() {
        try {
            File myFile = new File(fileName);
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if(line.isEmpty()) continue;
                else{
                    Record myRecord = createRecordFrom(line);
                    if (myRecord != null){ 
                        this.records.add(myRecord);
                    }
                    else System.out.println("Record is null.");
                }
            }            
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            return false;
        }
        return true;
    }
    
    public abstract Record createRecordFrom(String line);
    
    //Needs to be casted in each class
    public  ArrayList<Record> returnAllRecords() {
        return this.records;
    }
    
    public boolean contains(String key) {
        for (Record i : this.records) {
            if(i.getSearchKey().equalsIgnoreCase(key)) return true;
        }
        return false;
    }
    
    public Record getRecord(String key) {
         for (Record i : records) {
            if(i.getSearchKey().equalsIgnoreCase(key)) {
                return i;
            }
        }
        return null;
    }
    
    public boolean insertRecord(Record myRecord) {
        if(myRecord != null) {
            if (contains(myRecord.getSearchKey())) {
                System.out.println("Error: Object Exists.");
                return false;
            }
            else {
                records.add(myRecord);
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteRecord(String key) {
        if (contains(key)) {
            Record record = getRecord(key);
            this.records.remove(record);
            return true;
        }
        return false;
    }
    
    public void saveToFile() {
        try {
            FileWriter myFile = new FileWriter(this.fileName);
            for(Record i : records) {
                myFile.write(i.lineRepresentation());
                myFile.write("\n");
            }
            myFile.close();
        }
        catch (IOException e) {
            System.out.println("Error: File not found.");
        }        
    }
}
