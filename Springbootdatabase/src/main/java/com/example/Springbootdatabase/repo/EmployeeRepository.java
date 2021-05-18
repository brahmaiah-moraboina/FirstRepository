package com.example.Springbootdatabase.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springbootdatabase.model.Employeee;


@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employeee, String> {

}
