package com.carta.reloadsecrets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
	@Autowired
	private MyConfig myConfig;
	
	public void printPassword() {
		System.out.printf("The password is: {}", myConfig.getPassword());
	}
}
