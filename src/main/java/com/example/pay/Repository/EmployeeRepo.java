package com.example.pay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pay.DTO.EmployeeDTO;

public interface EmployeeRepo extends JpaRepository<EmployeeDTO,Integer>{

}
