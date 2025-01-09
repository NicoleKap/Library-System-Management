package com.nikoletakapsali.test.day10_library.Services;

import java.util.List;

import com.nikoletakapsali.test.day10_library.Entities.Author;

public class AuthorServices {
	
	private List<Author> authors = new ArrayList<Author>();

	public void addAuthor(Author author) {
		
	}
	
	public void removeAuthor(Author author) {
		
	}
	
	// Update the name and the date of an author
	
	public List<Author> updateAuthor(int id, String new_name, String new_date){
		for (Author author : authors) {
			if (author.getId() == id) {
				if (new_name != null)
					author.setFirstName(new_name);
				if (new_date != null)
					author.setDateOfBirth(new_date);
			}
		}
		return authors;
}
	

