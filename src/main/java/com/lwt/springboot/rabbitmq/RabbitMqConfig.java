package com.lwt.springboot.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitMqConfig {
	private static String EXCHANGE_NAME="TestRabbitmq";
    //声明两个队列
  @Bean
  public Queue queue(){
      return new Queue("TestRabbitmq1");
  }

  @Bean
  public Queue queue1(){
      return new Queue("TestRabbitmq2");
  }
  //声明一个fanout的交换机
  @Bean
  public FanoutExchange fanoutExchange(){
      return new FanoutExchange(EXCHANGE_NAME);//配置广播路由器   
  }
  //将队列和交互机进行绑定
  @Bean
  public Binding bindfanout(Queue queue,FanoutExchange fanoutExchange){
      return BindingBuilder.bind(queue).to(fanoutExchange);

  }

  @Bean
  public Binding bindfanout1(Queue queue1,FanoutExchange fanoutExchange){
      return BindingBuilder.bind(queue1).to(fanoutExchange);

  }
}
