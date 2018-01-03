package com.martin.spring.service;

/*
 * @author 管贤春
 * @date 2017年12月15日 上午9:29:55
 * @email psyche19830113@163.com
 */

public interface CalculateService {
	/**
	 * 加法运算接口
	 * @param i
	 * @param j
	 * @return
	 */
	public int add(int i, int j);
	/**
	 * 减法运算接口
	 * @param i
	 * @param j
	 * @return
	 */
	public int sub(int i, int j);

	/**
	 * 乘法运算接口
	 * @param i
	 * @param j
	 * @return
	 */
	public int multi(int i, int j);
	/**
	 * 除法运算接口
	 * @param i
	 * @param j
	 * @return
	 */
	public int divide(int i, int j);
}
