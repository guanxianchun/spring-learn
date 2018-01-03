package com.martin.spring.hibernate.dao;

public interface BookShopDao {
	/**
	 * 根据书号获取书的单价
	 * 
	 * @param isbn
	 * @return
	 */
	public int findPriceByIsbn(String isbn);

	/**
	 * 更新书的库存，使书号对应的书本减少n本
	 * 
	 * @param isbn
	 * @param n
	 */
	public void updateBookStock(String isbn, int n);

	/**
	 * 更新账户余额，使当前账户金额减少 price*n
	 * 
	 * @param username
	 * @param price
	 * @param n
	 * @throws BalanceNotEnough
	 */
	public void updateAccount(String username, float price, int n);
}