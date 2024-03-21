package com.nhnacademy.shop.issuer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageIssuer {

    @RabbitListener(queues = "RABBIT_TEST")
    public void receiveMessage(String port) {
        // todo: implements saving coupon-user data in here
        System.out.println("port: " + port);
    }
}
