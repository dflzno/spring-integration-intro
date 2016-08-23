package com.geekcap.springintegrationexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements GreeterService {

	@Autowired
	private MessageChannel helloWorldChannel;

	@Autowired
	private HelloService helloWorldGateway;
	
	@Autowired
	private HelloService helloServiceImpl;

	@Override
	public void greet(String name) {
		helloWorldChannel.send(MessageBuilder.withPayload(name).build());
	}

	@Override
	public void greet2(String name) {
		/* 
		 * helloWorldGateway turns out to be an AOP Proxy (gateway proxy for service interface
		 * [interface com.geekcap.springintegrationexample.service.HelloService]), 
		 * and helloServiceImpl is a regular Bean (com.geekcap.springintegrationexample.service.HelloServiceImpl).
		 * However, I still don't see the use on the proxy approach, will check later.
		 */
		System.out.println(helloWorldGateway.getHelloMessage(name)); 
		System.out.println(helloServiceImpl.getHelloMessage(name) + "[From Regular Bean]");
	}
}
