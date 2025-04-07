package com.lu.service.impl;

import com.lu.entity.BeanEntity;
import com.lu.service.AService;
import com.lu.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl implements BService {

	@Autowired
	private AService aService;

	@Override
	public BeanEntity getBean() {
		System.out.println(aService.getUser());
		return null;
	}
}
