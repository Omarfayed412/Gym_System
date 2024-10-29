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
public class MemberDatabase extends Database {

    public MemberDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public Record createRecordFrom(String line) {
        String ID, name, membership, phoneNum, status, email;
        int duration;
        String[] words = line.split(line);
        for (int i = 0; i <= words.length - 1; i++) {
            switch (i) {
                case 0 -> ID = words[i];
                case 1 -> name = words[i];
                case 2 -> membership = words[i];
                case 3 -> email = words[i];
                case 4 -> phoneNum = words[i];
                case 5 -> status = words[i];
            }
        }
        
        Member member = new Member(ID, name, membership, phoneNum, status, email);
        return member;
    }
    
}
