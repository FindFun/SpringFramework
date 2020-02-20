package com.luban.proxy;

public class IndexServiceProxyPowerLog extends IndexServiceProxyPower {
	@Override
	public void query() {
		System.out.println("start log");

		//目标对象的逻辑
		super.query();
	}
}
