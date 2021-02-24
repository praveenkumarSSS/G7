package com.example.jdbcex.model;

public class Book {
	
	int id;
	String author;
	String desc;
	String name;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int id, String author, String desc, String name, int price) {
		super();
		this.id = id;
		this.author = author;
		this.desc = desc;
		this.name = name;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


}