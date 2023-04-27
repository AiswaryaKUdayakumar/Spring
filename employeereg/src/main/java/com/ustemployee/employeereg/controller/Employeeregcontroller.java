package com.ustemployee.employeereg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustemployee.employeereg.model.Employeeregmodel;
import com.ustemployee.employeereg.service.Employeeregservice;


@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class Employeeregcontroller {
	@Autowired
	private Employeeregservice employeeService;
	
	@PostMapping("/addemps")
	public Employeeregmodel addEmployee(@RequestBody Employeeregmodel employee) {
		return employeeService.createEmployee(employee);
	}
	@GetMapping ("/employees")
	public List<Employeeregmodel> getAllEmployee(){
		return employeeService.getEmployee();
	}
	@GetMapping("/employees/{id}")
	public Employeeregmodel getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	@PutMapping("/updateemployee/{id}")
	public Employeeregmodel updateEmployee(@RequestBody Employeeregmodel employee) {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}
}
