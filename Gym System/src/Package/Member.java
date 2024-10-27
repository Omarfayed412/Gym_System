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
    private String membership;
    private String status;

    public Member(String ID, String name, String email, String phoneNum, String membership, String status) {
        super(ID, name, email, phoneNum);
        this.membership = membership;
        this.status = status;
    }
    
    @Override
    public String lineRepresentation() {
    
    }
    
}
