package com.luban.batis;

import com.luban.services.UserDao;

/**
 * @auther Jack
 * @create 2020-02-20-17:32
 */
public class TempProxy implements UserDao {

	@Override
	public void query() {

		/**可以这么理解，最后返回的o是TempProxy对象，这个对象的query方法，写在了LubanInvocationHandler这个类里面，
		 * 要实现InvocationHandler这个接口。然后里面的invoke方法，就是我们query要改写的内容方法。
		 *
		 *伪代码：LubanInvocationHandler.invoke();
		 *
		 */


	}

	@Override
	public void query2() {

	}
}
