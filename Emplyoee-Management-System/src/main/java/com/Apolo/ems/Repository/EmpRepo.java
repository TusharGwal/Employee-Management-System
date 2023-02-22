package com.Apolo.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Apolo.ems.Entity.Employee;


@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}
