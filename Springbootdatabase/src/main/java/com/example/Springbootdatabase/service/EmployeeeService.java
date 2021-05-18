package com.example.Springbootdatabase.service;

import java.util.List;

import com.example.Springbootdatabase.model.Employeee;

public interface EmployeeeService {
	public List<Employeee> getAllEmployeees();
     public Employeee AddEmployeee(Employeee employeee);
     public void  DeleteEmployeee(Employeee employeee);
}
