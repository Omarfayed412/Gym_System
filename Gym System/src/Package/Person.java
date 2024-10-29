/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public abstract class Person{
    private final String ID;
    private final String name;    

    public Person(String ID, String name) {
        this.ID = ID;
        this.name = name;        
    }
    
    public String lineRepresentation() {
        return this.ID + "," + this.name;
    }
    
    public String getSearchKey() {
        return ID;
    }
}
