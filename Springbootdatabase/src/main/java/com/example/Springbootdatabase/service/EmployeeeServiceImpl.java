package com.example.Springbootdatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springbootdatabase.model.Employeee;
import com.example.Springbootdatabase.repo.EmployeeRepository;
@Service
public class EmployeeeServiceImpl implements EmployeeeService {
	
	@Autowired
	EmployeeRepository employeeeRepository;

	@Override
	public List<Employeee> getAllEmployeees() {
		// TODO Auto-generated method stub
		return employeeeRepository.findAll();
		
	}

	@Override
	public Employeee AddEmployeee(Employeee employeee) {
		// TODO Auto-generated method stub
		return employeeeRepository.save(employeee);
	}

	@Override
	public void DeleteEmployeee(Employeee employeee) {
		employeeeRepository.delete(employeee);
		
	}

}
