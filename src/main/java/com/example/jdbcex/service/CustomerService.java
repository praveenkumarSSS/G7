package com.example.jdbcex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbcex.model.Book;
import com.example.jdbcex.repository.CustomerRepo;

@RestController
public class CustomerService {
	
	@Autowired
	CustomerRepo repos;
	
	@GetMapping("/getinfos")
	public List<String> getInformation()
	{
		return repos.getInformationData();
	}
	
@GetMapping("/gets")
public List<Book> newinfo()
{
	return repos.newdata();
}
	
}
