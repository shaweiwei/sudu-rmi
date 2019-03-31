package com.sudu.rmi.common;

import com.sudu.rmi.common.bean.User;

public interface IUserService {

	User getUserByName(String username);
	
}
