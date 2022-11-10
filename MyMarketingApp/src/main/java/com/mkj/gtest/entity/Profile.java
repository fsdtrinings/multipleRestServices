package com.mkj.gtest.entity;

import java.util.List;



public class Profile {

	private int profileId;
	private String fullName;
	
	private String city;
	private String locations;
	private String email;
	private long phoneNumber;
	private String companyName;
	
	
	public Profile(String fullName, String city, String locations, String email, long phoneNumber, String companyName) {
		super();
		this.fullName = fullName;
		this.city = city;
		this.locations = locations;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
	}

	

	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Profile(int profileId, String fullName, String city, String locations, String email, long phoneNumber,
			String companyName) {
		super();
		this.profileId = profileId;
		this.fullName = fullName;
		this.city = city;
		this.locations = locations;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
	}




	public int getProfileId() {
		return profileId;
	}


	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getLocations() {
		return locations;
	}


	public void setLocations(String locations) {
		this.locations = locations;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	
	
}//end class
