package com.mkj.gtest.entity;

import java.util.List;



public class AppUser {

	
	private int userId;
	
	
	private String username;
	private String password;
	private String role;  // admin , tech-user , customer , corporates 
	private Profile userProfile;
	private List<String> hobbies;

	private List<Post> allPosts;
	
	
	
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AppUser(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}



	public AppUser(int userId, String username, String password, String role, Profile userProfile, List<String> hobbies,
			List<Post> allPosts) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.userProfile = userProfile;
		this.hobbies = hobbies;
		this.allPosts = allPosts;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public Profile getUserProfile() {
		return userProfile;
	}



	public void setUserProfile(Profile userProfile) {
		this.userProfile = userProfile;
	}



	public List<String> getHobbies() {
		return hobbies;
	}



	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}



	public List<Post> getAllPosts() {
		return allPosts;
	}



	public void setAllPosts(List<Post> allPosts) {
		this.allPosts = allPosts;
	}
	
	
	
	
	
	
}
