package com.shadow;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther Jack
 * @create 2020-02-14-3:15
 */
@Configuration //加完之后变成一个代理类Appconfig,保证bean实例化为单例
@ComponentScan("com.shadow")
public class Appconfig {


	/**
	 *唯一关联了一个 Source 对象，此时对象TestService为注入的形式，需要提供get，set方法
	 */
	private TestService source = null;

	public String makeJuice(){
		String juice = "xxx用户点了一杯" + source.getFruit() + source.getSugar() + source.getSize();
		return juice;

	}


	/**
	 * 提供get方法，匹配xml文件
	 * @return
	 */
	public TestService getSource() {
		return source;
	}


	public void setSource(TestService source) {
		this.source = source;
	}
}
