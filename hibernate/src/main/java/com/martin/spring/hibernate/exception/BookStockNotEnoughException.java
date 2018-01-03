package com.martin.spring.hibernate.exception;


public class BookStockNotEnoughException extends RuntimeException {  
	  
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
      
    public BookStockNotEnoughException(String msg) {  
        super(msg);  
    }  
}  