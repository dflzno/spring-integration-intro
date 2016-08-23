package com.geekcap.springintegrationexample.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.geekcap.springintegrationexample.service.GreeterService;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

		GreeterService greeterService = applicationContext.getBean("greeterServiceImpl", GreeterService.class);

		greeterService.greet("Spring Integration!");

		greeterService.greet2("Spring Integration (with response)!");

		applicationContext.close();
	}
}
