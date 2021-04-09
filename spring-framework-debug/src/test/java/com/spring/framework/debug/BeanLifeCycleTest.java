package com.spring.framework.debug;

import com.spring.framework.debug.fruit.Apple;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description: bean生命周期测试类
 * @author: wangliang
 * @date: 2021-03-15 10:43
 **/
public class BeanLifeCycleTest {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:ApplicationContext.xml");
		Apple apple = (Apple) ac.getBean("apple");
		System.out.println("获取梨" + apple.getPear() + "苹果数量" + apple.getNum());
	}
}