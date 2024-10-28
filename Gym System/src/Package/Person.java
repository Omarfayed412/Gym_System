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
    protected String ID;
    protected String name;
    protected String email;
    protected String phoneNum;

    public Person(String ID, String name, String email, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }
    
    abstract String lineRepresentation();
    
    public String getSearchKey() {
        return ID;
    }
}
