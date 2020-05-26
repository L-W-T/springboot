package com.lwt.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "topic.message")
public class ConsumerService1 {
	@RabbitHandler 
    public void receive(String message) throws InterruptedException{

        System.err.println("收到消息1"+message);

    }
}
