package com.luban.service;

import com.shadow.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther Jack
 * @create 2020-02-14-19:34
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("22222");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(ac.getBean(Appconfig.class));
		System.out.println("adf");
		System.out.println("222");
	}
}
