package com.sudu.rmi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.sudu.rmi.client.RmiBootClient;
import com.sudu.rmi.common.IUserService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=RmiBootClient.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class RmiTest {
	
	Gson gson = new Gson();

	@Autowired
	private IUserService userService;
	
	@Test
	public void getUser(){
		log.info("get user{}",gson.toJson(userService.getUserByName("admin")));
	}
}
