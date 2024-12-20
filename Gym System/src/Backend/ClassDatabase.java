/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 * Github: https://github.com/Omarfayed412/Gym_System
 * @author 20112
 */
public class ClassDatabase extends Database{

    public ClassDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public Class_S createRecordFrom(String line) {
        String ID = null, name = null, trainerId = null;
        int duration = 0;
        int availableSeats = 0;
        String[] words = line.split(",");
        for (int i = 0; i <= words.length - 1; i++) {
            switch (i) {
                case 0 -> ID = words[i];
                case 1 -> name = words[i];
                case 2 -> trainerId = words[i];
                case 3 -> duration = Integer.parseInt(words[i]);
                case 4 -> availableSeats = Integer.parseInt(words[i]);
            }
        }
        
        Class_S c = new Class_S(ID, name, trainerId, duration);
        c.setAvialableSeats(availableSeats);
        return c;
    }
    
}
