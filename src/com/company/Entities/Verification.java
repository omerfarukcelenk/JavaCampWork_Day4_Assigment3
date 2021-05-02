package com.company.Entities;

import java.util.Date;

public class Verification {
    private String TcNo;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Verification(){

    }

    public Verification(String tcNo, String firstName, String lastName, Date birthDate) {
        this.TcNo = tcNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getTcNo() {
        return TcNo;
    }

    public void setTcNo(String tcNo) {
        TcNo = tcNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
