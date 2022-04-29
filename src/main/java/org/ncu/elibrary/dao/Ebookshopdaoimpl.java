package org.ncu.elibrary.dao;

import java.util.List;

import org.ncu.elibrary.entity.Books;
import org.ncu.elibrary.rowmapper.EbookshopRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class Ebookshopdaoimpl implements Ebookshopdao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Books> loadBooks() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM books";
		List<Books> listofBooks = jdbcTemplate.query(query, new EbookshopRowMapper());
		return listofBooks;
	}

	@Override
	public int createRecord(Books books) {
		// TODO Auto-generated method stub
		String query = "insert into books values(?,?,?,?,?)";
		Object records[] = { books.getId(), books.getTitle(), books.getAuthor(),books.getPrice(),books.getQty() };
		int recordInserted = jdbcTemplate.update(query, records);
		return recordInserted;
	}

	@Override
	public int updateRecord(Books books) {
		// TODO Auto-generated method stub
		String sql = "update books set title = ?, author = ?, price = ?, qty = ? where id = ?";
		Object[] args = { books.getTitle(), books.getAuthor(),books.getPrice(),books.getQty(),books.getId()};
		int recordsUpdated = jdbcTemplate.update(sql, args);
		return recordsUpdated;
	}

	@Override
	public Books getBook(int id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String sql = "select * from books where id = ?";
				
				Books books = jdbcTemplate.queryForObject(sql, new EbookshopRowMapper(), id);
				
				return books;
	}

	@Override
	public int deleteBook(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from books where id = ?";
		int recordsUpdated =jdbcTemplate.update(sql, id);
		return recordsUpdated;
	}

	@Override
	public List<Books> searchBooks(String title) {
		// TODO Auto-generated method stub
		String sql = "select * from books where title = ?";
		List<Books> listofSeachedBooks = jdbcTemplate.query(sql, new EbookshopRowMapper(),title);
		return listofSeachedBooks;
	}

}
