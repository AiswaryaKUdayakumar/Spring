package com.ustemployee.employeereg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustemployee.employeereg.model.Employeeregmodel;
import com.ustemployee.employeereg.repository.Employeeregrepository;


@RestController
@RequestMapping("registration")
public class Employeeregservice {

	@Autowired
	private Employeeregrepository repo;
	public Employeeregmodel createEmployee(Employeeregmodel employee) {
		return repo.save(employee);
	}

	public List<Employeeregmodel> getEmployee() {
		
		return repo.findAll();
	}

	public Employeeregmodel getEmployeeById(int id) {
		
		return repo.findById(id).orElse(null);
	}

	public Employeeregmodel updateEmployee(Employeeregmodel employee) {
		Employeeregmodel oldemp=null;
		Optional<Employeeregmodel>optionalemployee=repo.findById(employee.getId());
		if (optionalemployee.isPresent()) {
			oldemp=optionalemployee.get();
			oldemp.setEmpname(employee.getName());
			oldemp.setEmpname(employee.getEmail());
			
			repo.save(oldemp);
		}else {
			return new Employeeregmodel();
		}
		return oldemp;
	}
	public String deleteEmployeeById(int id) {
		repo.deleteById(id);
		return "the employee information is deleted";
	}

}
