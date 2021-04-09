package com.spring.framework.debug.aop;

/**
 * @program: spring
 * @description: 水果拦截
 * @author: wangliang
 * @date: 2021-03-15 17:06
 **/
public class FruitAspect {

	public void beforeLog() {
		System.out.println("方法执行前拦截");
	}

	public void afterLog() {
		System.out.println("方法执行后拦截");
	}
}