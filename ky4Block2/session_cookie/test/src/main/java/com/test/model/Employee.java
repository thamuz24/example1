package com.test.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int age;
    @NonNull
    private String fullName;
    private String gender;
    private String address;
    private LocalDate birth;
    private String phoneNumber;
    private String email;
    private String  department;
    private String roll;
    private long wage;
    private LocalDate day_start;
    private String status;
    private String insurance_information;

    public Employee(
            int age, String fullName, String gender, String address, LocalDate birth,
            String phoneNumber, String email, String department, String roll, long wage,
            LocalDate day_start, String status, String insurance_information) {
        this.age = age;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.department = department;
        this.roll = roll;
        this.wage = wage;
        this.day_start = day_start;
        this.status = status;
        this.insurance_information = insurance_information;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth.toString();
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }

    public String getDay_start() {
        return day_start.toString();
    }

    public void setDay_start(LocalDate day_start) {
        this.day_start = day_start;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInsurance_information() {
        return insurance_information;
    }

    public void setInsurance_information(String insurance_information) {
        this.insurance_information = insurance_information;
    }
}
