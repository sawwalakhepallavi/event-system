package com.bootcoding.string.eventsystem.patient;

import java.util.Date;

public class Patient {

    private String name;
    private Date admissionDate;
    private Date dischargeDate;
    private String disease;
    private double billingAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(double billingAmount) {
        this.billingAmount = billingAmount;
    }
}
