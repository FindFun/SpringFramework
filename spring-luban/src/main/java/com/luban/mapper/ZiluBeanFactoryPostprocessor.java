package com.luban.mapper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

public class ZiluBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition a = (GenericBeanDefinition)
				beanFactory.getBeanDefinition("a");
		//打印A 的注入模型
		System.out.println("a mode="+a.getAutowireMode());

	}
}
