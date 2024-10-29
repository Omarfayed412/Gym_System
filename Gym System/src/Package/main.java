/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;
import java.util.*;
import java.io.*;
import java.lang.System;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL-G3
 */
public class main {
    private static TrainerRole trainerRole;
    private static Scanner scanner;

    public static void main(String[] args) {
        trainerRole = new TrainerRole();
        scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the Membership Management System");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Add Class");
            System.out.println("4. View Classes");
            System.out.println("5. Register for Class");
            System.out.println("6. Cancel Registration");
            System.out.println("7. View Registrations");
            System.out.println("8. Logout and Save Data");
            System.out.println("0. Exit");
            System.out.print("Please choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    viewMembers();
                    break;
                case 3:
                    addClass();
                    break;
                case 4:
                    viewClasses();
                    break;
                case 5:
                    registerForClass();
                    break;
                case 6:
                    cancelRegistration();
                    break;
                case 7:
                    viewRegistrations();
                    break;
                case 8:
                    logout();
                    break;
                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        
        scanner.close();
    }

    private static void addMember() {
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Membership Type: ");
        String membershipType = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Status: ");
        String status = scanner.nextLine();

        trainerRole.addMember(memberID, name, membershipType, email, phoneNumber, status);
        System.out.println("Member added successfully.");
    }

    private static void viewMembers() {
        ArrayList<Member> members = trainerRole.getListOfMembers();
        if (members.isEmpty()) {
            System.out.println("No members found.");
        } else {
            System.out.println("List of Members:");
            for (Member member : members) {
                System.out.println(member.lineRepresentation());
            }
        }
    }

    private static void addClass() {
        System.out.print("Enter Class ID: ");
        String classID = scanner.nextLine();
        System.out.print("Enter Class Name: ");
        String className = scanner.nextLine();
        System.out.print("Enter Trainer ID: ");
        String trainerID = scanner.nextLine();
        System.out.print("Enter Duration (minutes): ");
        int duration = scanner.nextInt();
        System.out.print("Enter Maximum Participants: ");
        int maxParticipants = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        trainerRole.addClass(classID, className, trainerID, duration, maxParticipants);
        System.out.println("Class added successfully.");
    }

    private static void viewClasses() {
        ArrayList<Class> classes = trainerRole.getListOfClasses();
        if (classes.isEmpty()) {
            System.out.println("No classes found.");
        } else {
            System.out.println("List of Classes:");
            for (Class clazz : classes) {
                System.out.println(clazz.lineRepresentation());
            }
        }
    }

    private static void registerForClass() {
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();
        System.out.print("Enter Class ID: ");
        String classID = scanner.nextLine();
        LocalDate registrationDate = LocalDate.now();

        boolean success = trainerRole.registerMemberForClass(memberID, classID, registrationDate);
        if (success) {
            System.out.println("Successfully registered member " + memberID + " for class " + classID);
        } else {
            System.out.println("Registration failed. Please check the member ID and class ID.");
        }
    }

    private static void cancelRegistration() {
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();
        System.out.print("Enter Class ID: ");
        String classID = scanner.nextLine();

        boolean success = trainerRole.cancelRegistration(memberID, classID);
        if (success) {
            System.out.println("Successfully canceled registration for member " + memberID + " for class " + classID);
        } else {
            System.out.println("Cancellation failed. Please check the member ID and class ID.");
        }
    }

    private static void viewRegistrations() {
        ArrayList<MemberClassRegistration> registrations = trainerRole.getListOfRegistrations();
        if (registrations.isEmpty()) {
            System.out.println("No registrations found.");
        } else {
            System.out.println("List of Registrations:");
            for (MemberClassRegistration registration : registrations) {
                System.out.println(registration.lineRepresentation());
            }
        }
    }

    private static void logout() {
        trainerRole.logout();
        System.out.println("Unsaved data has been saved to files.");
    }
}
