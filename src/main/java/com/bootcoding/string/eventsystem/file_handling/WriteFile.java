package com.bootcoding.string.eventsystem.file_handling;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
@Component
public class WriteFile {

    public PatientName patientName;
    public Disease disease;
    public BillGenerator billGenerator;
    public DateOfAdmission dateOfAdmission;

    public void fileWriter() {


        try {
            File file = new File("c://file//output.txt");
            java.io.FileWriter fileWriter = new java.io.FileWriter(file);
            for(int i=0;i<100;i++) {
                fileWriter.write(patientName.getName());
                fileWriter.write(" , ");
                fileWriter.write(disease.getDisease()+" ,"+" ,"+billGenerator.getBillGenerator());
                fileWriter.write(" \n");
            }

            fileWriter.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
