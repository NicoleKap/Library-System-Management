package com.nikoletakapsali.test.Library.Entities;


import java.util.ArrayList;
import java.util.List;

//In this class we have the entity Book with its attributes

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publishedYear;
    private String description;
    private String themes;
    private boolean rented;
   

	public Book(int id, String title,String author, String publisher, int publishedYear, String description,
			String themes) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishedYear = publishedYear;
		this.description = description;
		this.themes = themes;
		this.rented = false;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThemes() {
        return themes;
    }
    
    public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	public void setThemes(String newThemes) {
        this.themes = newThemes;
    }

  


}
