package com.bootcoding.string.eventsystem.file_handling;

import java.util.Date;

public class Patient {
    private String patient_name;
    private Date date_of_admission;
    private String disease;
    private Date date_of_discharge;
    private int Total_Bill_Cost;


    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public Date getDate_of_admission() {
        return date_of_admission;
    }

    public void setDate_of_admission(Date date_of_admission) {
        this.date_of_admission = date_of_admission;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Date getDate_of_discharge() {
        return date_of_discharge;
    }

    public void setDate_of_discharge(Date date_of_discharge) {
        this.date_of_discharge = date_of_discharge;
    }

    public int getTotal_Bill_Cost() {
        return Total_Bill_Cost;
    }

    public void setTotal_Bill_Cost(int total_Bill_Cost) {
        Total_Bill_Cost = total_Bill_Cost;
    }


}
