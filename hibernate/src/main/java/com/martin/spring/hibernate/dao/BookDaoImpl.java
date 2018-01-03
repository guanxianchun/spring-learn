package com.martin.spring.hibernate.dao;

import com.martin.spring.hibernate.exception.BalanceNotEnough;
import com.martin.spring.hibernate.exception.BookStockNotEnoughException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookShopDao {
	
	@Autowired  
    private SessionFactory sessionfactory;  
      
    /** 
     * 获取与当前线程绑定的session 
     * @return 
     */  
    private Session getSession(){  
        return sessionfactory.getCurrentSession();    
    }  
      
    @Override  
    public int findPriceByIsbn(String isbn) {  
        String hql="select b.price from Book b where b.isbn=?";  
        int price=(int) getSession().createQuery(hql).setString(0, isbn).uniqueResult();  
        return price;  
    }  
  
    @Override  
    public void updateBookStock(String isbn, int n) {  
        //验证书的库存是否充足  
        String hq="Select b.stock from Book b where b.isbn=?";  
        int stock=(int) getSession().createQuery(hq).setString(0, isbn).uniqueResult();  
        if(stock < n){  
             throw new BookStockNotEnoughException("库存不足");  
        }     
        String hql="update Book b set b.stock=b.stock-? where b.isbn=?";  
        Query query=getSession().createQuery(hql).setInteger(0, n).setString(1, isbn);  
        query.executeUpdate();        
    }  
  
    @Override  
    public void updateAccount(String username, float price, int n) {  
        //验证余额是否足够  
        String hql="select a.balance from UserAccount a where a.userName=?";  
        int balance=(int) getSession().createQuery(hql).setString(0, username).uniqueResult();  
        if(balance < n*price){  
            throw new BalanceNotEnough("余额不足");  
        }  
        String hql1="update UserAccount a set a.balance=a.balance-? where a.userName=?";  
        getSession().createQuery(hql1).setFloat(0, n*price).setString(1, username).executeUpdate();  
    }  
}
