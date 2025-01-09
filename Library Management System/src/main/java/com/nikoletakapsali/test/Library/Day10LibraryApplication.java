package com.nikoletakapsali.test.day10_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nikoletakapsali.test.day10_library.Entities.Book;
import com.nikoletakapsali.test.day10_library.Entities.Theme;

@SpringBootApplication
public class Day10LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day10LibraryApplication.class, args);
        
        Theme theme = new Theme(1245,"Spring","A novela book");
        Book book = new Book(1450,"Mi error fue amarte","Martina Fernandez","ABC",2013,"Novela","Romance");
        
    }

}
