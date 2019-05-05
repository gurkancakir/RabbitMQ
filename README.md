# RabbitMQTest

## Consumer
```java
    QueueConsumer consumer = new QueueConsumer("log-messages");
    Thread consumerThread = new Thread(consumer);
    consumerThread.start();
```

## Producer
```java
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
```