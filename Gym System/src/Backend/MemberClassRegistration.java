/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 * Github: https://github.com/Omarfayed412/Gym_System
 * @author 20112
 */
import java.time.LocalDate;
public class MemberClassRegistration extends Person{
    private String memberID;
    private String classID;
    private String status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberID, String classID, LocalDate registrationDate, String status) {
        super(null, null);
        this.memberID = memberID;
        this.classID = classID;
        this.status = status;
        this.registrationDate = registrationDate;
    }

    public String getMemberID() {
        return this.memberID;
    }

    public String getClassID() {
        return this.classID;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override
    public String getSearchKey() {
        return this.memberID + this.classID;
    }
    
    @Override
    public String lineRepresentation( ) {
        return this.memberID + "," + this.classID + "," + this.registrationDate + "," + this.status;
    
    }
    
}
