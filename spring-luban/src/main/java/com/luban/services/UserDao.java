package com.luban.services;

import org.apache.ibatis.annotations.Select;

public interface UserDao {

	@Select("select * from  xxxx")
	public void query();
}
