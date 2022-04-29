package org.ncu.elibrary.service;

import java.util.List;

import org.ncu.elibrary.dao.Ebookshopdao;
import org.ncu.elibrary.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EbookshopServiceimpl implements EbookshopService {

	@Autowired
	Ebookshopdao ebookshopdao;
	
	@Override
	public List<Books> loadBooks() {
		// TODO Auto-generated method stub
		List<Books> bookslist = ebookshopdao.loadBooks();
		
		return bookslist;
	}

	@Override
	public int createRecord(Books books) {
		// TODO Auto-generated method stub
		int records = ebookshopdao.createRecord(books);
		return records;
	}

	@Override
	public int updateRecord(Books books) {
		// TODO Auto-generated method stub
		int records = ebookshopdao.updateRecord(books);
		return records;
	}

	@Override
	public Books getBook(int id) {
		// TODO Auto-generated method stub
		Books books = ebookshopdao.getBook(id);
		return books;
	}

	@Override
	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		int records = ebookshopdao.deleteBook(id);
		return records;

	}

	@Override
	public List<Books> searchBooks(String title) {
		// TODO Auto-generated method stub
List<Books> bookslist = ebookshopdao.searchBooks(title);

//Adding businness Logic
if (title.equals("More Java for dummies")) {
	System.out.println("Buy This");
}
		
		return bookslist;
	}

}
