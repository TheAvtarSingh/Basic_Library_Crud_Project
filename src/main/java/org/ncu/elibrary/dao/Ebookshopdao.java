package org.ncu.elibrary.dao;

import java.util.List;

import org.ncu.elibrary.entity.Books;

public interface Ebookshopdao {
	// method for fetching all the student records from the database
		public List<Books> loadBooks();
		
		// method for adding a record into the database
		public int createRecord(Books books);
		
		// method to update an existing record
		public int updateRecord(Books books);
		
		// method to fetch a single student record
		public Books getBook(int id);
		
		// method to delete a student record from the database
		public int deleteBook(int id);
		
		public List<Books> searchBooks(String title);
}
