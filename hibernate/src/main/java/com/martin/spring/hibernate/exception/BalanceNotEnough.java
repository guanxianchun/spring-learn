package com.martin.spring.hibernate.exception;

public class BalanceNotEnough extends RuntimeException {

	/** 
     *  
     */
	private static final long serialVersionUID = 1L;

	public BalanceNotEnough(String msg) {
		super(msg);
	}

}