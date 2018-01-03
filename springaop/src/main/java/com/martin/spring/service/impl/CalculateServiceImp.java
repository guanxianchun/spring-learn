package com.martin.spring.service.impl;

import com.martin.spring.service.CalculateService;
import org.springframework.stereotype.Component;

/*
 * @author 管贤春
 * @date 2017年12月15日 上午9:33:58
 * @email psyche19830113@163.com
 * 
 */

@Component("calculateService")
public class CalculateServiceImp implements CalculateService {

	public int add(int i, int j) {
		int result = i+j;
		return result;
	}

	public int sub(int i, int j) {
		int result = i-j;
		return result;
	}

	public int multi(int i, int j) {
		int result = i*j;
		return result;
	}

	public int divide(int i, int j) {
		int result = i/j;
		return result;
	}

}
