package com.playground.user.vo;

import com.playground.user.entity.User;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
	
	private User user;
	private Department department;

}
