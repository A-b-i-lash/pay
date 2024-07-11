package com.example.pay.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.pay.DTO.SalaryDTO;
import com.example.pay.Repository.SalaryRepo;

@Repository
public class SalaryDAO {

    @Autowired
    private SalaryRepo repo;

    public SalaryDTO AddDetails(@RequestBody SalaryDTO Add){
        double presentDays = Add.getWorkingDays() - Add.getAbsentDays();
        Add.setPresentDays(presentDays);
        double perDaySalary = Add.getBasicSalary() / Add.getWorkingDays();
        System.out.println(perDaySalary);
        double totalEarnings = perDaySalary * presentDays;
        Add.setTotalEarnings(Math.round(totalEarnings));
        double basicSalary = (totalEarnings / 100) * 60;
        Add.setBasicSalary(Math.round(basicSalary));
        double hraAllowance = (basicSalary / 100) * 25;
        Add.setHraAllowance(Math.round(hraAllowance));
        double medicalReimbursement = (basicSalary / 100) * 6.67;
        Add.setMedicalReimbursement(Math.round(medicalReimbursement));
        double communicationAllowance = (basicSalary / 100) * 5;
        Add.setCommunicationAllowance(Math.round(communicationAllowance));
        double ltaAllowance = (basicSalary / 100) * 10;
        Add.setLtaAllowance(Math.round(ltaAllowance));
        double specialAllowance = (basicSalary / 100) * 10;
        Add.setSpecialAllowance(Math.round(specialAllowance));
        double incentiveAllowance = (basicSalary / 100) * 10;
        Add.setIncentiveAllowance(Math.round(incentiveAllowance));

        double providentFund = (basicSalary / 100) * 12;
        Add.setProvidentFund(Math.round(providentFund));
        double esic = (basicSalary / 100) * 8;
        Add.setEsic(Math.round(esic));
        Add.setWelfareFund(100);

        double totalDeductions = providentFund + esic + 100;
        Add.setTotalDeductions(Math.round(totalDeductions));
        double netSalary = totalEarnings - totalDeductions;
        Add.setNetSalary(Math.round(netSalary));


        return repo.save(Add);
    }

    public SalaryDTO UpdateDetails(@RequestBody Integer id,SalaryDTO Update){
        Update.setId(id);
        double presentDays = Update.getWorkingDays() - Update.getAbsentDays();
        Update.setPresentDays(presentDays);
        double perDaySalary = Update.getBasicSalary() / 26;
        System.out.println(perDaySalary);
        double totalEarnings = perDaySalary * presentDays;
        Update.setTotalEarnings(Math.round(totalEarnings));
        double basicSalary = (totalEarnings / 100) * 60;
        Update.setBasicSalary(Math.round(basicSalary));
        double hraAllowance = (basicSalary / 100) * 25;
        Update.setHraAllowance(Math.round(hraAllowance));
        double medicalReimbursement = (basicSalary / 100) * 6.67;
        Update.setMedicalReimbursement(Math.round(medicalReimbursement));
        double communicationAllowance = (basicSalary / 100) * 5;
        Update.setCommunicationAllowance(Math.round(communicationAllowance));
        double ltaAllowance = (basicSalary / 100) * 10;
        Update.setLtaAllowance(Math.round(ltaAllowance));
        double specialAllowance = (basicSalary / 100) * 10;
        Update.setSpecialAllowance(Math.round(specialAllowance));
        double incentiveAllowance = (basicSalary / 100) * 10;
        Update.setIncentiveAllowance(Math.round(incentiveAllowance));

        double providentFund = (basicSalary / 100) * 12;
        Update.setProvidentFund(Math.round(providentFund));
        double esic = (basicSalary / 100) * 8;
        Update.setEsic(Math.round(esic));
        Update.setWelfareFund(100);

        double totalDeductions = providentFund + esic + 100;
        Update.setTotalDeductions(Math.round(totalDeductions));
        double netSalary = totalEarnings - totalDeductions;
        Update.setNetSalary(Math.round(netSalary));

        return repo.save(Update);
    }

    public String DeleteDetails(@RequestBody int id){
        repo.deleteById(id);
        return "Sucess";
    }

    public SalaryDTO ViewDetails(int id){
        return repo.findById(id).get();
    }

    public List<SalaryDTO>  ViewAllDetails(){
        return repo.findAll();
    }

}
