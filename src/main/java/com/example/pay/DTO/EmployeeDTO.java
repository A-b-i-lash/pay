package com.example.pay.DTO;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String EmployeeCode;
    private String EmployeeName;
    private Date DOJ;
    private String Grade;
    private String Designation;
    private String Department;
    private String Location;
    private String BankName;
    private Long AccountNumber;
    private String PanNumber;
    private String PfNumber;
    private String UanNumber;
    private String EsicNumber;


    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getEmployeeCode() {
        return EmployeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }
    public Date getDOJ() {
        return DOJ;
    }
    public void setDOJ(Date dOJ) {
        DOJ = dOJ;
    }
    public String getGrade() {
        return Grade;
    }
    public void setGrade(String grade) {
        Grade = grade;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public String getBankName() {
        return BankName;
    }
    public void setBankName(String bankName) {
        BankName = bankName;
    }
    public Long getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(Long accountNumber) {
        AccountNumber = accountNumber;
    }
    public String getPanNumber() {
        return PanNumber;
    }
    public void setPanNumber(String panNumber) {
        PanNumber = panNumber;
    }
    public String getPfNumber() {
        return PfNumber;
    }
    public void setPfNumber(String pfNumber) {
        PfNumber = pfNumber;
    }
    public String getUanNumber() {
        return UanNumber;
    }
    public void setUanNumber(String uanNumber) {
        UanNumber = uanNumber;
    }
    public String getEsicNumber() {
        return EsicNumber;
    }
    public void setEsicNumber(String esicNumber) {
        EsicNumber = esicNumber;
    }
    
}
