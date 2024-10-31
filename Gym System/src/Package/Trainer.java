/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
  * Github: https://github.com/Omarfayed412/Gym_System

 * @author 20112
 */
public class Trainer extends Person{
    private final String speciality;
    private final String phoneNumber;
    private final String email;
    public Trainer(String ID, String name, String email, String speciality, String phoneNumber) {
        super(ID, name);
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String lineRepresentation() {
        return super.lineRepresentation()+ "," + this.email + "," + this.speciality + "," + this.phoneNumber;
    }
    
}
