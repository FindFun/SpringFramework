package com.luban.services;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * 1、beanService == null   因为没有自动装配
 * 2、beanService != null   不正常 没有自动装配
 */
@Component
@Scope("prototype")
public class IndexService implements Service{



	public void query() {
		System.out.println("logic");
	}


}
