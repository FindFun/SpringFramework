package com.luban.mapper;

import com.luban.services.BeanAndIndexService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @auther Jack
 * @create 2020-02-20-22:52
 * 在扫描完成之后
 * parsw put map 之后
 */
@Component
public class LubanBeanFactorPost implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("beanService");
		System.out.println("LubanBeanFactorPost这个自定义方法里，直接修改Beandefinition里面的map，得到BeanAndIndexService");
		beanDefinition.setBeanClass(BeanAndIndexService.class);
	}
}
