package com.example.pay.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.pay.DTO.EmployeeDTO;
import com.example.pay.Repository.EmployeeRepo;

@Repository
public class EmployeeDAO {

    @Autowired
    private EmployeeRepo repo;

    public EmployeeDTO AddDetails(@RequestBody EmployeeDTO Add){
        return repo.save(Add);
    }

    public EmployeeDTO UpdateDetails(@RequestBody Integer id,EmployeeDTO Update){
        Update.setId(id);
        return repo.save(Update);
    }

    public String DeleteDetails(@RequestBody int id){
        repo.deleteById(id);
        return "Sucess";
    }

    public EmployeeDTO ViewDetails(int id){
        return repo.findById(id).get();
    }

    public List<EmployeeDTO>  ViewAllDetails(){
        return repo.findAll();
    }


}
