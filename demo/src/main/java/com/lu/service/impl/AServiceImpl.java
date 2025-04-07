package com.lu.service.impl;

import com.lu.entity.User;
import com.lu.service.AService;
import com.lu.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class AServiceImpl implements AService {

	@Lazy
	@Autowired
	private BService bService;


	@Override
	public User getUser() {
		System.out.println(bService.getBean());
		return null;
	}
}
