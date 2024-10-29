/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Github: https://github.com/Omarfayed412/Gym_System
 * @author 20112
 */
public class TrainerRole{
    private final MemberDatabase memberDatabase = new MemberDatabase("D:\\Software\\OOP_JAVA\\Gym_System\\Gym System\\TestData\\Members.txt");
    private final ClassDatabase classDatabase = new ClassDatabase("D:\\Software\\OOP_JAVA\\Gym_System\\Gym System\\TestData\\Class.txt");
    private final MemberClassRegistrationDatabase registrationDatabase = new MemberClassRegistrationDatabase("D:\\Software\\OOP_JAVA\\Gym_System\\Gym System\\TestData\\Registration.txt");

    public TrainerRole() {
        memberDatabase.readFromFile();
        classDatabase.readFromFile();
        registrationDatabase.readFromFile();
    }
    
    
    public boolean addMember(String memberID, String name, String membershipType, String email, String phoneNum, String status) {
        if (memberDatabase.contains(memberID)) {
            return false;
        }
        Member member = new Member(memberID, name, membershipType, email, phoneNum, status);
        memberDatabase.insertRecord((Member)member);
        System.out.println("Member added");
        return true;
    }
    
    public ArrayList<Member> getListOfMembers() {
        ArrayList<Record> records = memberDatabase.returnAllRecords();
        ArrayList<Member> members = new ArrayList<Member>();
        for (Record i : records) {
            members.add((Member)i);
        }
        return members;
    }
    
    public boolean addClass (String classID, String className, String trainerID, int duration, int maxParticipants) {
        if (classDatabase.contains(classID) && memberDatabase.contains(trainerID)) {
            return false;
        }
        
        Class_S c = new Class_S(classID, className, trainerID, duration);
        c.setAvialableSeats(maxParticipants);
        classDatabase.insertRecord((Class_S)c);
        System.out.println("Class added");
        return true;
    }
    
    public ArrayList<Class_S> getListOfClasses() {
        ArrayList<Record> records = classDatabase.returnAllRecords();
        ArrayList<Class_S> classes = new ArrayList<Class_S>();
        for (Record i : records) {
            classes.add((Class_S)i);
        }
        return classes;
    }
    
    //Feeh haga 8alat
    public boolean registerMemberForClass (String memberID, String classID, LocalDate registrationDate) {
        //set registration status to true
        if (memberDatabase.contains(memberID) && classDatabase.contains(classID)) {
            Class_S clas = (Class_S) classDatabase.getRecord(classID);
                if (clas.getAvialableSeats() > 0) { 
                    MemberClassRegistration reg = new MemberClassRegistration(memberID, classID, registrationDate, "Active");
                    registrationDatabase.insertRecord((MemberClassRegistration) reg);
                    clas.setAvialableSeats(clas.getAvialableSeats() - 1);
                    System.out.println("Member registered successfully.");
                    return true;
                }
                else {
                    System.out.println("No seats available.");
                    return false;
                }
        }
        
        System.out.println("Error: Invalid class or user ID");
        return false;
    }
    
    public boolean cancelRegistration (String memberID, String classID) {
        if (registrationDatabase.contains(memberID + classID)) {
            MemberClassRegistration reg = (MemberClassRegistration) registrationDatabase.getRecord(memberID + classID);
            LocalDate current_date = LocalDate.now();
            if (current_date.compareTo(reg.getRegistrationDate()) <= 3) {
                reg.setStatus("Canceled");
                Class_S c = (Class_S) classDatabase.getRecord(classID);
                c.setAvialableSeats(c.getAvialableSeats() + 1);
                System.out.println("Registration cancelled.");
                return true;
            }
            else {
                System.out.println("Error cancelling the registration.");
                return false;
            }
        }
        return false;
    }
    
    
    public ArrayList<MemberClassRegistration> getListOfRegistration() {
        ArrayList<Record> records = registrationDatabase.returnAllRecords();
        ArrayList<MemberClassRegistration> registrations = new ArrayList<MemberClassRegistration>();
        for (Record i : records) {
            registrations.add((MemberClassRegistration)i);
        }
        return registrations;
    }
    
    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
        System.out.println("Data saved successfully.\nLogged out.");
    }
    
}

