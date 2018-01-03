package com.martin.spring.hibernate;

import com.martin.spring.hibernate.service.BookShopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml") 
public class SpringHibernateTest {
	
	@Autowired  
    private BookShopService bookShopService;  
      
    @Test  
    public void testPurchaseBook(){  
        bookShopService.purchase("gxc", "spring", 2);  
    }  
}
