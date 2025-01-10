package com.teomaik.demospring.authors;

import jakarta.persistence.Column;

public class Author {

	@Column(name = "author_id", nullable = false)
    private Integer id;
	
	@Column(name = "name", nullable = false)
	private String fisrtName;
	
	@Column(name = "lastName", nullable = false)
	private String lastName;
	
	@Column(name = "dateOfBirth", nullable = true) 
	private String dateOfBirth;
	
	public Author(Integer id, String fisrtName, String lastName, String dateOfBirth) {
		this.id = id;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
