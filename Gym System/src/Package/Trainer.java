/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public class Trainer extends Person{
    private String speciality;
    private final String phoneNumber;

    public Trainer(String ID, String name, String email, String speciality,String phoneNumber) {
        super(ID, name, email);
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String lineRepresentation() {
        return LineRepresentationForPerson()+ speciality + "," + phoneNumber;
    }
    
}
