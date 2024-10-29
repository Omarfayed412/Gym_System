/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Github: https://github.com/Omarfayed412/Gym_System
 * @author DELL-G3
 */
public class main {    
    public static void main(String[] args) {
        mainMenu();
    }
    
    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to the Gym Management System");
        
        do {
            System.out.println("Select your role: ");
            System.out.println("1. Admin");
            System.out.println("2. Trainer");
            System.out.println("3. Exit");
            
            choice = input.nextInt();
            input.nextLine();  
            switch (choice) {
                case 1 -> adminMenu();
                case 2 -> trainerMenu();
                case 3 -> {
                    System.out.println("Exiting system. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        
        input.close();
    }
    
    public static void adminMenu() {
        AdminRole admin = new AdminRole();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Trainer");
            System.out.println("2. Remove Trainer");
            System.out.println("3. View Trainers");
            System.out.println("4. Logout");

            choice = input.nextInt();
            input.nextLine();  // Consume newline
            
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter trainer details:");
                    System.out.print("ID: ");
                    String id = input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Email: ");
                    String email = input.nextLine();
                    System.out.print("Speciality: ");
                    String speciality = input.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = input.nextLine();
                    admin.addTrainer(id, name, email, speciality, phone);
                }
                case 2 -> {
                    System.out.print("Enter trainer ID to remove: ");
                    String id = input.nextLine();
                    admin.removeTrainer(id);
                }
                case 3 -> {
                    ArrayList<Trainer> trainers = admin.getListOfTrainers();
                    if (trainers != null) {
                        System.out.println("List of Trainers:");
                        for (Trainer t : trainers) {
                            System.out.println(t.lineRepresentation());
                        }
                    }
                }
                case 4 -> {
                    admin.logout();
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }while (choice != 4);
    }
    
    public static void trainerMenu() {
        TrainerRole trainer = new TrainerRole();
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- Trainer Menu ---");
            System.out.println("1. Add Member");
            System.out.println("2. Add Class");
            System.out.println("3. Register Member for Class");
            System.out.println("4. Cancel Registration");
            System.out.println("5. View Members");
            System.out.println("6. View Classes");
            System.out.println("7. View Registrations");
            System.out.println("8. Logout");
            
            choice = input.nextInt();
            input.nextLine();  
            
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter member details:");
                    System.out.print("ID: ");
                    String id = input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Membership Type: ");
                    String membershipType = input.nextLine();
                    System.out.print("Email: ");
                    String email = input.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = input.nextLine();
                    System.out.print("Status: ");
                    String status = input.nextLine();
                    trainer.addMember(id, name, membershipType, email, phone, status);
                }
                case 2 -> {
                    System.out.println("Enter class details:");
                    System.out.print("Class ID: ");
                    String classId = input.nextLine();
                    System.out.print("Class Name: ");
                    String className = input.nextLine();
                    System.out.print("Trainer ID: ");
                    String trainerId = input.nextLine();
                    System.out.print("Duration (in hours): ");
                    int duration = input.nextInt();
                    System.out.print("Max Participants: ");
                    int maxParticipants = input.nextInt();
                    input.nextLine(); 
                    trainer.addClass(classId, className, trainerId, duration, maxParticipants);
                }
                case 3 -> {
                    System.out.print("Enter member ID for registration: ");
                    String memberId = input.nextLine();
                    System.out.print("Enter class ID: ");
                    String classId = input.nextLine();
                    LocalDate registrationDate = LocalDate.now();
                    trainer.registerMemberForClass(memberId, classId, registrationDate);
                }
                case 4 -> {
                    System.out.print("Enter member ID to cancel registration: ");
                    String memberId = input.nextLine();
                    System.out.print("Enter class ID: ");
                    String classId = input.nextLine();
                    trainer.cancelRegistration(memberId, classId);
                }
                case 5 -> {
                    ArrayList<Member> members = trainer.getListOfMembers();
                    System.out.println("List of Members:");
                    for (Member m : members) {
                        System.out.println(m.lineRepresentation());
                    }
                }
                case 6 -> {
                    ArrayList<Class_S> classes = trainer.getListOfClasses();
                    System.out.println("List of Classes:");
                    for (Class_S c : classes) {
                        System.out.println(c.lineRepresentation());
                    }
                }
                case 7 -> {
                    ArrayList<MemberClassRegistration> registrations = trainer.getListOfRegistration();
                    System.out.println("List of Registrations:");
                    for (MemberClassRegistration reg : registrations) {
                        System.out.println(reg.lineRepresentation());
                    }
                }
                case 8 -> {
                    trainer.logout();
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }
}

