package com.teomaik.demospring.books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.teomaik.demospring.Repositories.BookRepository;
import com.teomaik.demospring.authors.Author;
import com.teomaik.demospring.authors.AuthorServices;
import com.teomaik.demospring.themes.Theme;
import com.teomaik.demospring.themes.ThemeServices;

@Service
public class BookServices {

	@Autowired
	AuthorServices authorServices;
	@Autowired
	ThemeServices themeServices;
	@Autowired
	BookRepository repository;
	
	
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	public List<Book> addBook(Book book) {
		book.setAuthor(null); // Για να μην εχουμε author που δεν υπαρχει στη ΒΔ
		getAllBooks().add(book); //Μπορώ να δημιουργήσω μέθοδο που να ελέγχει αν υπάρχει ο author στην ΒΔ και αν δεν υπάρχει προσθέτει		
		return getAllBooks();
	} 

	public List<Book> removeBook(Integer id) {
		getAllBooks().removeIf(book -> book.getId() == id);
		return getAllBooks();
	}

	public List<Book> updateBook(int id, String title, Author author, String publiser, int publishYear,
			String description, List<Theme> theme) {
		for (Book book : getAllBooks()) {
			if (book.getId() == id) {
				if (title != null)
					book.setTitle(title);
				if (author != null)
					book.setAuthor(author);
				if (publiser != null)
					book.setPubliser(publiser);
				if (publishYear > 0)
					book.setPublishYear(publishYear);
				if (description != null)
					book.setDescription(description);
				if (theme != null)
					book.setTheme(theme);
				return getAllBooks();
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course with id " + id + " dosnt exist");
	}

    public List<Book> addTheme(Integer bookId, Integer themeId){
        for(Book book : getAllBooks()) {
            if (book.getId() == bookId){
                for(Theme theme: themeServices.getAllThemes()){
                    if (theme.getId() == themeId){
                    	book.addTheme(theme);
                    }
                }
            }
        }
        return getAllBooks();
    }

}
