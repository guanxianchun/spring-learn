package com.martin.spring.hibernate.service;

public interface BookShopService {

	/**
	 * 用户购买n本书
	 * 
	 * @param username
	 * @param isbn
	 * @param n
	 */
	public void purchase(String username, String isbn, int n);
}
