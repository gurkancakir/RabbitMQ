package com.gurkan.Rabbitmqtest;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConsumerTest {

    public static void main(String[] args) throws IOException, TimeoutException {

        QueueConsumer consumer = new QueueConsumer("log-messages");
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
    }
}
