package com.lu;

import com.lu.config.DemoConfig;
import com.lu.entity.BeanEntity;
import com.lu.entity.User;
import com.lu.service.AService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		User user = context.getBean(User.class);
		BeanEntity bean = context.getBean(BeanEntity.class);
		AService aService = context.getBean(AService.class);
		System.out.println(aService.getUser());
		System.out.println(bean.getName());
		System.out.println(user.getName());
		System.out.println("Hello world!");
	}
}