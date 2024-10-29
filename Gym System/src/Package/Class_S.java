/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public class Class_S extends Person{
    private String trainerID;
    private int duration;
    private int avialableSeats;

    public Class_S(String ID, String name, String trainerID, int duration) {
        super(ID, name);
        this.trainerID = trainerID;
        this.duration = duration;
    }

    public int getAvialableSeats() {
        return this.avialableSeats;
    }

    public void setAvialableSeats(int avialableSeats) {
        if (avialableSeats > 0) { 
            this.avialableSeats = avialableSeats;
        }
        else System.out.println("Invalid number of seats entered.");
    }
    
    @Override
    public String lineRepresentation() {
        return super.lineRepresentation()+ "," + this.trainerID + "," + this.duration + "," + this.avialableSeats;
    }       
}
