package com.facebook.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.dao.IRegisterDao;
import com.facebook.pojo.User;

@Service
public class RegisterImpl {

	@Autowired
	IRegisterDao dao;
	public void saveUser(User user) {
		dao.save(user);
		
	}
}
