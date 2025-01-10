package com.teomaik.demospring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teomaik.demospring.books.Book;
import com.teomaik.demospring.books.BookServices;

@RestController
@RequestMapping("books")
public class BookController {

	@Autowired
	BookServices bookServices;
	
	@GetMapping("/all")
	public List<Book> getAllBooks(){
		return bookServices.getAllBooks();
	}
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book) {
		bookServices.addBook(book);
		return "The book added";
	}
}
