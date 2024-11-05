/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 * Github: https://github.com/Omarfayed412/Gym_System
 * @author 20112
 */
public abstract class Person implements Record{
    private final String ID;
    private final String name;    

    public Person(String ID, String name) {
        this.ID = ID;
        this.name = name;         
    }
    
    @Override
    public String lineRepresentation() {
        return this.ID + "," + this.name;
    }
    
    @Override
    public String getSearchKey() {
        return this.ID;
    }
    
}
