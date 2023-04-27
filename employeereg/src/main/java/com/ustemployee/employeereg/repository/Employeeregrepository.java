package com.ustemployee.employeereg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ustemployee.employeereg.model.Employeeregmodel;

@Repository
public interface Employeeregrepository extends JpaRepository<Employeeregmodel,Integer> {

}
