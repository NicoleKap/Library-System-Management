package com.nikoletakapsali.test.Library.Services;

import java.util.ArrayList;
import java.util.List;

import com.nikoletakapsali.test.Library.Entities.Book;
import com.nikoletakapsali.test.Library.Entities.Rent;
import com.nikoletakapsali.test.Library.Entities.User;

public class RentService {

	List<Rent> rents = new ArrayList<>();
	
	public void rentAbook(Book book, User user) {
		
		if(book.isRented()==false) {
			book.setRented(true);
			System.out.println("The user " + user.getName() + " " + user.getLastName() +
						" rented the book " + book.getTitle());
		}else {
			System.out.println("The book is not available");
		}
		
	}
	
	public void cancelRental(int id) {
		
		if(rents.get(id).equals(id)) {
			rents.removeIf(rent -> rent.getId() == id);
			System.out.println("The rental has been cancelled successfully");
		}else {
			System.out.println("This rental does not exist");
		}
		
		
		
			
	}
	
}
