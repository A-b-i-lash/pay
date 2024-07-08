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
        return repo.save(Add);
    }

    public SalaryDTO UpdateDetails(@RequestBody Integer id,SalaryDTO Update){
        Update.setId(id);
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
