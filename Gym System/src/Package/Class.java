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
    private String ID;
    private String name;
    private String trainerID;
    private int duration;
    private static int avialableSeats;

    public Class(String ID, String name, String trainerID, int duration) {
        this.ID = ID;
        this.name = name;
        this.trainerID = trainerID;
        this.duration = duration;
    }

    public static int getAvialableSeats() {
        return avialableSeats;
    }

    public static void setAvialableSeats(int avialableSeats) {
        Class.avialableSeats = avialableSeats;
    }
    public String lineRepresentation() {
    
    }
        
    public int getSearchKey() {
    
    }
    
}
