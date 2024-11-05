/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.util.*;
import java.io.*;
import java.lang.System;

/**
  * Github: https://github.com/Omarfayed412/Gym_System

 * @author 20112
 */
public class TrainerDatabase extends Database{

    public TrainerDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public Trainer createRecordFrom(String line) {
        String[] words = line.split(",");
        return new Trainer(words[0], words[1], words[2], words[3], words[4]);
    }
}