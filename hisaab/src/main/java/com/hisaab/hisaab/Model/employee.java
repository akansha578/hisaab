package com.hisaab.hisaab.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Id;

@Entity
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
    @SequenceGenerator(name = "employee_sequence", sequenceName = "employee_id_seq", allocationSize = 1)
    private long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String assetUsing;
    private String startDate;
    private String salaryTime;

    public employee(){

    }
    public employee( String name, String phoneNumber, String email, String assetUsing, String startDate, String salaryTime) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.assetUsing = assetUsing;
        this.startDate = startDate;
        this.salaryTime = salaryTime;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssetUsing() {
        return assetUsing;
    }

    public void setAssetUsing(String assetUsing) {
        this.assetUsing = assetUsing;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSalaryTime() {
        return salaryTime;
    }

    public void setSalaryTime(String salaryTime) {
        this.salaryTime = salaryTime;
    }
}

