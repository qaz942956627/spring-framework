package com.lu.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Autowired
	private BeanEntity beanEntity;

	private String name;

	private Integer age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public BeanEntity getBean() {
		return beanEntity;
	}

	public void setBean(BeanEntity beanEntity) {
		this.beanEntity = beanEntity;
	}
}
