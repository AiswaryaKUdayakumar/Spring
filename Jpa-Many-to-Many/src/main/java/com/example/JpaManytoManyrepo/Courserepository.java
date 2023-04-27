/**
 * 
 */
package com.example.JpaManytoManyrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoManyentity.Course;

public interface Courserepository extends JpaRepository<Course,Long> {

	List<Course> findlessthanprice(double price);

}
