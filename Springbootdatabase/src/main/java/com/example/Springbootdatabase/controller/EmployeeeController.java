package com.example.Springbootdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springbootdatabase.model.Employeee;
import com.example.Springbootdatabase.service.EmployeeeService;

@RestController
public class EmployeeeController {
	
	@Autowired
	EmployeeeService employeeeService;
	
	@GetMapping("/ShowAll")
	public List<Employeee> showAllEmployeees() {
       return employeeeService.getAllEmployeees();
      }
	@PostMapping
	public Employeee addEmployeee(Employeee employeee) {
		return employeeeService.AddEmployeee(employeee);
	}
	@PostMapping
	public void deleteEmployeee(Employeee employeee) {
		 employeeeService.DeleteEmployeee(employeee);
	}
	
}
