package com.luban.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService {
	@Autowired
	IndexService indexService;

	public UserService(){
		System.out.println("Constructor user");
	}


	public IndexService getIndexService() {
		return indexService;
	}
}
