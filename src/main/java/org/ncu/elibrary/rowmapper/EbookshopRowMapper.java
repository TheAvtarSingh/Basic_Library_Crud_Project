package org.ncu.elibrary.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.elibrary.entity.Books;
import org.springframework.jdbc.core.RowMapper;

public class EbookshopRowMapper implements RowMapper<Books> {

	@Override
	public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Books books = new Books();
		books.setId(rs.getInt("id"));
		books.setTitle(rs.getString("title"));
		books.setAuthor(rs.getString("author"));
		books.setPrice(rs.getDouble("price"));
		books.setQty(rs.getInt("qty"));
		return books;
	}

}
