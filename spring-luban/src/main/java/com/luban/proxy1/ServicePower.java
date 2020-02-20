package com.luban.proxy1;

import com.luban.services.Service;

public class ServicePower implements Service {

	public ServicePower(Service service){
		this.target=service;
	}

	Service target;
	@Override
	public void query() {
		System.out.println("power");
		target.query();

	}


}
