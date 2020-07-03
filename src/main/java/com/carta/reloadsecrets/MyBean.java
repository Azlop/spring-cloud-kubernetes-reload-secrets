package com.carta.reloadsecrets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBean.class);
	
	@Autowired
	private MySecret mySecret;
	
	@Scheduled(fixedDelay = 3000)
	public void printPassword() {
		LOGGER.debug("The password is: {}", mySecret.getPassword());
	}
}