package com.mycompany.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	// custom list of countries instead of using hard coded values
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		// populate countryOptions with ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("ETH", "Ethiopia");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
	
}
