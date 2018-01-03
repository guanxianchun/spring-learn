package com.martin.spring.hibernate.service.impl;

import com.martin.spring.hibernate.dao.BookShopDao;
import com.martin.spring.hibernate.service.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookShopServiceImpl implements BookShopService {
	 @Autowired  
	    private BookShopDao bookShopDao;  
	      
	    /** 
	     * Spring Hibernate的事物流程 
	     * 1、方法开始之前 
	     * ①. 获取session 
	     * ②. 把Session与当前线程绑定，这样就可以使用sessionFactory的getCurrentSession()方法来获取session了 
	     * ③. 开启事务 
	     *  
	     * 2、若方法正常结束，未出现异常，则 
	     * ①.提交事物 
	     * ②.把session与当前线程解除绑定 
	     * ③.关闭session 
	     *  
	     * 3、若方法执行出现异常，则 
	     * ①.回滚事务 
	     * ②.把session与当前线程解除绑定 
	     * ③.关闭session 
	     */  
	    @Override  
	    public void purchase(String username, String isbn, int n) {  
	        float price=bookShopDao.findPriceByIsbn(isbn);  
	        bookShopDao.updateBookStock(isbn, n);  
	        bookShopDao.updateAccount(username, price, n);  
	    }  
}
