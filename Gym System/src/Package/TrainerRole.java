/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;

/**
 *
 * @author 20112
 */
public class TrainerRole{
    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;
<<<<<<< Updated upstream
    
    public boolean addMember(String memeberID, String name, String membershipType, String email, String phoneNum, String status) {
=======
>>>>>>> Stashed changes
    
    }
    
    public ArrayList<Member> getListOfMembers() {
<<<<<<< Updated upstream
    
=======
        ArrayList<Record> records = memberDatabase.returnAllRecords();
        ArrayList<Member> members = null;
        for (Record i : records) {
            members.add((Member)i);
        }
        return members;
>>>>>>> Stashed changes
    }
    
    public boolean addClass (String classID, String className, String trainerID, int duration, int maxParticipants) {
    
    }
    
<<<<<<< Updated upstream
    public ArrayList<Class> getListOfClasses() {
    
    }
    
    public boolean registerMemberForClass (String memberID, String classID, LocalDate registrationDate) {
    
=======
    public ArrayList<Class_S> getListOfClasses() {
        ArrayList<Record> records = classDatabase.returnAllRecords();
        ArrayList<Class_S> classes = null;
        for (Record i : records) {
            classes.add((Class_S)i);
        }
        return classes;
    }
    //Feeh haga 8alat
    public boolean registerMemberForClass (String memberID, String classID, LocalDate registrationDate) {
        //set registration status to true
        if (memberDatabase.contains(memberID) && classDatabase.contains(classID) && !(registrationDatabase.contains(memberID + classID))) {
            Class_S clas = (Class_S) classDatabase.getRecord(classID);
            Member member = (Member) memberDatabase.getRecord(memberID);
            if (clas != null && member != null) {
                if (clas.getAvialableSeats() > 0) { 
                    clas.setAvialableSeats(clas.getAvialableSeats() - 1);
                    MemberClassRegistration reg = new MemberClassRegistration(memberID, classID, "Active", registrationDate);
                    registrationDatabase.insertRecord((Record) reg);
                    return true;
                }
                else {
                    System.out.println("No seats available.");
                    return false;
                }
            }
            else System.out.println("Null object.");
        }
        
        System.out.println("Error: Invalid class or user ID");
        return false;
>>>>>>> Stashed changes
    }
    
    public boolean cancelRegistration (String memberID, String classID) {
    
    }
    
    public ArrayList<MemberClassRegistration> getListOfRegistration() {
<<<<<<< Updated upstream
    
=======
        ArrayList<Record> records = registrationDatabase.returnAllRecords();
        ArrayList<MemberClassRegistration> registrations = null;
        for (Record i : records) {
            registrations.add((MemberClassRegistration)i);
        }
        return registrations;
>>>>>>> Stashed changes
    }
    
    public void logout() {
    
    }
    
}

