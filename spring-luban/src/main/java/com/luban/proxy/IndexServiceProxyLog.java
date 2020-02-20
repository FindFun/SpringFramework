package com.luban.proxy;

import com.luban.services.IndexService;

/**
 * 代理有哪几种方式方案
 * 1）、动态代理：目前市面上jdk动态，cjlib
 * 2）、静态代理：继承，聚合
 */
public class IndexServiceProxyLog extends IndexService {
	@Override
	public void query() {
		System.out.println("start log");
		//目标对象的逻辑
		super.query();
	}
}
