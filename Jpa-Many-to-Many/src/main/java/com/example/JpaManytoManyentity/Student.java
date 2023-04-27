package com.example.JpaManytoManyentity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="STUDENT_TBL")
public class Student {
	private Long id;
	private String name;
	private int age;
	private String dept;
	
	
	public Student(Long id, String name, int age, String dept, Set<Student> students, Set<Course> course) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.students = students;
		this.course = course;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}


	@ManyToMany(mappedBy="courses",fetch= FetchType.LAZY)
	@JsonManagedReference
	private Set<Student> students;

	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSE_TABLE",
		joinColumns= {
				
				@JoinColumn(name="Student_id" , referencedColumnName="id")
		},
		inverseJoinColumns= {
				@JoinColumn(name="course_id",referencedColumnName="id")
	}
)
	@JsonManagedReference
	private Set<Course> course;
}
