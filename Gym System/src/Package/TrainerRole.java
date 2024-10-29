/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;
import java.time.LocalDate;
import java.io.*;
import java.lang.System;
/**
 *
 * @author 20112
 */
public class TrainerRole{
    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;
    
    public TrainerRole() {
        this.memberDatabase = new MemberDatabase("Members.txt");
        this.classDatabase = new ClassDatabase("Classes.txt");
        this.registrationDatabase = new MemberClassRegistrationDatabase("Registrations.txt");
    }

    // 1. Adds a new member to the system
    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status) {
        Member newMember = new Member(membershipType, phoneNumber, status, memberID, name, email);
        if (!memberDatabase.contains(memberID)) {
            memberDatabase.insertRecord(newMember);
        } else {
            System.out.println("Member already exists with ID: " + memberID);
        }
    }

    // 2. Returns a list of all members stored in the MemberDatabase
    public ArrayList<Member> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    // 3. Adds a new class to the system
    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        Class newClass = new Class(classID, className, trainerID, duration);
        if (!classDatabase.contains(classID)) {
            classDatabase.insertRecord(newClass);
            Class.setAvialableSeats(maxParticipants); // Initialize available seats
        } else {
            System.out.println("Class already exists with ID: " + classID);
        }
    }

    // 4. Returns a list of all classes stored in the ClassDatabase
    public ArrayList<Class> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }

    // 5. Registers a member for a class
    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        Class classToRegister = classDatabase.getRecord(classID);
        if (classToRegister == null) {
            System.out.println("Class not found: " + classID);
            return false;
        }

        if (Class.getAvialableSeats() > 0) {
            MemberClassRegistration registration = new MemberClassRegistration(memberID, classID, "active", registrationDate);
            registrationDatabase.insertRecord(registration);
            Class.setAvialableSeats(Class.getAvialableSeats() - 1);
            return true;
        } else {
            System.out.println("No available seats for class: " + classID);
            return false;
        }
    }

    // 6. Cancels a registration
    public boolean cancelRegistration(String memberID, String classID) {
        MemberClassRegistration registration = registrationDatabase.getRecord(memberID + classID);
        if (registration == null) {
            System.out.println("Registration not found for memberID: " + memberID + " and classID: " + classID);
            return false;
        }

        LocalDate registrationDate = registration.getRegistrationDate();
        if (LocalDate.now().isBefore(registrationDate.plusDays(3))) {
            registrationDatabase.deleteRecord(memberID + classID);
            Class.setAvialableSeats(Class.getAvialableSeats() + 1);
            return true;
        } else {
            System.out.println("Cancellation period has expired for memberID: " + memberID + " and classID: " + classID);
            return false;
        }
    }

    // 7. Returns a list of all class registrations stored in the MemberClassRegistrationDatabase
    public ArrayList<MemberClassRegistration> getListOfRegistrations() {
        return registrationDatabase.returnAllRecords();
    }

    // 8. Writes all unsaved member, class, and registration data to their respective files
    public void logout() {
        memberDatabase.saveToFile();
        classDatabase.saveToFile();
        registrationDatabase.saveToFile();
    }
    
}

