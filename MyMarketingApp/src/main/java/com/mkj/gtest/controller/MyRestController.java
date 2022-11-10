package com.mkj.gtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mkj.gtest.entity.AppUser;

@RestController
@RequestMapping("/api/data")
public class MyRestController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/get/{username}")
	public String getData(@PathVariable String username)
	{
		String urltohit = "http://localhost:8001/facebook/validate/"+username;
		
		
		String validatedUsername = restTemplate.getForObject(urltohit,String.class);
		
		return validatedUsername+" is valid username ";
		
	}
	
	@GetMapping("/get/allusers")
	public List<AppUser> getData2()
	{
		// 8002 : have to get all records from the application , which deployed on 8001
		
		String urltohit = "http://localhost:8001/facebook/users";
		
		
		List<AppUser> allUsersfrom8001 = restTemplate.getForObject(urltohit,List.class);
		
		return allUsersfrom8001;
		
	}
	
}
