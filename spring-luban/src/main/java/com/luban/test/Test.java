package com.luban.test;

import com.luban.batis.LubanFactory;
import com.luban.batis.LubanInvocationHandler;
import com.luban.batis.LubanProxy;
import com.luban.services.*;
import com.luban.target.UserDaoImpl;
import com.luban.target.ZLServiceImpl;
import org.graalvm.compiler.lir.LIRInstruction;

import java.lang.reflect.Proxy;


public class Test {

	public static void main(String[] args)  {

		/**
		 * LubanFactory.class.getClassLoader(),classes,new LubanInvocationHandler()
		 */
		//实现了哪些接口
		Class[] classes = new Class[]{UserDao.class};

		//这里动态获取这个新的代理对象，LubanInvocationHandler里面的invoke方法，就是覆盖的方法
		UserDao o1 = (UserDao) Proxy.newProxyInstance(Test.class.getClassLoader(),classes,new LubanInvocationHandler());
		o1.query();
		o1.query2();


/*		//能够得到一个实现了UserDao的对象
		UserDao mapper = (UserDao) LubanFactory.getMapper(UserDao.class);

		//完成数据库的查询功能
		mapper.query();*/




		try {
			//自己实现动态代理的实现
//			UserDao proxy = (UserDao) LubanProxy.getInstance(new UserDaoImpl());
//			proxy.query();
//
//			ZLService zlService = new ZLServiceImpl();
//			ZLService instance = (ZLService) LubanProxy.getInstance(zlService);
//			instance.update("xxx");
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
