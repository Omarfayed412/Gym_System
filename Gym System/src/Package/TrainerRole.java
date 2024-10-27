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
    
    public boolean addMember(String memeberID, String name, String membershipType, String email, String phoneNum, String status) {
    
    }
    
    public ArrayList<Member> getListOfMembers() {
    
    }
    
    public boolean addClass (String classID, String className, String trainerID, int duration, int maxParticipants) {
    
    }
    
    public ArrayList<Class> getListOfClasses() {
    
    }
    
    public boolean registerMemberForClass (String memberID, String classID, LocalDate registrationDate) {
    
    }
    
    public boolean cancelRegistration (String memberID, String classID) {
    
    }
    
    public ArrayList<MemberClassRegistration> getListOfRegistration() {
    
    }
    
    public void logout() {
    
    }
    
}

