package com.spring.framework.debug;

import com.spring.framework.debug.fruit.Apple;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @program: spring
 * @description: bean生命周期测试类
 * @author: wangliang
 * @date: 2021-03-15 10:43
 **/
public class BeanLifeCycleTest {
	@Test
	public void test() throws InterruptedException {
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		System.out.println(str1 == str2);
//		System.out.println(str1 == "abc");
//		System.out.println(str1.intern() == "abc");
//		System.out.println(str1.intern());
//
//		while(true) {
//			Thread.sleep(2000);
//		}

		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:ApplicationContext.xml");
		Apple apple = (Apple) ac.getBean("apple");
		System.out.println("获取梨" + apple.getPear() + "苹果数量" + apple.getNum());
	}
}