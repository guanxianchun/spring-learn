package com.martin.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/*
 * @author 管贤春
 * @date 2017年12月15日 上午9:28:30
 * @email psyche19830113@163.com
 * 　　定义切面LoggerAspect类
 * 1. 使用@Component注解 把其放入到IOC容器中
 * 2. 使用Aspect注解 声明该类是一个切面
 * 3. 在类方法上声明通知
 * 4. 指定切点表示式
 */
@Aspect
@Component
public class LoggerAspect {
	//切点
	@Pointcut("execution(* com.martin.spring.service.CalculateService.*(int,int))")
	private void aspectMethod(){};
	/**
	 * 声明该方法为一个前置通知
	 * @return
	 */
	@Before(value = "aspectMethod()")
//	@Before(value = "execution(* com.martin.spring.service.CalculateService.*(int,int))")
	public void beforeMethod(JoinPoint joinPoint) {
		//通过Joinpoint获取方法名
		String methodName = joinPoint.getSignature().getName();
		//获取方法的参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(" 日志前置通知："+methodName+" 参数："+args);
	}
	
	@After(value="aspectMethod()")
	public void afterMethod(JoinPoint joinPoint) {
		//通过Joinpoint获取方法名
		String methodName = joinPoint.getSignature().getName();
		//获取方法的参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(" 日志后置通知："+methodName+" 参数："+args);
	}
	
	@AfterReturning(value="aspectMethod()",returning="result")
	public Object doReturn(JoinPoint joinPoint,Object result) {
		//通过Joinpoint获取方法名
		String methodName = joinPoint.getSignature().getName();
		//获取方法的参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(" 日志返回通知："+methodName+" 参数："+args+" 结果="+result);
		return result;
	}
	
	@AfterThrowing(value="aspectMethod()",throwing="ex")
	public void doThrowing(JoinPoint joinPoint,Throwable ex) {
		//通过Joinpoint获取方法名
		String methodName = joinPoint.getSignature().getName();
		//获取方法的参数
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println(" 日志异常通知："+methodName+" 参数："+args+" 发生异常："+ex.getMessage());
	}
	
//	@Around(value="aspectMethod()")
//	public void aroudMethod(ProceedingJoinPoint proceedingJoinPoint) {
//		
//		//通过Joinpoint获取方法名
//		String methodName = proceedingJoinPoint.getSignature().getName();
//		//获取方法的参数
//		List<Object> args = Arrays.asList(proceedingJoinPoint.getArgs());
//		System.out.println(" 日志环绕通知："+methodName+" 参数："+args+" 发生异常：");
//		//前置通知：
//		try {
//			Object result = proceedingJoinPoint.proceed();
//			//返回通知：
//		} catch (Throwable e) {
//			//异常通知：
//		}
//		//后置通知：
//		
//	}
}
