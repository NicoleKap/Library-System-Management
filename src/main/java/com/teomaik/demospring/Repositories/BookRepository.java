package com.teomaik.demospring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teomaik.demospring.books.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
	
}


