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

    public Trainer(String ID, String name, String email, String phoneNum, String speciality) {
        super(ID, name, email, phoneNum);
        this.speciality = speciality;
    }
    
    @Override
    public String lineRepresentation() {
        return ID + "," + name + "," + email + "," + speciality + "," + phoneNum;
    }
    
}
