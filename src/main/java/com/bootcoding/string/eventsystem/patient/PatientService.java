package com.bootcoding.string.eventsystem.patient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PatientService {

    @Value("${output.file.path}")
    private String outputFolder;

    public Patient createPatient(){
        Patient p = new Patient();
        p.setName("Name 1");
        p.setAdmissionDate(new Date());
        p.setDisease("Viral 1");
        p.setDischargeDate(new Date());
        p.setBillingAmount(1000);
        return p;
    }

    public List<Patient> createPatients(int numberOfPatient){
        List<Patient> patients = new ArrayList<>();
        for(int i = 0; i < numberOfPatient ; i++){
            Patient patient = createPatient();
            patients.add(patient);
        }
        return patients;
    }

    public void writeToFile(List<Patient> patients){
        try {
            Date date = new Date() ;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
            String dateTime = dateFormat.format(date);
            String fileName = outputFolder +  "/patient_" + dateTime +".csv";
            FileWriter fw = new FileWriter(fileName);

            for(Patient p : patients){
                writePatient(fw, p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writePatient(FileWriter fw, Patient p) {
        String row = p.getName() + "," +
                p.getAdmissionDate() + "," +
                p.getDisease() + "," +
                p.getDischargeDate() + "," +
                p.getBillingAmount() + "\n";

        try {
            fw.write(row);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
