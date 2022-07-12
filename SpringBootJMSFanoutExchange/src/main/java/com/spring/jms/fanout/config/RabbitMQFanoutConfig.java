package com.spring.jms.fanout.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQFanoutConfig {

	@Bean
	Queue retailService1() {
		return new Queue("retailService1", false);
	}

	@Bean
	Queue retailService2() {
		return new Queue("retailService2", false);
	}

	@Bean
	Queue retailService3() {
		return new Queue("retailService3", false);
	}

	@Bean
	FanoutExchange exchange() {
		return new FanoutExchange("fanout-exchange");
	}

	@Bean
	Binding retailService1Binding(Queue retailService1, FanoutExchange exchange) {
		return BindingBuilder.bind(retailService1).to(exchange);
	}

	@Bean
	Binding retailService2Binding(Queue retailService2, FanoutExchange exchange) {
		return BindingBuilder.bind(retailService2).to(exchange);
	}

	@Bean
	Binding retailService3Binding(Queue retailService3, FanoutExchange exchange) {
		return BindingBuilder.bind(retailService3).to(exchange);
	}

}
