package com.playground.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playground.department.entity.Department;
import com.playground.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);		
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside saveDepartment method of DepartmentService");
		
		return departmentRepository.findById(departmentId).get();
	}

}
