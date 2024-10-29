/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public class Class{
    private String classID;
    private String className;
    private String trainerID;
    private int duration;
    private static int avialableSeats;

    public Class(String classID, String className, String trainerID, int duration) {
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        Class.avialableSeats = avialableSeats;
    }

    

    public static int getAvialableSeats() {
        return avialableSeats;
    }

    public static void setAvialableSeats(int avialableSeats) {
        Class.avialableSeats = avialableSeats;
    }
    
    public String lineRepresentation() {
        return classID + "," + className + "," + trainerID + "," + duration + "," + avialableSeats;
    }
        
        public String getSearchKey() {
        return classID;
    }
    
}
