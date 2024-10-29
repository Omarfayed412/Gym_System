/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 * Github: https://github.com/Omarfayed412/Gym_System
 * @author 20112
 */
public class Member extends Person{
    private final String membershipType;
    private final String phoneNumber;
    private final String status;
    private final String email;

    public Member(String ID, String name, String membershipType, String phoneNumber, String status, String email) {
        super(ID, name);
        this.membershipType = membershipType;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.email = email;
    }
    
    @Override
    public String lineRepresentation() {      
        return super.lineRepresentation() + "," + this.membershipType + "," + this.email + "," + this.phoneNumber + "," + this.status;
    }
    
}
