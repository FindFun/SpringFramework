package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.SocketUtils;

/**
 * @auther Jack
 * @create 2020-02-14-19:18
 */
@Component
public class lubanService {

	@Autowired
	ziluService zl;

	public void xx(){

		System.out.println(zl);
	}
}
