package com.springboot.basics.FirstSpringbootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FirstSpringbootAppApplication {
	
	private static Logger logger = LoggerFactory.getLogger(FirstSpringbootAppApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootAppApplication.class, args);
		logger.error("An ERROR Message.");
		logger.warn("A WARN Message.");
		logger.info("An INFO Message.");
		logger.debug("A DEBUG Message.");
		logger.trace("A TRACE Message.");
	}

}
