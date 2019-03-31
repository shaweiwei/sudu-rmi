package com.sudu.rmi.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.sudu.rmi.common.IUserService;

@SpringBootApplication
public class RmiBootClient {
	
	@Bean
	public RmiProxyFactoryBean rmiProxyFactoryBean(){
		RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
		rmiProxyFactoryBean.setServiceUrl("rmi://127.0.0.1:2002/userService");
		rmiProxyFactoryBean.setServiceInterface(IUserService.class);
		return rmiProxyFactoryBean;
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RmiBootClient.class, args);
	}
}
