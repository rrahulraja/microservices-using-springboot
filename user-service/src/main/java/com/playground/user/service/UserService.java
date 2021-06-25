package com.playground.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.playground.user.entity.User;
import com.playground.user.repository.UserRepository;
import com.playground.user.vo.Department;
import com.playground.user.vo.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		log.info("Inside saveUser of UserService");
		return userRepository.save(user);
	}
	
	public ResponseTemplate getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment of UserService");
		
		ResponseTemplate vo = new ResponseTemplate();
		User user = userRepository.findById(userId).get();
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
