package com.lu.config;

import com.lu.entity.BeanEntity;
import com.lu.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ComponentScan("com.lu")
@Configuration
public class DemoConfig {


//	@Bean
//	public User user() {
//		User user = new User();
//		user.setName("lu");
//		user.setAge(18);
////		user.setBean(bean());
//		return user;
//	}
//
//	@Bean
//	public BeanEntity bean() {
//		BeanEntity bean = new BeanEntity();
//		bean.setName("bean");
////		bean.setUser(user());
//		return bean;
//	}
}
