/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author DELL-G3
 */
import java.util.ArrayList;
public interface DatabaseOperations<T> {
    void readFromFile();
    T createRecordFrom(String line);
    ArrayList<T> returnAllRecords();
    boolean contains(String key);
    T getRecord(String key);
    void saveToFile();
    void insertRecord(T record);
    void deleteRecord(String key);
    
}
