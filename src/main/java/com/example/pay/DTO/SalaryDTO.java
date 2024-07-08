package com.example.pay.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SalaryDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //Working
    private int WorkingDays;
    private int PresentDays;
    private int AbsentDays;
    //Earnings
    private int BasicSalary;
    private int HraAllowance;
    private int MedicalReimbursement;
    private int CommunicationAllowance;
    private int LtaAllowance;
    private int SpecialAllowance;
    private int IncentiveAllowance;
    //Deduction
    private int ProvidentFund;
    private int Esic;
    private int ProfessionalTax;
    private int WelfareFund;
    private int AdvancePayment;
    private int DamagePayment;
    //Total
    private int TotalEarnings;
    private int TotalDeductions;
    private int NetSalary;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getWorkingDays() {
        return WorkingDays;
    }
    public void setWorkingDays(int workingDays) {
        WorkingDays = workingDays;
    }
    public int getPresentDays() {
        return PresentDays;
    }
    public void setPresentDays(int presentDays) {
        PresentDays = presentDays;
    }
    public int getAbsentDays() {
        return AbsentDays;
    }
    public void setAbsentDays(int absentDays) {
        AbsentDays = absentDays;
    }
    public int getBasicSalary() {
        return BasicSalary;
    }
    public void setBasicSalary(int basicSalary) {
        BasicSalary = basicSalary;
    }
    public int getHraAllowance() {
        return HraAllowance;
    }
    public void setHraAllowance(int hraAllowance) {
        HraAllowance = hraAllowance;
    }
    public int getMedicalReimbursement() {
        return MedicalReimbursement;
    }
    public void setMedicalReimbursement(int medicalReimbursement) {
        MedicalReimbursement = medicalReimbursement;
    }
    public int getCommunicationAllowance() {
        return CommunicationAllowance;
    }
    public void setCommunicationAllowance(int communicationAllowance) {
        CommunicationAllowance = communicationAllowance;
    }
    public int getLtaAllowance() {
        return LtaAllowance;
    }
    public void setLtaAllowance(int ltaAllowance) {
        LtaAllowance = ltaAllowance;
    }
    public int getSpecialAllowance() {
        return SpecialAllowance;
    }
    public void setSpecialAllowance(int specialAllowance) {
        SpecialAllowance = specialAllowance;
    }
    public int getIncentiveAllowance() {
        return IncentiveAllowance;
    }
    public void setIncentiveAllowance(int incentiveAllowance) {
        IncentiveAllowance = incentiveAllowance;
    }
    public int getProvidentFund() {
        return ProvidentFund;
    }
    public void setProvidentFund(int providentFund) {
        ProvidentFund = providentFund;
    }
    public int getEsic() {
        return Esic;
    }
    public void setEsic(int esic) {
        Esic = esic;
    }
    public int getProfessionalTax() {
        return ProfessionalTax;
    }
    public void setProfessionalTax(int professionalTax) {
        ProfessionalTax = professionalTax;
    }
    public int getWelfareFund() {
        return WelfareFund;
    }
    public void setWelfareFund(int welfareFund) {
        WelfareFund = welfareFund;
    }
    public int getAdvancePayment() {
        return AdvancePayment;
    }
    public void setAdvancePayment(int advancePayment) {
        AdvancePayment = advancePayment;
    }
    public int getDamagePayment() {
        return DamagePayment;
    }
    public void setDamagePayment(int damagePayment) {
        DamagePayment = damagePayment;
    }
    public int getTotalEarnings() {
        return TotalEarnings;
    }
    public void setTotalEarnings(int totalEarnings) {
        TotalEarnings = totalEarnings;
    }
    public int getTotalDeductions() {
        return TotalDeductions;
    }
    public void setTotalDeductions(int totalDeductions) {
        TotalDeductions = totalDeductions;
    }
    public int getNetSalary() {
        return NetSalary;
    }
    public void setNetSalary(int netSalary) {
        NetSalary = netSalary;
    }
    

}
