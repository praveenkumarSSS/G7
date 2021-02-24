package com.example.jdbcex.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.jdbcex.model.Book;

@Repository
public class CustomerRepo {
	
	@Autowired
	JdbcTemplate template;

	public List<String> getInformationData() {
		// TODO Auto-generated method stub
		List<String> str=new ArrayList<>();
		
		String sql="select name from testdata.book";
		
		 str.addAll(template.queryForList(sql, String.class));
		 
		 return str;
	}
	
	
	public List<Book> newdata()
	{
	return template.query("select id,author,des,name,price from testdata.book", new RowMapper<Book>() {    	
	
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Book books=new Book();
		books.setId(rs.getInt("id"));
		books.setName(rs.getString("author"));
		books.setDesc(rs.getString("des"));
		books.setName(rs.getString("name"));
		books.setPrice(rs.getInt("price"));
		
		return books;
		
		/*
		 * int id; String author; String desc; String name; int price;
		 */
	}
	});   
	
	
	    
}


	
}
	    
	


