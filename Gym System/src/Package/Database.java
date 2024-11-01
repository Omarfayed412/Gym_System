/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 20112
 */
public class Database {
    private final String fileName;
<<<<<<< Updated upstream
    //private ArrayList<> records;
=======
    private ArrayList<Record> records;
>>>>>>> Stashed changes
    public Database(String fileName) {
        this.fileName = fileName;
    }
    
    public boolean readFromFile(String fileName) {
        try {
            File myFile = new File(fileName);
            Scanner scanner = new Scanner(myFile);
<<<<<<< Updated upstream
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                
            }
        }
        catch(FileNotFoundException e) {
            
        }
=======
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if(line.isEmpty()) ;
                else{
                    Record myRecord = createRecordFrom(line);
                    if (myRecord != null){ 
                        records.add(myRecord);
                    }
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
        return records;
    }
    
    public boolean contains(String key) {
        for (Record i : records) {
            if(i.getSearchKey().equalsIgnoreCase(key)) return true;
            else {
                System.out.println("Object not found!!");
            }
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
            records.remove(record);
            return true;
        }
        return false;
    }
    
    public void saveToFile() {
        try {
            FileWriter myFile = new FileWriter(this.fileName);
            for(Record i : records) {
                myFile.write(i.lineRepresentation());
            }
            myFile.close();
        }
        catch (IOException e) {
            System.out.println("Error: File not found.");
        }        
>>>>>>> Stashed changes
    }
}
