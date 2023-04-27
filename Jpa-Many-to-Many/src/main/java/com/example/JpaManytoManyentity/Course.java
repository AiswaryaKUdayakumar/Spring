package com.example.JpaManytoManyentity;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="COURSE_TBL")
public class Course {
@Id
@GeneratedValue
	private Long id;
	private String title;
	private String abbrevation;
	private int modules;
	private double fee;
	public Course(Long id, String title, String abbrevation, int modules, double fee) {
		super();
		this.id = id;
		this.title = title;
		this.abbrevation = abbrevation;
		this.modules = modules;
		this.fee = fee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAbbrevation() {
		return abbrevation;
	}
	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}
	public int getModules() {
		return modules;
	}
	public void setModules(int modules) {
		this.modules = modules;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
		}
	


