package com.sudu.rmi.common;

import com.sudu.rmi.common.bean.Permission;

public interface IPermissionService {

	
	Permission getPermissionByName(String pName);
}
