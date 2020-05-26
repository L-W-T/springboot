package com.lwt.springboot.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProducerService {
	private static String EXCHANGE_NAME="TestRabbitmqTopic";
	@Autowired
	AmqpTemplate atl;
	@RequestMapping("/testProducerService")
	@ResponseBody
	public void testProducerService(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++){
            Thread.sleep(i*10);
            if(i%2==0) {
            	atl.convertAndSend(EXCHANGE_NAME,"topic.message","hello word"+i);
            }else {
            	atl.convertAndSend(EXCHANGE_NAME,"topic.messages","hello word"+i);
            }
        }
		System.err.println("消息发送成功");
	}
}
