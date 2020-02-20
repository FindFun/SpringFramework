package com.luban.test;

import com.luban.batis.LubanProxy;
import com.luban.services.UserDao;
import com.luban.target.UserDaoImpl;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

/**
 * @auther Jack
 * @create 2020-02-20-15:27
 */
public class Test2 {

	public static void main(String[] args){
		try {
			LubanProxy.getInstance(UserDao.class);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}

	}
}
