package com.huha.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @description:
 * @author: HUHA
 * @time: 2023-03-10 16:05
 */
public class InitCon {
    public static ConnectionFactory factory = null;
    public static Connection connection = null;
    public static Channel channel = null;

    public String InitRabbitMQCon() throws IOException, TimeoutException {
        //1.创建连接工厂
        factory = new ConnectionFactory();
        //2. 设置参数
        factory.setHost("192.168.1.99");//ip  默认值 localhost
        factory.setPort(5672); //端口  默认值 5672
        factory.setVirtualHost("huhasvirtual");//虚拟机 默认值/
        factory.setUsername("huha");//用户名 默认 guest
        factory.setPassword("123456");//密码 默认值 guest
        //3. 创建连接 Connection
        connection = factory.newConnection();
        //4. 创建Channel
        channel = connection.createChannel();
        return "";
    }
}
