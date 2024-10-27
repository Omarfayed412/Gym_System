/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public abstract class Person {
    private String ID;
    private String name;
    private String email;
    private String phoneNum;

    public Person(String ID, String name, String email, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }
    
    abstract String lineRepresentation();
    
    public int getSearchKey() {
    
    }
}
