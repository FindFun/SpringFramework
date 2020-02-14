package com.luban.service;

import com.shadow.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther Jack
 * @create 2020-02-14-19:34
 */
public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		ac.getBean(lubanService.class).xx();
		System.out.println("adf");
		System.out.println("222");
	}
}
