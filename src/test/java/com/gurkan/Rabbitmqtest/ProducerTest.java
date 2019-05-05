package com.gurkan.Rabbitmqtest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import com.google.gson.JsonObject;

public class ProducerTest {
	
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception{
		Producer producer = new Producer("log-messages");

		for (int i = 0; i < 100; i++) {
			HashMap message = new HashMap();
			message.put("message number", i);
			// Create new JSON Object
			JsonObject person = new JsonObject();
			person.addProperty("id", i);
			person.addProperty("test", "Gurkan");
			producer.sendMessage(person.toString());
			System.out.println("Message Number "+ i +" sent.");
		}
	}
}
