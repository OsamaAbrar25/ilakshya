package com.ilakshya.test;

import javax.persistence.*;

@Entity
//@Table(name = "StudentProfile")
public class StudentProfile {

    //@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String username;
    private String password;
    private String name;
    private String fName;
    private String dob;
    private long rollNo;
    private int standard;
    private String section;
    private String imageUrl;
    private String contact;

    public StudentProfile() {

    }

    public StudentProfile(String password, String name, String fName, String dob, long rollNo, int standard, String section, String imageUrl, String contact) {
        this.password = password;
        this.name = name;
        this.fName = fName;
        this.dob = dob;
        this.rollNo = rollNo;
        this.standard = standard;
        this.section = section;
        this.imageUrl = imageUrl;
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
