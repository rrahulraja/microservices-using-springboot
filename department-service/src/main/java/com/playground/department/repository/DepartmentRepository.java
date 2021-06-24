package com.playground.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playground.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {	

}
