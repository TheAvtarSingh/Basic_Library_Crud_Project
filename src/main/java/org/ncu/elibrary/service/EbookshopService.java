package org.ncu.elibrary.service;

import java.util.List;

import org.ncu.elibrary.entity.Books;

public interface EbookshopService  {

	
	public List<Books> loadBooks();

	
	public int createRecord(Books books);

	
	public int updateRecord(Books books);

	
	public Books getBook(int id);

	
	public int deleteBook(int id);

	
	public List<Books> searchBooks(String title);

}
