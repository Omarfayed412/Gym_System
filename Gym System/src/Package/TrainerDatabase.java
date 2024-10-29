/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.*;
import java.io.*;
import java.lang.System;

/**
 *
 * @author 20112
 */
public class TrainerDatabase extends Database<Trainer>{
    public TrainerDatabase(String filename) {
        super(filename);
    }

    @Override
    public Trainer createRecordFrom(String line) {
        String[] parts = line.split(",");
        return new Trainer(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }

    @Override
    protected String getKey(Trainer record) {
        String[] parts = record.lineRepresentation().split(",");
        return parts[0];
    }
}
