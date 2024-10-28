/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public class Member extends Person{
    private final String membershipType;
    private final String phoneNumber;
    private final String status;

    public Member(String membershipType, String phoneNumber, String status, String ID, String name, String email) {
        super(ID, name, email);
        this.membershipType = membershipType;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    

     @Override
    public String lineRepresentation() {
        return LineRepresentationForPerson() + ", " + membershipType + ", " + phoneNumber + ", " + status;
    }
    
}
