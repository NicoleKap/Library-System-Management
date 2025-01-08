package com.nikoletakapsali.test.day10_library.Services;

import com.nikoletakapsali.test.day10_library.Entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServices {

    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

}
