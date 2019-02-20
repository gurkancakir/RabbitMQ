package com.gurkan.Rabbitmqtest;

import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;

import org.apache.commons.lang.SerializationUtils;


/**
 * The producer endpoint that writes to the queue.
 * @author gurkan.cakir
 *
 */
public class Producer extends EndPoint{
	
	public Producer(String endPointName) throws IOException, TimeoutException{
		super(endPointName);
	}

	public void sendMessage(Serializable object) throws IOException {
	    channel.basicPublish("", endPointName, null, SerializationUtils.serialize(object));
	}	
}