package com.nikoletakapsali.test.day10_library.Services;

import com.nikoletakapsali.test.day10_library.Entities.Author;
import com.nikoletakapsali.test.day10_library.Entities.Book;
import com.nikoletakapsali.test.day10_library.Entities.Theme;

import java.util.ArrayList;
import java.util.List;

public class BookServices {

    private List<Book> bookList = new ArrayList<Book>();

    public List<Book> AddBook(Book book) {
        bookList.add(book);
        return bookList;
    }

    public void removeBook(Integer id) {
        bookList.removeIf(book -> book.getId() == id);
        System.out.println("The book has been removed successfully!!!");
    }
    
    // add theme to themes
    
    // public void addTheme{};
     
    public List<Book> updateBook(int id, String newTitle ,String newAuthor, String newPublisher, int newYear, String newDesc, String newThemes) {
		for (Book book : bookList) {
			if (id == book.getId()) {
				if (newTitle != null)
					book.setTitle(newTitle);;
				if (newAuthor != null)
					book.setAuthor(newAuthor);
				if (newPublisher != null)
					book.setPublisher(newPublisher);
				if (newYear != 0)
					book.setPublishedYear(newYear);
				if (newDesc != null)
					book.setDescription(newDesc);
				if (newThemes != null)
					book.setThemes(newThemes);				
			}
		}
		return bookList;
	}
    
    
}

