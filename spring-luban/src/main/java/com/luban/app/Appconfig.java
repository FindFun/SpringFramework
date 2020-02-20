package com.luban.app;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.luban")
//@ImportResource("classpath:spring.xml")
public class Appconfig {































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
