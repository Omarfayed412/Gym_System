/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.time.LocalDate;

/**
 *
 * @author 20112
 */
public class MemberClassRegistrationDatabase extends Database {
    public MemberClassRegistrationDatabase(String fileName) {
        super(fileName);
    }
    
    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String memID = null, classId = null, status = null, registrationDate = null;
        String[] words = line.split(",");
        for (int i = 0; i <= words.length - 1; i++) {
            switch (i) {
                case 0 -> memID = words[i];
                case 1 -> classId = words[i];
                case 2 -> registrationDate = words[i];
                case 3 -> status = words[i];
            }
        }
        
        MemberClassRegistration memberReg = new MemberClassRegistration(memID, classId, LocalDate.parse(registrationDate), status);
        return memberReg;
    }

    
}
