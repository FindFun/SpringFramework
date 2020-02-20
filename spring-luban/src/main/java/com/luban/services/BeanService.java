package com.luban.services;

import org.springframework.stereotype.Component;

/**
 * @auther Jack
 * @create 2020-02-20-19:33
 */
@Component
public class BeanService {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
