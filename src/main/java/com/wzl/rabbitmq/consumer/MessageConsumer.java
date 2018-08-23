package com.wzl.rabbitmq.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

import com.rabbitmq.client.Channel;

public class MessageConsumer implements ChannelAwareMessageListener {
	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		try {
			System.out.println("consumer receive message------->:{}" + message);
			Thread.sleep(200*1000);
		} catch (InterruptedException e) {
			throw e;
		} finally {
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		}
	}
	
	
}
