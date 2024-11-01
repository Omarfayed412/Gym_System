/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
import java.time.LocalDate;
public class MemberClassRegistration {
    private String memberID;
    private String classID;
    private String status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberID, String classID, String status, LocalDate registrationDate) {
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
    
<<<<<<< Updated upstream
=======
    
>>>>>>> Stashed changes
    public String getSearchKey() {
        return this.memberID + this.classID;
    }
    
    public String lineRepresentation( ) {
        return this.memberID + "," + this.classID + "," + this.registrationDate + "," + this.status;
    
    }
    
}
