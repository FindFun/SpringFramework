package com.luban.app;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;


@Configuration//加完之后变成一个代理类Appconfig,保证bean实例化为单例
@ComponentScan("com.luban")
//@ImportResource("classpath:spring.xml")
@Component
public class Appconfig {

	@Bean(name="entitlement")
	public Entitlement entitlement() {
		Entitlement ent= new Entitlement();
		ent.setName("Entitlement");
		ent.setTime(1);
		return ent;
	}

	@Bean(name="entitlement2")
	public Entitlement entitlement2() {
		Entitlement ent= new Entitlement();
		ent.setName("Entitlement2");
		ent.setTime(2);
		return ent;
	}





























//	@Bean
//	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		return sqlSessionFactoryBean;
//	}
//
//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		driverManagerDataSource.setUrl("jdbc:mysql://47.94.158.155:3306/test");
//		driverManagerDataSource.setUsername("root");
//		driverManagerDataSource.setPassword("aq1sw2de");
//		return driverManagerDataSource;
//	}

//	@Bean
//	public TDao tDao(){
//		Class<?>[] interfaces = new Class[]{TDao.class};
//		TDao tDao = (TDao) Proxy.newProxyInstance(BatisUtil.class.getClassLoader(),interfaces,new LubanInvocationHandler());
//		return tDao;
//	}





}
