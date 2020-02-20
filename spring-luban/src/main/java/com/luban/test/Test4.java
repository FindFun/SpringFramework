package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.app.Entitlement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther Jack
 * @create 2020-02-20-19:36
 */
public class Test_beanDefinition {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ctx.register(Appconfig.class);
		ctx.refresh();


		Entitlement ent = (Entitlement)ctx.getBean("entitlement");
		System.out.println(ent.getName());
		System.out.println(ent.getTime());

		Entitlement ent2 = (Entitlement)ctx.getBean("entitlement2");
		System.out.println(ent2.getName());
		System.out.println(ent2.getTime());

		ctx.close();
	}




}
