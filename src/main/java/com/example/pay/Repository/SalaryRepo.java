package com.example.pay.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pay.DTO.SalaryDTO;

public interface SalaryRepo extends JpaRepository<SalaryDTO,Integer>{

}
