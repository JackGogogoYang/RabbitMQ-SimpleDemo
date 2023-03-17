package com.huha.rabbitmq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @description:
 * @author: HUHA
 * @time: 2023-03-17 11:10
 */
public class SpringQueueListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        // 打印消息
        System.out.println(new String(message.getBody()));
    }
}
