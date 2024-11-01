/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public class ClassDatabase extends TrainerDatabase{

    public ClassDatabase(String fileName) {
        super(fileName);
    }
<<<<<<< Updated upstream
    //Override all methods here
=======

    @Override
    public Record createRecordFrom(String line) {
        String ID = null, name = null, trainerId = null;
        int duration = 0;
        String[] words = line.split(line);
        for (int i = 0; i <= words.length - 1; i++) {
            switch (i) {
                case 0 -> ID = words[i];
                case 1 -> name = words[i];
                case 2 -> trainerId = words[i];
                case 3 -> duration = Integer.parseInt(words[i]);
            }
        }
        
        Class_S c = new Class_S(ID, name, trainerId, duration);
        return c;
    }
    
>>>>>>> Stashed changes
}
