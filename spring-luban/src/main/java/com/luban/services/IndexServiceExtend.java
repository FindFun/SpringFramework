package com.luban.services;

import org.springframework.stereotype.Component;

/**
 * @auther Jack
 * @create 2020-02-20-20:13
 */

public class IndexServiceExtend implements Service{


	public  IndexServiceExtend(BeanService beanService){

		System.out.println("beanService");
	}

	@Override
	public void query() {

	}
}
