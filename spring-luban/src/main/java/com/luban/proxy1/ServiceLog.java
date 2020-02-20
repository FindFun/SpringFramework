package com.luban.proxy1;

import com.luban.services.Service;

/**
 * 静态代理：聚合的形式
 * 1）、必须跟父类实现同一接口
 * 2）、必须创建一个接口对象，用于接收传入的对象
 *
 * //new的对象是父类，将父类传入，交给子类的接口对象，
 * //然后子类执行自己的query方法，后调用父类的query，实现代理
 * Service proxy = new ServiceLog(new IndexService);
 * proxy.query();
 *
 * 如果需要打印log，power，logic
 * 那么这样调用：
 * Service target = new ServicePower(new IndexService());
 * 此时传入的target里面包含了子类的power，父类的logic，作为对象传参
 * Service proxy = new ServicePower(target);
 * 此时获取的proxy里面包含了，power，logic，这个时候先调用子类的
 * query执行的log，然后power，logic
 * proxy.query();
 */
public class ServiceLog implements Service {
	Service target;

	public ServiceLog(Service service){
		this.target=service;
	}


	@Override
	public void query() {
		System.out.println("log");
		target.query();

	}


}
