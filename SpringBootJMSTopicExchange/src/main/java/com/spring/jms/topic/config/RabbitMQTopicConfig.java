package com.spring.jms.topic.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQTopicConfig {

	@Bean
	Queue client1() {
		return new Queue("client1", false);
	}

	@Bean
	Queue client2() {
		return new Queue("client2", false);
	}

	
	@Bean
	Queue client3() {
		return new Queue("client3", false);
	}
	
	@Bean
	Queue allQueue() {
		return new Queue("allQueue", false);
	}
	

	@Bean
	TopicExchange topicExchange() {
		return new TopicExchange("topic-exchange");
	}

	@Bean
	Binding client1Binding(Queue client1, TopicExchange topicExchange) {
		return BindingBuilder.bind(client1).to(topicExchange).with("queue.client1");
	}
	
	@Bean
	Binding client2Binding(Queue client2, TopicExchange topicExchange) {
		return BindingBuilder.bind(client2).to(topicExchange).with("queue.client2");
	}
	
	@Bean
	Binding client3Binding(Queue client3, TopicExchange topicExchange) {
		return BindingBuilder.bind(client3).to(topicExchange).with("queue.client3");
	}
	
	@Bean
	Binding allBinding(Queue allQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(allQueue).to(topicExchange).with("queue.*");
	}

}
