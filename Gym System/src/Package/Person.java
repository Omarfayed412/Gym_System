/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public abstract class Person implements LineRepresentionGeneral{
    protected String ID;
    protected String name;
    protected String email;
    

    public Person(String ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        
    }
    
    protected String LineRepresentationForPerson() {
        return ID + ", " + name + ", " + email;
    }
    
    @Override
    public abstract String lineRepresentation();
    
    public String getSearchKey() {
        return ID;
    }
}
