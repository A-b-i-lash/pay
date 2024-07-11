package com.example.pay.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pay.DAO.EmployeeDAO;
import com.example.pay.DTO.EmployeeDTO;


@RestController
@RequestMapping("/Api/Employee")
public class EmployeeController {
    @Autowired
    private EmployeeDAO dao;

    @PostMapping("Add")
    public EmployeeDTO AddDeduction(@RequestBody EmployeeDTO add) {
        
        return dao.AddDetails(add);
    }
    
    @PutMapping("Update/{id}")
    public EmployeeDTO UpdateDeduction(@PathVariable Integer id, @RequestBody EmployeeDTO update) {
    
        return dao.UpdateDetails(id, update);
    }

    @DeleteMapping("Delete/{id}")
    public String DeleteDetails(@PathVariable Integer id){

        return dao.DeleteDetails(id);
    }

    @GetMapping("View/{id}")
    public EmployeeDTO ViewDetails(@PathVariable Integer id) {
        return dao.ViewDetails(id);
    }

    @GetMapping("ViewAll")
    public List<EmployeeDTO> ViewAllDetails() {
        return dao.ViewAllDetails();
    }

}
