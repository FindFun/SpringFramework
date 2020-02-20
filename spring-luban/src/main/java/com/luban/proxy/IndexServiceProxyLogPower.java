package com.luban.proxy;

import com.luban.services.IndexService;

public class IndexServiceProxyLogPower extends IndexServiceProxyLog {
	@Override
	public void query() {
		System.out.println("start power");

		//目标对象的逻辑
		super.query();
	}
}
