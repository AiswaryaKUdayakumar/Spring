package com.ustemployee.employeereg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employeeregmodel {
	
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String experience;
	private String domain;
	public Employeeregmodel(int id, String name, String email, String experience, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.domain = domain;
	}
	public Employeeregmodel() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Object getEmpname() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmpname(Object empname) {
		// TODO Auto-generated method stub
		
	}
	public void setAddress(Object address) {
		// TODO Auto-generated method stub
		
	}
	public void setLocation(Object location) {
		// TODO Auto-generated method stub
		
	}
	
}
