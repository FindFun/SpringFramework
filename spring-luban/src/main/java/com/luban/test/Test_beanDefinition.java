package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.app.Entitlement;
import com.luban.services.BeanAndIndexService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther Jack
 * @create 2020-02-20-19:36
 */
public class Test_beanDefinition {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
//		ctx.register(Appconfig.class);
//		ctx.refresh();

		/**
		 * 用来描述Spring中Bean的一个对象
		 */
//		BeanDefinition

		/**
		 * 1、扫描
		 * 2、parse     beanDefinition --------object----map（"xxx",object）
		 * 3、validate  验证
		 * 4、life      遍历map，得到beanDefinition  实例化
		 *
		 * Spring容器{
		 * 		bean 存在Spring容器当中
		 * 		ac.getBean >= 容器.map.getBean==singletonObject.get()==map.getBean()
		 * 		singletonObject    单例池=map
		 * }
 		 */
		Object bean = ctx.getBean(BeanAndIndexService.class);
//		System.out.println(bean);

		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
	}
}
