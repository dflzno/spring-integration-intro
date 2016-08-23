package com.geekcap.springintegrationexample.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import com.geekcap.springintegrationexample.model.Message;

@Service
public class PublishServiceImpl implements PublishService {
	
	private static final Logger logger = Logger.getLogger(PublishServiceImpl.class);

	@Autowired
	private MessageChannel topicChannel;

	@Override
	public void send(Message message) {
		logger.info("Sending message to message channel: " + message);
		topicChannel.send(MessageBuilder.withPayload(message.toString()).build());
	}
}
