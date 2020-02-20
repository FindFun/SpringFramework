package com.luban.test;

import com.luban.batis.LubanProxy;
import com.luban.services.*;
import com.luban.target.UserDaoImpl;
import com.luban.target.ZLServiceImpl;

import java.lang.reflect.Proxy;


public class Test {

	public static void main(String[] args)  {
//		Object o = Proxy.newProxyInstance();
		try {
			UserDao proxy = (UserDao) LubanProxy.getInstance(new UserDaoImpl());
			proxy.query();

			ZLService zlService = new ZLServiceImpl();
			ZLService instance = (ZLService) LubanProxy.getInstance(zlService);
			instance.update("xxx");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		UserDao target = new UserDaoImpl();
//
//		UserDao pxory = new $ProxyLuban(target);
//		pxory.query();
//		ZLService zlService = new ZLServiceImpl();
//		ZLService proxy = new $ProxyLuban(zlService);
//		proxy.update("aaa");


	}


}
