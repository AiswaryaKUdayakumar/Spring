/**
 * 
 */
package com.example.JpaManytoManycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaManytoManyentity.Course;
import com.example.JpaManytoManyentity.Student;
import com.example.JpaManytoManyrepo.Courserepository;
import com.example.JpaManytoManyrepo.Studentrepository;

@RestController
@RequestMapping("/Student/course")
public class StudentCourseController {
	@Autowired
	private Studentrepository studentrepo;
	@Autowired
	private Courserepository courserepo;
	
	
	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student) {
		return studentrepo.save(student);
	}
	@GetMapping
	public List<Student> findAllStudents(){
		return studentrepo.findAll();
	}
	
	@GetMapping("/{studentid}")
	public Student findStudent(@PathVariable long studentid) {
		return studentrepo.findById(studentid).orElse(null);
	}
	@GetMapping("/find/{name}")
	public List<Student> findStudentByName(@PathVariable String name){
		return studentrepo.findByNameContaining(name);
	}
	@GetMapping("/search/{price}")
	public List<Course> findCourselessthanprice(@PathVariable double price){
		return courserepo.findlessthanprice(price);
	}
}

