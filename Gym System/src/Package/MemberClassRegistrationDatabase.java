/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

/**
 *
 * @author 20112
 */
public class MemberClassRegistrationDatabase extends TrainerDatabase {

    public MemberClassRegistrationDatabase(String fileName) {
        super(fileName);
    }
<<<<<<< Updated upstream
    //Override all methods here
=======
    
    @Override
    public Record createRecordFrom(String line) {
        String memID = null, classId = null, status = null, date, registrationDate = null;
        String[] words = line.split(line);
        for (int i = 0; i <= words.length - 1; i++) {
            switch (i) {
                case 0 -> memID = words[i];
                case 1 -> classId = words[i];
                case 2 -> status = words[i];
                case 3 -> registrationDate = words[i];
            }
        }
        
        MemberClassRegistration memberReg = new MemberClassRegistration(memID, classId, status,LocalDate.parse(registrationDate));
        return (Record) memberReg;
    }

    
>>>>>>> Stashed changes
}
