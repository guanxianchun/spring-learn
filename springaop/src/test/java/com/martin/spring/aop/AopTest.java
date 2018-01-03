package com.martin.spring.aop;

import com.martin.spring.service.CalculateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * @author 管贤春
 * @date 2017年12月15日 上午9:57:42
 * @email psyche19830113@163.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class AopTest {
	//服务实例
	@Autowired
	private CalculateService calculate;
	
	@Test
	public void testAop() {
		calculate.add(2, 3);
		calculate.divide(10, 1);
	}
}
