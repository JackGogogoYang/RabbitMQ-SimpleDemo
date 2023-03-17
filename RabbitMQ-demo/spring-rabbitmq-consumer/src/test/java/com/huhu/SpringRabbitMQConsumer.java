package com.huhu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: HUHA
 * @time: 2023-03-17 11:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-consumer.xml")
public class SpringRabbitMQConsumer {
    @Test
    public void test(){
        // 这里通过测试方法不停止运行，来使消费者的监听程序一直运行，实现一直监听消息
        while (true){

        }
    }
}
