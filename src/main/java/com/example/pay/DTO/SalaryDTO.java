package com.example.pay.DTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;

@Entity
public class SalaryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // Employee
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeCode",referencedColumnName = "employeeCode")
    private EmployeeDTO employeeDTO;
    private String Month;
    //Working
    private double workingDays;
    private double presentDays;
    private double absentDays;
    //Earnings
    private double basicSalary;
    private double hraAllowance;
    private double medicalReimbursement;
    private double communicationAllowance;
    private double ltaAllowance;
    private double specialAllowance;
    private double incentiveAllowance;
    //Deduction
    private double providentFund;
    private double esic;
    private double professionalTax;
    private double welfareFund;
    private double advancePayment;
    private double damagePayment;
    //Total
    private double totalEarnings;
    private double totalDeductions;
    private double netSalary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }
    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }
    public String getMonth() {
        return Month;
    }
    public void setMonth(String month) {
        Month = month;
    }
    public double getWorkingDays() {
        return workingDays;
    }
    public void setWorkingDays(double workingDays) {
        this.workingDays = workingDays;
    }
    public double getPresentDays() {
        return presentDays;
    }
    public void setPresentDays(double presentDays) {
        this.presentDays = presentDays;
    }
    public double getAbsentDays() {
        return absentDays;
    }
    public void setAbsentDays(double absentDays) {
        this.absentDays = absentDays;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getHraAllowance() {
        return hraAllowance;
    }
    public void setHraAllowance(double hraAllowance) {
        this.hraAllowance = hraAllowance;
    }
    public double getMedicalReimbursement() {
        return medicalReimbursement;
    }
    public void setMedicalReimbursement(double medicalReimbursement) {
        this.medicalReimbursement = medicalReimbursement;
    }
    public double getCommunicationAllowance() {
        return communicationAllowance;
    }
    public void setCommunicationAllowance(double communicationAllowance) {
        this.communicationAllowance = communicationAllowance;
    }
    public double getLtaAllowance() {
        return ltaAllowance;
    }
    public void setLtaAllowance(double ltaAllowance) {
        this.ltaAllowance = ltaAllowance;
    }
    public double getSpecialAllowance() {
        return specialAllowance;
    }
    public void setSpecialAllowance(double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }
    public double getIncentiveAllowance() {
        return incentiveAllowance;
    }
    public void setIncentiveAllowance(double incentiveAllowance) {
        this.incentiveAllowance = incentiveAllowance;
    }
    public double getProvidentFund() {
        return providentFund;
    }
    public void setProvidentFund(double providentFund) {
        this.providentFund = providentFund;
    }
    public double getEsic() {
        return esic;
    }
    public void setEsic(double esic) {
        this.esic = esic;
    }
    public double getProfessionalTax() {
        return professionalTax;
    }
    public void setProfessionalTax(double professionalTax) {
        this.professionalTax = professionalTax;
    }
    public double getWelfareFund() {
        return welfareFund;
    }
    public void setWelfareFund(double welfareFund) {
        this.welfareFund = welfareFund;
    }
    public double getAdvancePayment() {
        return advancePayment;
    }
    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }
    public double getDamagePayment() {
        return damagePayment;
    }
    public void setDamagePayment(double damagePayment) {
        this.damagePayment = damagePayment;
    }
    public double getTotalEarnings() {
        return totalEarnings;
    }
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }
    public double getTotalDeductions() {
        return totalDeductions;
    }
    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }
    public double getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(double netSalary2) {
        this.netSalary = netSalary2;
    }

   

    
}
