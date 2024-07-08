package com.example.pay.Contoller;

import org.springframework.web.bind.annotation.RestController;

import com.example.pay.DAO.SalaryDAO;
import com.example.pay.DTO.SalaryDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/Api/Salary")
public class SalaryControler {
    @Autowired
    private SalaryDAO dao;

    @PostMapping("Add")
    public SalaryDTO AddDeduction(@RequestBody SalaryDTO add) {
        
        return dao.AddDetails(add);
    }
    
    @PutMapping("Update/{id}")
    public SalaryDTO UpdateDeduction(@PathVariable Integer id, @RequestBody SalaryDTO update) {
    
        return dao.UpdateDetails(id, update);
    }

    @DeleteMapping("Delete/{id}")
    public String DeleteDetails(@PathVariable Integer id){

        return dao.DeleteDetails(id);
    }

    @GetMapping("View/{id}")
    public SalaryDTO ViewDetails(@PathVariable Integer id) {
        return dao.ViewDetails(id);
    }

    @GetMapping("ViewAll")
    public List<SalaryDTO> ViewAllDetails() {
        return dao.ViewAllDetails();
    }

}
