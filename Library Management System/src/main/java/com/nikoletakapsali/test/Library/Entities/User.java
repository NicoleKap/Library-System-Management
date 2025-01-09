package com.nikoletakapsali.test.Library.Entities;

public class User {
	
	private int id;
	private String name;
	private String lastName;
	private String rentalDate;
	
	
	
	public User(int id, String name, String lastName, String rentalDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.rentalDate = rentalDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}
	
	
}
