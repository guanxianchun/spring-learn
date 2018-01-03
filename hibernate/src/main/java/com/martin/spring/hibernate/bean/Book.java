package com.martin.spring.hibernate.bean;
/**
 * 
 * @author 管贤春
 * @时间 2017年12月18日 上午10:12:39
 * @Email psyche19830113@163.com
 * @Description 书的实体类
 */
public class Book {
	
	private Integer id;
	
	private String bookName;
	
	private String isbn;
	
	private int price;
	
	private int stock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
