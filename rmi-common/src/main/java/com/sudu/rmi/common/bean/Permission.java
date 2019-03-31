package com.sudu.rmi.common.bean;

import java.io.Serializable;

public class Permission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3628385215556564613L;
	
	private String pName;
	private String urlPattern;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getUrlPattern() {
		return urlPattern;
	}
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	
	
}
