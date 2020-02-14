package com.shadow;

import com.luban.service.lubanService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


/**
 * Spring根据xml的形式：方法需要以bean的形式在xml文件中出现，并且所有内部变量，如果要使用xml文件赋值的话，需要提供get，set方法
 * @auther Jack
 * @create 2020-02-14-3:16
 */
@Service
public class Test {
	public static void main(String[] args) throws Exception{
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		ac.getBean(lubanService.class).xx();

//		//加载xml文件，里面配置了bean信息
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("Spring.xml");
//
//		//通过spring获取需要实例化的对象
//		TestService ts = (TestService)context.getBean("service1");
//		ts.pare();
//		System.out.println(ts.getFruit());
//		System.out.println(ts.getSize());
//		System.out.println(ts.getSugar());
//
//		//
//		Appconfig af = context.getBean("appconfig",Appconfig.class);
//		System.out.println(af.makeJuice());
//
//		System.out.println(context.getBean(Appconfig.class).makeJuice());
	}
}
