package com.martin.spring.hibernate.bean;
/**
 * 
 * @author 管贤春
 * @时间 2017年12月18日 上午10:08:43
 * @Email psyche19830113@163.com
 * @Description 用户账户的实体类
 */
public class UserAccount {
	
	private Integer id;
	
	private String userName;
	
	private int balance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}

