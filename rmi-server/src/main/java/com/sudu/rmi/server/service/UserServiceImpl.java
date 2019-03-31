package com.sudu.rmi.server.service;

import org.springframework.stereotype.Service;

import com.sudu.rmi.common.IUserService;
import com.sudu.rmi.common.bean.User;

@Service
public class UserServiceImpl implements IUserService {

	@Override
	public User getUserByName(String username) {
		User user = null;
		if (username != null && !username.equals("")) {
			user = new User();
			if (username.equals("admin")) {
				user.setUsername("admin");
				user.setPassword("123456");
			}else{
				user.setUsername("xxxx");
				user.setPassword("111111");
			}
			
		}
		return user;
	}

}
