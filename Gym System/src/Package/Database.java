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
    //private ArrayList<> records;
    public Database(String fileName) {
        this.fileName = fileName;
    }
    
    public boolean readFromFile(String fileName) {
        try {
            File myFile = new File(fileName);
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                
            }
        }
        catch(FileNotFoundException e) {
            
        }
    }
}
