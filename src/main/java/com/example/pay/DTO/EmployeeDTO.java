package com.example.pay.DTO;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class EmployeeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String employeeCode;
    private String employeeName;
    private Date doj;
    private String grade;
    private String designation;
    private String department;
    private String location;
    private String bankName;
    private Long accountNumber;
    private String panNumber;
    private String pfNumber;
    private String uanNumber;
    private String esicNumber;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public Date getDoj() {
        return doj;
    }
    public void setDoj(Date doj) {
        this.doj = doj;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public Long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getPanNumber() {
        return panNumber;
    }
    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
    public String getPfNumber() {
        return pfNumber;
    }
    public void setPfNumber(String pfNumber) {
        this.pfNumber = pfNumber;
    }
    public String getUanNumber() {
        return uanNumber;
    }
    public void setUanNumber(String uanNumber) {
        this.uanNumber = uanNumber;
    }
    public String getEsicNumber() {
        return esicNumber;
    }
    public void setEsicNumber(String esicNumber) {
        this.esicNumber = esicNumber;
    }

    
    
}
