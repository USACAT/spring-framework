package com.spring.framework.debug.fruit;

/**
 * @program: spring
 * @description: 苹果
 * @author: wangliang
 * @date: 2021-03-15 10:35
 **/
public class Apple {
	Pear pear;
	int num;

	public Pear getPear() {
		return pear;
	}

	public void setPear(Pear pear) {
		this.pear = pear;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}