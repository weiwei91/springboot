package com.example.springbootrabbitmq;

import com.example.springbootrabbitmq.service.AckSenderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmqApplicationTests {

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    public void contextLoads() {
    }
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired

    AckSenderService ackSenderService;


    @Test
    public void sendMsgs() {
        ackSenderService.send();
        //rabbitTemplate.convertAndSend("exchange.fanout","","你大爷还是你大爷");
    }

    @Test
    public void clareExchange() {
        amqpAdmin.declareExchange(new DirectExchange("交换机名"));
    }


}
