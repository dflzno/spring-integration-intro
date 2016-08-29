package com.geekcap.springintegrationexample.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.geekcap.springintegrationexample.model.Message;

/**
 * Created with IntelliJ IDEA. User: shaines Date: 10/23/13 Time: 11:53 AM To
 * change this template use File | Settings | File Templates.
 */
public class PublishServiceImplTest {
	private static ApplicationContext applicationContext;
	private PublishService publishService;

	@BeforeClass
	public static void setupClass() {

		applicationContext = new FileSystemXmlApplicationContext(
				"src/main/webapp/WEB-INF/springintegrationexample-servlet.xml");
	}

	@Before
	public void setup() {
		publishService = applicationContext.getBean("publishServiceImpl", PublishServiceImpl.class);
	}

	@Test
	public void testSuccessfulSend() {
		publishService.send(new Message("Test System", Message.MessageType.CREATE, "This is my message"));
	}
}
