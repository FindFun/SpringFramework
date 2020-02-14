package com.shadow;

import org.springframework.stereotype.Service;

/**
 * @auther Jack
 * @create 2020-02-14-3:17
 */
@Service
public class TestService {

	/**
	 * java类中定义的所有变量，需要提供get，set方法，这样xml里面配置才有效
	 */
	private String fruit;   // 类型
	private String sugar;   // 糖分描述
	private String size;    // 大小杯

	public void pare(){

		System.out.println("hello Spring");
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getSugar() {
		return sugar;
	}

	public void setSugar(String sugar) {
		this.sugar = sugar;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
